package lectura.espe;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import com.csvreader.*;
public class MetodoArchivo {

		public void guarda( String dato,String ruta)
		{
			boolean alreadyExists = new File(ruta).exists();
			try
			{			
				CsvWriter csvOutput = new CsvWriter(ruta);
				csvOutput.write(dato);
				csvOutput.endRecord();
				csvOutput.close();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		void Buscar(String busca,String ruta)
		{
			String palabra,dato3;
			String llena[]=new String[4];
			int i=0,j=0;
				try
				{
					CsvReader documento = new CsvReader(ruta);
					while(documento.readRecord())
					{
						if(ruta.equals("Cliente.csv")==true)
						
						{
							Cliente [] cliente=new Cliente[10];
							palabra=documento.get(i);
							StringTokenizer st = new StringTokenizer (palabra,";");
							while (st.hasMoreTokens())
					          {
					              palabra = st.nextToken();
					              llena[j]=palabra;
					              j++;
				              }
							cliente[i]=new Cliente(llena[0],llena[1], llena[2], llena[3]);
							if(cliente[i].getId().equals(busca))
							{
								System.out.println("Dato encontrado nombre "+cliente[i].getNombre());
								return;
							}
							i++;
						}
						else
						{
							Empleado [] empleado=new Empleado[10];
							palabra=documento.get(i);
							StringTokenizer st = new StringTokenizer (palabra,";");
							while (st.hasMoreTokens())
					          {
					              palabra = st.nextToken();
					              llena[j]=palabra;
					              j++;
				              }
							empleado[i]=new Empleado(llena[0],llena[1], llena[2], Float.parseFloat(llena[3]));
							if(empleado[i].getId().equals(busca))
							{
								System.out.println("Dato encontrado nombre "+empleado[i].getNombre());
								//return;
							}
							i++;
						}
					}
				}

				catch(Exception e)
				{
					e.printStackTrace();
				}
		}
}
