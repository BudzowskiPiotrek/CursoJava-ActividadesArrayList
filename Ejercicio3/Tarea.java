public class Tarea {
	private String nombre;
	private Estado estado;

	public Tarea(String nombre) {
		this.nombre = nombre;
		this.estado = Estado.NO_COMPLETADA;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void completada() {
		this.estado = Estado.COMPLETADA;
	}

	@Override
	public String toString() {
		return "Nombre= " + nombre + ", Estado= " + estado;
	}

}
