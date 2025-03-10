public class Empleado implements Comparable<Empleado> {
	private String nombre;
	private double salario;
	private String departamento;

	public Empleado(String nombre, double salario, String departamento) {
		this.nombre = nombre;
		this.salario = salario;
		this.departamento = departamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public int compareTo(Empleado otro) {
		// PRIMERO, SE COMPARA POR SALARIO EN ORDEN ASCENDENTE
		int resultado = Double.compare(this.salario, otro.salario);
		// SI LOS SALARIOS SON IGUALES, SE ORDENA POR NOMBRE EN ORDEN ALFABÉTICO
		// == -1 ES MENOR QUE OTRO | +1 ES MAYOR QUE OTRO | 0 ES IGUAL QUE OTRO
		if (resultado == 0) {
			resultado = this.nombre.compareTo(otro.nombre);
		}
		return resultado;
	}

	@Override
	public String toString() {
		return "Nombre= " + nombre + ", salario= " + salario + ", departamento= " + departamento;
	}

}
