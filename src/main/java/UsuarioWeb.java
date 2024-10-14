public class UsuarioWeb {

	private Cliente cliente;
	private EstadoUsuario estadoUsuario;
	private CarritoCompras carritoCompras;

	public Cliente getCliente() {
		return this.cliente;
	}

	/**
	 * 
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public EstadoUsuario getEstadoUsuario() {
		return this.estadoUsuario;
	}

	/**
	 * 
	 * @param estadoUsuario
	 */
	public void setEstadoUsuario(EstadoUsuario estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}

	public CarritoCompras getCarritoCompras() {
		return this.carritoCompras;
	}

	/**
	 * 
	 * @param carritoCompras
	 */
	public void setCarritoCompras(CarritoCompras carritoCompras) {
		this.carritoCompras = carritoCompras;
	}

}