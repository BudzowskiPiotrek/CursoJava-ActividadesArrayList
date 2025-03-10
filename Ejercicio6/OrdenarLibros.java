import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarLibros {
	public static void main(String[] args) {
		List<Libro> libro = new ArrayList<>();

		libro.add(new Libro("Pablo y Tico", "Nico", 12.30));
		libro.add(new Libro("Aviones y Tanques", "Paco", 14.50));
		libro.add(new Libro("Enigmas Sin Revolver", "Luiz", 11.00));
		libro.add(new Libro("Marea Negra", "Nico", 18.73));

		System.out.println("Productos antes de ordenar:");
		for (Libro l : libro) {
			System.out.println(l);
		}
		Collections.sort(libro);
		System.out.println("\nProductos después de ordenar:");
		for (Libro l : libro) {
			System.out.println(l);
		}
	}

}
