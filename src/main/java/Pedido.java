public class Pedido {

	private FamiliaProducto familiaProducto;
	private Producto producto;
	private int cantidad;
	private EstadoPedido estadoPedido;

	public FamiliaProducto getFamiliaProducto() {
		return this.familiaProducto;
	}

	/**
	 * 
	 * @param familiaProducto
	 */
	public void setFamiliaProducto(FamiliaProducto familiaProducto) {
		this.familiaProducto = familiaProducto;
	}

	public Producto getProducto() {
		return this.producto;
	}

	/**
	 * 
	 * @param producto
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	/**
	 * 
	 * @param cantidad
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public EstadoPedido getEstadoPedido() {
		return this.estadoPedido;
	}

	/**
	 * 
	 * @param estadoPedido
	 */
	public void setEstadoPedido(EstadoPedido estadoPedido) {
		this.estadoPedido = estadoPedido;
	}

	/**
	 * 
	 * @param familiaProducto
	 * @param producto
	 * @param cantidad
	 * @param estadoPedido
	 */
	public Pedido(FamiliaProducto familiaProducto, Producto producto, int cantidad, EstadoPedido estadoPedido) {
		// TODO - implement Pedido.Pedido
		throw new UnsupportedOperationException();
	}

}