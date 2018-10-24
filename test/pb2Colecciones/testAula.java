package pb2Colecciones;

import org.junit.Test;
import ar.edu.unlam.Colecciones.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class testAula {

	// ArrayList<Alumno> otraLista = Aula.getListaAlumnos();

	@Test
	public void testAula() {

		Alumno alumno1 = new Alumno("Lucas", "Lacqua", 40674891);
		Aula aula1 = new Aula(2);

		aula1.agregar(alumno1);

		assertTrue(aula1.getListaAlumno().contains(alumno1));
	}

	@Test
	public void testAula2() {

		Alumno alumno1 = new Alumno("Lucas", "Lacqua", 40674891);
		Aula aula1 = new Aula(20);

		aula1.eliminar(alumno1);

		assertFalse(aula1.getListaAlumno().contains(alumno1));
	}

	@Test
	public void testAula3() {

		Alumno alumno1 = new Alumno("Roberto", "Perez", 123456789);
		Alumno alumno2 = new Alumno("Lucas", "Lacqua", 40674891);
		Alumno alumno3 = new Alumno("Benja", "Selser", 123124125);

		Aula aula1 = new Aula(2);

		aula1.agregar(alumno1);
		aula1.agregar(alumno2);
		aula1.agregar(alumno3);

		assertFalse(aula1.getListaAlumno().contains(alumno3));
	}

	@Test
	public void testAula4() {

		Alumno alumno2 = new Alumno("Lucas", "Lacqua", 40674891);

		Aula aula1 = new Aula(2);

		aula1.agregar(alumno2);

		assertEquals(alumno2, aula1.consultar("40674891"));
	}

	@Test
	public void testAula5() {

		Alumno alumno2 = new Alumno("Lucas", "Lacqua", 40674891);
		Alumno alumno1 = new Alumno("Roberto", "Perez", 12312312);

		Aula aula1 = new Aula(5);

		aula1.agregar(alumno2);

		aula1.modificar("40674891", alumno1);

		assertEquals("Roberto", alumno2.getNombre());
		assertEquals("Perez", alumno2.getApellido());

	}

	@Test
	public void testAula6() {

		Alumno alumno1 = new Alumno("Roberto", "Perez", 123456789);
		Alumno alumno2 = new Alumno("Lucas", "Lacqua", 40674891);
		Alumno alumno3 = new Alumno("Benja", "Selser", 123124125);
		Alumno alumno4 = new Alumno("Agustin", "Agus", 123456333);

		Aula aula1 = new Aula(5);

		aula1.agregar(alumno1);
		aula1.agregar(alumno2);
		aula1.agregar(alumno3);
		aula1.agregar(alumno4);

		SortedMap<String, Alumno> treeMap = new TreeMap<String, Alumno>();

		for (Alumno id : aula1.getListaAlumno()) {

			treeMap.put(id.getApellido(), id);

		}

		for (Entry<String, Alumno> entry : treeMap.entrySet()) {

			String key = entry.getKey();
			Alumno value = entry.getValue();

			System.out.println("Key: " + key + ". Value: " + value);
		}

		Integer valorObtenido = treeMap.size();
		Integer valorEsperado = 4;

		assertEquals(valorEsperado, valorObtenido);
	}
	
	
}
