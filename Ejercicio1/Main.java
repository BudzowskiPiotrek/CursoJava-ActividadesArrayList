import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Desarrolla un programa en Java que permita gestionar una lista de compras. El
		// programa debe permitir agregar productos, eliminar productos y mostrar todos
		// los productos de la lista. Utiliza una ArrayList para almacenar los
		// productos. Digamos que los productos son solo String.

		// SE CREAN DOS OBJETOS SCANNER PARA LEER ENTRADAS DEL USUARIO.
		Scanner st = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);

		// SE CREA UNA LISTA DE PRODUCTOS.
		List<String> lista = new ArrayList<>();

		// INICIA EL CICLO PARA MANTENER EL MENÚ ABIERTO.
		do {
			// SE MUESTRAN LAS OPCIONES DEL MENÚ.
			System.out.println("1.Agrega productos");
			System.out.println("2.Borra productos");
			System.out.println("3.Mostrar productos");

			// SE LEE LA OPCIÓN ELEGIDA POR EL USUARIO.
			int flag = sn.nextInt();

			// SWITCH PARA MANEJAR LAS OPCIONES DEL MENÚ.
			switch (flag) {
			case 1:
				// SE PIDE EL NOMBRE DEL PRODUCTO Y SE AGREGA A LA LISTA.
				System.out.println("\nQue Producto quieres agregar: ");
				String producto = st.nextLine();
				lista.add(producto); // SE AGREGA EL PRODUCTO A LA LISTA.
				break;

			case 2:
				// SE PIDE EL NOMBRE DEL PRODUCTO A ELIMINAR.
				System.out.println("\nQue Producto quieres borrar: ");
				String borrar = st.nextLine();
				Iterator<String> iterator = lista.iterator();
				while (iterator.hasNext()) {
					String element = iterator.next();
					if (element.equals(borrar)) {
						iterator.remove(); // SE ELIMINA EL PRODUCTO DE LA LISTA.
					}
				}
				break;

			case 3:
				// SE MUESTRAN TODOS LOS PRODUCTOS DE LA LISTA.
				for (String elementos : lista) {
					System.out.println(elementos);
				}
				break;
			}
		} while (true); // EL CICLO SE REPITE INFINITAMENTE HASTA QUE EL PROGRAMA SE DETENGA.
	}
}