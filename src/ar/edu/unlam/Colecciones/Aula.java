package ar.edu.unlam.Colecciones;

import java.util.ArrayList;

public class Aula {

	private Integer cantidadAlumnos;
	private ArrayList<Alumno> listaAlumno;

	public Aula(Integer cantidadAlumnos) {

		this.cantidadAlumnos = cantidadAlumnos;
		
		listaAlumno = new ArrayList<Alumno>();
	}

	public Boolean agregar(Alumno alumno) {

		if (listaAlumno.size() < this.cantidadAlumnos) {
			return listaAlumno.add(alumno);
		} else {
			return false;
		}
	}

	public Boolean eliminar(Alumno alumno) {

		return listaAlumno.remove(alumno);
	}

	public Boolean modificar(String dni, Alumno alumno) {
		
		for (Alumno id : listaAlumno) {
			
			if (id.getDni().equals(dni)) {
				
				id.setApellido(alumno.getApellido());
				id.setNombre(alumno.getNombre());
				
				return true;
			}
		}
		return false;
	}
	
	public Alumno consultar(Integer dni) {
		
		for (Alumno id : listaAlumno) {
			
			if (id.getDni().equals(dni)) {
				
				return id;
			}	
		}
		return null;
	}
	
	public Integer cantidadAlumnosEnElAula() {
		
		return listaAlumno.size();
		
	}
	
	public Integer getCantidadAlumnos() {
		return cantidadAlumnos;
	}

	public void setCantidadAlumnos(Integer cantidadAlumnos) {
		this.cantidadAlumnos = cantidadAlumnos;
	}

	public ArrayList<Alumno> getListaAlumno() {
		return listaAlumno;
	}

	public void setListaAlumno(ArrayList<Alumno> listaAlumno) {
		this.listaAlumno = listaAlumno;
	}

}
 