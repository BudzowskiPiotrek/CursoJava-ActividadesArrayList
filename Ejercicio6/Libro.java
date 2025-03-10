public class Libro implements Comparable<Libro> {
	private String titulo;
	private String autor;
	private double precio;

	public Libro(String titulo, String autor, double precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
		return Double.compare(o.precio, this.precio);
	}

	@Override
	public String toString() {
		return "titulo= " + titulo + ", autor= " + autor + ", precio= " + precio;
	}

}
