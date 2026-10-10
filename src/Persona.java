
public class Persona implements Comparable<Persona>{

	String Nombre; 
	String Apellido;
	public Persona(String nombre, String apellido) {
		
		Nombre = nombre;
		Apellido = apellido;
	}
	public Persona() {
		
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Nombre + " " + Apellido;
	}
	
	
}
