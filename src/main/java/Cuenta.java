import java.util.ArrayList;

public class Cuenta {

	private Cliente cliente;
	private ArrayList<Pedido> pedidos;
	private CarritoCompras carritoCompras;
	private MedioPago medioPago;

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

	public ArrayList<Pedido> getPedidos() {
		return this.pedidos;
	}

	/**
	 * 
	 * @param pedidos
	 */
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
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

	public MedioPago getMedioPago() {
		return this.medioPago;
	}

	/**
	 * 
	 * @param medioPago
	 */
	public void setMedioPago(MedioPago medioPago) {
		this.medioPago = medioPago;
	}

	/**
	 * 
	 * @param cliente
	 * @param pedido
	 * @param carritoCompras
	 * @param medioPago
	 */
	public Cuenta(Cliente cliente, Pedido pedido, CarritoCompras carritoCompras, MedioPago medioPago) {
		// TODO - implement Cuenta.Cuenta
		throw new UnsupportedOperationException();
	}

}