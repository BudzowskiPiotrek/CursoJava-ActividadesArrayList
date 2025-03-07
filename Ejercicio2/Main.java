import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Desarrolla un programa en Java que permita registrar estudiantes en una
		// clase. El programa debe permitir agregar estudiantes, buscar estudiantes por
		// nombre y mostrar todos los estudiantes registrados. Utiliza una LinkedList
		// para almacenar los estudiantes.

		Scanner st = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		List<Alumno> lista = new LinkedList<>();
		lista.add(new Alumno("Adam", "Fernandez", 23));
		lista.add(new Alumno("Bea", "Fernandez", 23));
		lista.add(new Alumno("Cleo", "Piccaso", 23));

		do {
			System.out.println("1.Agrega Estudiante");
			System.out.println("2.Buscar Estudiante");
			System.out.println("3.Mostrar Estudiante");
			int flag = sn.nextInt();
			switch (flag) {
			case 1:
				System.out.println("\nCuale es nombre del Estudiante: ");
				String nombre = st.nextLine();
				System.out.println("\nCuale es apellido del Estudiante: ");
				String apellido = st.nextLine();
				System.out.println("\nCuale es la edad del Estudiante: ");
				int edad = sn.nextInt();
				Alumno a1 = new Alumno(nombre, apellido, edad);
				lista.add(a1);
				break;
			case 2:
				System.out.println("\n1.Buscar por nombre\n2.Buscar por apellido");
				int opcion = sn.nextInt();
				System.out.println("¿Cual es?");
				String dato = st.nextLine();
				for (Alumno alumno : lista) {
					if (opcion == 1) {
						if (alumno.getNombre().equalsIgnoreCase(dato)) {
							System.out.println(alumno);
						}
					} else if (opcion == 2) {
						if (alumno.getApellido().equalsIgnoreCase(dato)) {
							System.out.println(alumno);
						}
					} else {
						System.err.println("Numero fuera de rango");
					}
				}
				break;
			case 3:
				for (Alumno elementos : lista) {
					System.out.println(elementos);
				}
				break;
			}

		} while (true);

	}

}
