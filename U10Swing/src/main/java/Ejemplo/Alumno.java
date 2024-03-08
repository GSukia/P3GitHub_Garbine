package Ejemplo;


public class Alumno {
	private int coda;
	private String nombre, apellido;
	
	public Alumno(int coda, String nombre, String apellido) {
		this.coda = coda;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public int getCoda() {
		return coda;
	}

	public void setCoda(int coda) {
		this.coda = coda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Alumno [coda=" + coda + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
}
