public class FamiliaProducto {

	private String nombre;
	private Producto productoAsociado;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Producto getProductoAsociado() {
		return this.productoAsociado;
	}

	/**
	 * 
	 * @param productoAsociado
	 */
	public void setProductoAsociado(Producto productoAsociado) {
		this.productoAsociado = productoAsociado;
	}

}