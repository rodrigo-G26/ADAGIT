
public class Persona implements Comparable<Persona>{

	String Nombre; 
	String Apellido;
	String Fecha;
	String Hora;
	public Persona(String nombre, String apellido, String fecha, String hora) {
		
		Nombre = nombre;
		Apellido = apellido;
		Fecha = fecha;
		Hora = hora; 
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public String getHora() {
		return Hora;
	}
	public void setHora(String hora) {
		Hora = hora;
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
		return Nombre + " " + Apellido + " " + Fecha + " " + Hora;
	}
	
	
}
