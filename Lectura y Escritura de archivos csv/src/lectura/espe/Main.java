package lectura.espe;

import java.util.Date;

public class Main {
	public static void main(String []args)
	{
		Cliente cliente=new Cliente("1", "Juan","1207/2017" , "Sangolqui");
		Empleado empleado=new Empleado("2", "Maria","1207/2017" , 200);
		cliente.Guarda(cliente.getDireccion(), "Cliente.csv");
		empleado.Guarda(empleado.getSueldo()+"", "Empleado.csv");
		cliente.Busca("1", "Cliente.csv");
		empleado.Busca("2","Empleado.csv");
	}

}
