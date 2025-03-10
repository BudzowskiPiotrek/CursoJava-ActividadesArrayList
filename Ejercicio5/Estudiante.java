public class Estudiante implements Comparable<Estudiante> {
	private String nombre;
	private int nota;

	public Estudiante(String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", nota=" + nota + "]";
	}

	@Override
	public int compareTo(Estudiante o) {
		// TODO Auto-generated method stub
		return Double.compare(this.nota, o.nota);
	}

}
