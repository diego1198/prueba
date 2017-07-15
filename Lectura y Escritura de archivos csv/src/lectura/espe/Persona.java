package lectura.espe;

import java.util.Date;
import java.util.jar.Attributes.Name;

public class Persona {
	//Dependecia
	private MetodoArchivo archivo=new MetodoArchivo();
	private String id;
	private String nombre;
	private String fecha;
	public Persona(String id,String nombre,String fecha)
	{
		this.id=id;
		this.nombre=nombre;
		this.fecha=fecha;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public void Guarda(String dato,String ruta)
	{
		String dator=id+";"+nombre+";"+fecha.toString()+";"+dato;
		//archivo.guarda(id,nombre,fecha.toString(),dato, ruta);
		archivo.guarda(dator, ruta);
	}
	public void Busca(String busca,String ruta)
	{
		archivo.Buscar(busca, ruta);
	}

}
