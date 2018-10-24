package ar.edu.unlam.Colecciones;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapAlumno {

	public ArrayList<Alumno> listaAlumno;
	Alumno alumno1 = new Alumno("Roberto", "Perez", 123456789);
	Alumno alumno2 = new Alumno("Lucas", "Lacqua", 40674891);
	Alumno alumno3 = new Alumno("Benja", "Selser", 123124125);

	public TreeMapAlumno() {

		SortedMap<Integer, Alumno> treeMap = new TreeMap<Integer, Alumno>();

		for (Alumno id : listaAlumno) {

			treeMap.put(id.getDni(), id);

		}

		for (Entry<Integer, Alumno> entry : treeMap.entrySet()) {

			Integer key = entry.getKey();
			Alumno value = entry.getValue();

			System.out.println("Key: " + key + ". Value: " + value);
		}
	}
}
