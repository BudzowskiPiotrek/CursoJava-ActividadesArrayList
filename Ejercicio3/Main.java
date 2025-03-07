import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ejercicio2.Alumno;

public class Main {

	public static void main(String[] args) {
		// Desarrolla un programa en Java que permita gestionar tareas pendientes. El
		// programa debe permitir agregar tareas, marcar tareas como completadas y
		// mostrar todas las tareas indicando si están completadas o no. Deberemos poder
		// también eliminar todas las tareas completadas o modificar el nombre de una
		// tarea. Utiliza una ArrayList para almacenar las tareas. Las tareas tienen por
		// lo menos un nombre y un estado por lo que deberíamos crear la clase tareas.

		// SE CREAN DOS OBJETOS SCANNER PARA LEER ENTRADAS DEL USUARIO.
		Scanner st = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);

		// LISTA DE TAREAS, INICIALMENTE SE AGREGAN TRES TAREAS PREDERMINADAS.
		List<Tarea> lista = new ArrayList<>();
		lista.add(new Tarea("Sacar Basura"));
		lista.add(new Tarea("Estudiar"));
		lista.add(new Tarea("Bañarse"));

		// INICIA EL CICLO PARA MANTENER EL MENÚ ABIERTO.
		do {
			// SE MUESTRAN LAS OPCIONES DEL MENÚ.
			System.out.println("\n1.Agrega tarea");
			System.out.println("2.Completa Tarea");
			System.out.println("3.Mostrar Tarea");
			System.out.println("4.Borrar Tareas Completadas");
			System.out.println("5.Cambiar nombre de la Tarea");

			// SE LEE LA OPCIÓN ELEGIDA POR EL USUARIO.
			int flag = sn.nextInt();

			// SWITCH QUE EJECUTA EL CÓDIGO SEGÚN LA OPCIÓN ELEGIDA.
			switch (flag) {
			case 1:
				// SE PIDE EL NOMBRE DE LA NUEVA TAREA Y SE CREARÍA UNA NUEVA TAREA (FALTA
				// AGREGAR A LA LISTA).
				System.out.println("\nDime el nombre de la tarea: ");
				String nombre = st.nextLine();
				Tarea t1 = new Tarea(nombre);
				break;

			case 2:
				// SE PIDE EL NOMBRE DE LA TAREA A COMPLETAR Y SE CAMBIA SU ESTADO.
				System.out.println("\nCual es nombre de la tarea que quieres completar: ");
				String completada = st.nextLine();

				// SE RECORRE LA LISTA DE TAREAS PARA ENCONTRAR LA TAREA Y MARCARLA COMO
				// COMPLETADA.
				Iterator<Tarea> iterator = lista.iterator();
				while (iterator.hasNext()) {
					Tarea tarea = iterator.next();
					if (tarea.getNombre().equalsIgnoreCase(completada)) {
						tarea.completada();
						System.out.println("Tarea Completada");
					}
				}
				break;

			case 3:
				// SE PIDE AL USUARIO QUE ELIGA SI DESEA VER TAREAS COMPLETADAS O NO
				// COMPLETADAS.
				System.out.println("\n1.Buscar por completada\n2.Buscar por no completada");
				int opcion = sn.nextInt();

				// SE FILTRAN LAS TAREAS SEGÚN LA OPCIÓN ELEGIDA Y SE MUESTRAN.
				for (Tarea tarea : lista) {
					if (opcion == 1 && tarea.getEstado() == Estado.COMPLETADA) {
						System.out.println(tarea);
					} else if (opcion == 2 && tarea.getEstado() == Estado.NO_COMPLETADA) {
						System.out.println(tarea);
					}
				}
				break;

			case 4:
				// SE ELIMINAN LAS TAREAS QUE YA ESTÁN COMPLETADAS.
				Iterator<Tarea> iteratorDos = lista.iterator();
				while (iteratorDos.hasNext()) {
					Tarea tarea = iteratorDos.next();
					if (tarea.getEstado() == Estado.COMPLETADA) {
						iteratorDos.remove();
					}
				}
				break;

			case 5:
				// SE PIDE EL NOMBRE DE LA TAREA A RENOMBRAR Y SE CAMBIA SU NOMBRE.
				System.out.println("\nCual es nombre de la tarea que quieres renombrar: ");
				String nombreTarea = st.nextLine();

				// SE BUSCA LA TAREA Y SE CAMBIA SU NOMBRE SI SE ENCUENTRA.
				Iterator<Tarea> iteratorTres = lista.iterator();
				while (iteratorTres.hasNext()) {
					Tarea tarea = iteratorTres.next();
					if (tarea.getNombre().equalsIgnoreCase(nombreTarea)) {
						System.out.println("Tarea Encontrada, a que nombre la quieres renombrar: ");
						String nombreNuevo = st.nextLine();
						tarea.setNombre(nombreNuevo);
					}
				}
				break;
			}
		} while (true); // EL CICLO SE REPITE INFINITAMENTE HASTA QUE EL PROGRAMA SE DETENGA.
	}
}