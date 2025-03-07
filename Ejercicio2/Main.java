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

		// SE CREAN DOS OBJETOS SCANNER PARA LEER ENTRADAS DEL USUARIO.
		Scanner st = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);

		// SE CREA UNA LISTA DE ALUMNOS Y SE AGREGAN TRES ALUMNOS INICIALES.
		List<Alumno> lista = new LinkedList<>();
		lista.add(new Alumno("Adam", "Fernandez", 23));
		lista.add(new Alumno("Bea", "Fernandez", 23));
		lista.add(new Alumno("Cleo", "Piccaso", 23));

		// INICIA EL CICLO PARA MANTENER EL MENÚ ABIERTO.
		do {
			// SE MUESTRAN LAS OPCIONES DEL MENÚ.
			System.out.println("1.Agrega Estudiante");
			System.out.println("2.Buscar Estudiante");
			System.out.println("3.Mostrar Estudiante");

			// SE LEE LA OPCIÓN ELEGIDA POR EL USUARIO.
			int flag = sn.nextInt();

			// SWITCH PARA MANEJAR LAS OPCIONES DEL MENÚ.
			switch (flag) {
			case 1:
				// SE PIDE EL NOMBRE, APELLIDO Y EDAD DEL ESTUDIANTE Y SE AGREGA A LA LISTA.
				System.out.println("\nCuale es nombre del Estudiante: ");
				String nombre = st.nextLine();
				System.out.println("\nCuale es apellido del Estudiante: ");
				String apellido = st.nextLine();
				System.out.println("\nCuale es la edad del Estudiante: ");
				int edad = sn.nextInt();
				Alumno a1 = new Alumno(nombre, apellido, edad);
				lista.add(a1); // SE AGREGA EL NUEVO ALUMNO A LA LISTA.
				break;

			case 2:
				// SE PERMITE AL USUARIO BUSCAR UN ALUMNO POR NOMBRE O APELLIDO.
				System.out.println("\n1.Buscar por nombre\n2.Buscar por apellido");
				int opcion = sn.nextInt();
				System.out.println("¿Cual es?");
				String dato = st.nextLine();
				for (Alumno alumno : lista) {
					if (opcion == 1) {
						// SE COMPARA EL NOMBRE DEL ALUMNO.
						if (alumno.getNombre().equalsIgnoreCase(dato)) {
							System.out.println(alumno); // MUESTRA EL ALUMNO SI SE ENCUENTRA.
						}
					} else if (opcion == 2) {
						// SE COMPARA EL APELLIDO DEL ALUMNO.
						if (alumno.getApellido().equalsIgnoreCase(dato)) {
							System.out.println(alumno); // MUESTRA EL ALUMNO SI SE ENCUENTRA.
						}
					} else {
						System.err.println("Numero fuera de rango"); // SE MANDA UN ERROR SI LA OPCIÓN NO ES VÁLIDA.
					}
				}
				break;

			case 3:
				// SE MUESTRAN TODOS LOS ALUMNOS EN LA LISTA.
				for (Alumno elementos : lista) {
					System.out.println(elementos);
				}
				break;
			}
		} while (true); // EL CICLO SE REPITE INFINITAMENTE HASTA QUE EL PROGRAMA SE DETENGA.
	}
}