public class Cliente {

	private String nombre;
	private int edad;
	private boolean tieneCuenta;
	private Cuenta cuentaAsociada;

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

	public int getEdad() {
		return this.edad;
	}

	/**
	 * 
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean getTieneCuenta() {
		return this.tieneCuenta;
	}

	/**
	 * 
	 * @param tieneCuenta
	 */
	public void setTieneCuenta(boolean tieneCuenta) {
		this.tieneCuenta = tieneCuenta;
	}

	public String getCuentaAsociada() {
		// TODO - implement Cliente.getCuentaAsociada
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cuentaAsociada
	 */
	public void setCuentaAsociada(Cuenta cuentaAsociada) {
		this.cuentaAsociada = cuentaAsociada;
	}

	public Cuenta getCuentaAsocida() { //metodo agregado manualmente
		return this.cuentaAsociada;
	}

	/**
	 * 
	 * @param nombre
	 * @param edad
	 * @param tieneCuenta
	 * @param cuentaAsociada
	 */
	public Cliente(String nombre, int edad, boolean tieneCuenta, Cuenta cuentaAsociada) {
		// TODO - implement Cliente.Cliente
		throw new UnsupportedOperationException();
	}

}