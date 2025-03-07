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

		Scanner st = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		List<Tarea> lista = new ArrayList<>();
		lista.add(new Tarea("Sacar Basura"));
		lista.add(new Tarea("Estudiar"));
		lista.add(new Tarea("Bañarse"));

		do {
			System.out.println("\n1.Agrega tarea");
			System.out.println("2.Completa Tarea");
			System.out.println("3.Mostrar Tarea");
			System.out.println("4.Borrar Tareas Completadas");
			System.out.println("5.Cambiar nombre de la Tarea");
			int flag = sn.nextInt();
			switch (flag) {
			case 1:
				System.out.println("\nDime el nombre de la tarea: ");
				String nombre = st.nextLine();
				Tarea t1 = new Tarea(nombre);
				break;
			case 2:
				System.out.println("\nCual es nombre de la tarea que quieres completar: ");
				String completada = st.nextLine();
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
				System.out.println("\n1.Buscar por completada\n2.Buscar por no completada");
				int opcion = sn.nextInt();
				for (Tarea tarea : lista) {
					if (opcion == 1) {
						if (tarea.getEstado() == Estado.COMPLETADA) {
							System.out.println(tarea);
						}
					} else if (opcion == 2) {
						if (tarea.getEstado() == Estado.NO_COMPLETADA) {
							System.out.println(tarea);
						}
					}
				}
				break;
			case 4:
				Iterator<Tarea> iteratorDos = lista.iterator();
				while (iteratorDos.hasNext()) {
					Tarea tarea = iteratorDos.next();
					if (tarea.getEstado() == Estado.COMPLETADA) {
						iteratorDos.remove();
					}
				}
				break;
			case 5:
				System.out.println("\nCual es nombre de la tarea que quieres renombrar: ");
				String nombreTarea = st.nextLine();
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
		} while (true);

	}

}
