
public class Persona {
	
	private String nombre;
	private String apellido;
	private String fecha;
	private String hora;

	public Persona(String nombre, String apellido, String fecha, String hora) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha = fecha;
		this.hora = hora;
		
	}
	

	public Persona() {
	}


	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public String getHora() {
		return hora;
	}
	

	@Override
	public String toString() {
		return nombre + " " + apellido + " | " + fecha + " | " + hora;
	}

}
