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
import java.util.TreeSet;
import java.util.Map.Entry;

public class testAulaTreeSet {

	@Test
	public void testAulaTreeSet1() {

		Alumno alumno1 = new Alumno("Lucas", "Lacquaniti", 406741);
		Alumno alumno2 = new Alumno("Roberto", "Perez", 12312);

		AulaTreeSet aula1 = new AulaTreeSet(10);

		aula1.agregar(alumno1);
		aula1.agregar(alumno2);

		Integer valorEsperado = 2;
		Integer valorObtenido = aula1.getListaAlumnosTS().size();

		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void testAulaTreeSet2() {

		Alumno alumno1 = new Alumno("Lucas", "Lacquaniti", 25);
		Alumno alumno2 = new Alumno("Roberto", "Perez", 47);
		Alumno alumno3 = new Alumno("Agus", "Rola", 95);

		AulaTreeSet aula1 = new AulaTreeSet(10);

		aula1.agregar(alumno1);
		aula1.agregar(alumno2);
		aula1.agregar(alumno3);

		TreeSet<Alumno> listaTest = aula1.getListaAlumnosTS();

		int x = 0;
		Integer anterior = 0;
		Integer actual = 0;

		for (Alumno id : listaTest) {

			if (x == 0) {

				x = 1;
				anterior = id.getDni();
			} else {

				actual = id.getDni();

				assertTrue((anterior < actual));
				anterior = actual;
			}

		}

	}
}
