import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import ejercicio3.Tarea;

public class Main {

	public static void main(String[] args) {
		// Desarrolla un programa en Java que permita gestionar el inventario de una
		// tienda. El programa debe permitir agregar productos, eliminar productos,
		// buscar productos por nombre y mostrar todos los productos del inventario.
		// Cada producto debe tener un nombre, una categoría y un precio. Utiliza una
		// LinkedList para almacenar los productos.

		// SE CREAN DOS OBJETOS SCANNER PARA LEER ENTRADAS DEL USUARIO.
		Scanner st = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);

		// SE INICIALIZA UNA LISTA DE PRODUCTOS Y SE AGREGAN TRES PRODUCTOS POR DEFECTO.
		List<Producto> lista = new LinkedList<>();
		lista.add(new Producto("Escoba", "Limpieza", 10.23));
		lista.add(new Producto("FryFry", "Limpieza", 2.00));
		lista.add(new Producto("Champu", "Limpieza", 3.25));

		// INICIA EL CICLO PARA MANTENER EL MENÚ ABIERTO.
		do {
			// SE MUESTRAN LAS OPCIONES DEL MENÚ.
			System.out.println("\n1.Agrega los Producto");
			System.out.println("2.Eliminar los Producto");
			System.out.println("3.Buscar los Producto");
			System.out.println("4.Mostrar todos los Productos");

			// SE LEE LA OPCIÓN ELEGIDA POR EL USUARIO.
			int flag = sn.nextInt();

			// SWITCH QUE EJECUTA EL CÓDIGO SEGÚN LA OPCIÓN ELEGIDA.
			switch (flag) {
			case 1:
				// SE PIDE EL NOMBRE, CATEGORÍA Y PRECIO DEL PRODUCTO, Y SE AGREGA A LA LISTA.
				System.out.println("\nDime el nombre del producto: ");
				String nombre = st.nextLine();
				System.out.println("Dime la Categoria del producto: ");
				String categoria = st.nextLine();
				System.out.println("dime el precio del producto: ");
				double precio = sn.nextDouble();
				Producto p1 = new Producto(nombre, categoria, precio);
				lista.add(p1);
				break;

			case 2:
				// SE PIDE EL NOMBRE DEL PRODUCTO A ELIMINAR Y SE ELIMINA DE LA LISTA.
				System.out.println("Que producto quieres borrar: ");
				String borrar = st.nextLine();
				Iterator<Producto> i1 = lista.iterator();
				while (i1.hasNext()) {
					Producto producto = i1.next();
					if (producto.getNombre().equalsIgnoreCase(borrar)) {
						i1.remove();
					}
				}
				break;

			case 3:
				// SE PIDE EL NOMBRE DEL PRODUCTO A BUSCAR Y SE MUESTRAN LOS PRODUCTOS QUE
				// COINCIDAN.
				System.out.println("Dime nombre del Producto: ");
				String buscar = st.nextLine();
				for (Producto producto : lista) {
					if (producto.getNombre().equalsIgnoreCase(buscar)) {
						System.out.println(producto);
					}
				}
				break;

			case 4:
				// SE MUESTRAN TODOS LOS PRODUCTOS DE LA LISTA.
				for (Producto producto : lista) {
					System.out.println(producto);
				}
				break;
			}

		} while (true); // EL CICLO SE REPITE INFINITAMENTE HASTA QUE EL PROGRAMA SE DETENGA.
	}
}