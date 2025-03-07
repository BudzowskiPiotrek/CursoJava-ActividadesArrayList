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

		Scanner st = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		List<String> lista = new ArrayList<>();

		do {
			System.out.println("1.Agrega productos");
			System.out.println("2.Borra productos");
			System.out.println("3.Mostrar productos");
			int flag = sn.nextInt();
			switch (flag) {
			case 1:
				System.out.println("\nQue Producto quieres agregar: ");
				String producto = st.nextLine();
				lista.add(producto);
				break;
			case 2:
				System.out.println("\nQue Producto quieres borrar: ");
				String borrar = st.nextLine();
				Iterator<String> iterator = lista.iterator();
				while (iterator.hasNext()) {
					String element = iterator.next();
					if (element.equals(borrar)) {
						iterator.remove();
					}
				}
				break;
			case 3:
				for (String elementos : lista) {
					System.out.println(elementos);
				}
				break;
			}

		} while (true);

	}

}
