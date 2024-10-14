public class CarritoCompras {

	private Cuenta cuentaAsociada;
	private FamiliaProducto familiaProducto;

	public Cuenta getCuentaAsociada() {
		return this.cuentaAsociada;
	}

	/**
	 * 
	 * @param cuentaAsociada
	 */
	public void setCuentaAsociada(Cuenta cuentaAsociada) {
		this.cuentaAsociada = cuentaAsociada;
	}

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

}