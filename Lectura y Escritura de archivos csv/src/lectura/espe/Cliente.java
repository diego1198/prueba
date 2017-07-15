package lectura.espe;
import java.util.Date;
public class Cliente extends Persona {
	private String direccion;
	public Cliente (String id,String nombre,String fecha,String direccion)
	{
		super(id,nombre,fecha);
		this.direccion=direccion;
	}
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return direccion + " " + getDireccion() + " " + getId()
				+ " " + getNombre() + " " + getFecha() + " " + getClass()
				+ " " + hashCode() + " " + super.toString();
	}
	
}
