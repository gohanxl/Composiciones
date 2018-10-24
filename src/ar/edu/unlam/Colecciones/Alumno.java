package ar.edu.unlam.Colecciones;

public class Alumno implements Comparable<Alumno>{

	private String nombre;
	private String apellido;
	private Integer dni;
	
	
	public Alumno(String nombre, String apellido, Integer dni) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		
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


	public Integer getDni() {
		return dni;
	}


	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	@Override
    public int compareTo(Alumno o) {
        
        return this.dni.compareTo(o.getDni());
    }
	
}
