import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarLista {

	public static void main(String[] args) {
		List<Estudiante> estudiante = new ArrayList<>();

		estudiante.add(new Estudiante("Ana", 1));
		estudiante.add(new Estudiante("Bea", 3));
		estudiante.add(new Estudiante("Carla", 2));
		estudiante.add(new Estudiante("Jacinto", 7));
		estudiante.add(new Estudiante("Ezequiel", 4));
		System.out.println("Productos antes de ordenar:");
		for (Estudiante e : estudiante) {
			System.out.println(e);
		}
		Collections.sort(estudiante);
		System.out.println("\nProductos después de ordenar:");
		for (Estudiante e : estudiante) {
			System.out.println(e);
		}
	}

}
