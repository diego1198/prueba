package lectura.espe;

import java.util.Date;

public class Empleado extends Persona {

	private float sueldo;
	public Empleado(String id, String Nombre, String fecha,float sueldo) {
		super(id, Nombre, fecha);
		this.sueldo=sueldo;
		// TODO Auto-generated constructor stub
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

}
