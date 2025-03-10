import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarEmpleado {
	public static void main(String[] args) {

		List<Empleado> empleados = new ArrayList<>();

		empleados.add(new Empleado("Carlos", 2500.0, "TIKITAKA"));
		empleados.add(new Empleado("Ana", 3000.0, "POO"));
		empleados.add(new Empleado("Luis", 2500.0, "TI"));
		empleados.add(new Empleado("Bea", 2800.0, "ATP"));
		empleados.add(new Empleado("Dani", 3000.0, "IT"));

		System.out.println("Empleados antes de ordenar:");
		for (Empleado e : empleados) {
			System.out.println(e);
		}
		Collections.sort(empleados);

		System.out.println("Empleados después de ordenar:");
		for (Empleado e : empleados) {
			System.out.println(e);
		}
		
	}
}
