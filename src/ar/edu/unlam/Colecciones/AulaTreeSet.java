package ar.edu.unlam.Colecciones;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeSet;

public class AulaTreeSet {
	
	
	private Integer cantidadDeAlumnos;
	private TreeSet<Alumno> listaAlumnosTS;
	
	public AulaTreeSet (Integer cantidadDeAlumnos) {
		
		this.cantidadDeAlumnos = cantidadDeAlumnos;
		
		 listaAlumnosTS = new TreeSet<Alumno>();
		
	}
	
	public Boolean agregar(Alumno alumno) {
		
		if(listaAlumnosTS.size() < this.cantidadDeAlumnos) {
			
			return listaAlumnosTS.add(alumno);
		}else {
			
			return false;
		}
	}

	public Integer getCantidadDeAlumnos() {
		return cantidadDeAlumnos;
	}

	public void setCantidadDeAlumnos(Integer cantidadDeAlumnos) {
		this.cantidadDeAlumnos = cantidadDeAlumnos;
	}

	public TreeSet<Alumno> getListaAlumnosTS() {
		return listaAlumnosTS;
	}

	public void setListaAlumnosTS(TreeSet<Alumno> listaAlumnosTS) {
		this.listaAlumnosTS = listaAlumnosTS;
	}
	
	
}
