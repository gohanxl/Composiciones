package pb2Colecciones;

import java.util.TreeSet;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ar.edu.unlam.Colecciones.Alumno;
import ar.edu.unlam.Colecciones.AlumnoPorApellido;
import ar.edu.unlam.Colecciones.AulaTreeSet;

public class TestComparator {

	@Test
	public void testCompareTo1() {

		Alumno alumno1 = new Alumno("Roberto", "Perez", 123456789);
		Alumno alumno2 = new Alumno("Lucas", "Lacqua", 40674891);
		Alumno alumno3 = new Alumno("Benja", "Selser", 123124125);
		Alumno alumno4 = new Alumno("Alejandro", "Lacquaniti", 123469345);

		AulaTreeSet aula1 = new AulaTreeSet(10);

		TreeSet<Alumno> nuevaLista = new TreeSet<Alumno>(new AlumnoPorApellido());

		aula1.setListaAlumnosTS(nuevaLista);
		
		aula1.agregar(alumno1);
		aula1.agregar(alumno2);
		aula1.agregar(alumno3);
		aula1.agregar(alumno4);

		for (Alumno id : nuevaLista) {

			nuevaLista.add(id);
			
			System.out.println(id.getNombre() + " -----------> " + id);
		}

		assertEquals(4, nuevaLista.size());
	}
}
// Esto va a ser tipo parcial, crear collecion, pasarla a otra.