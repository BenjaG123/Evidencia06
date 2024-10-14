import java.util.ArrayList;

public class Producto {

	private String nombre;
	private int cantidadDisponible;
	private boolean necesitaMayoriaEdad;
	private ArrayList<FamiliaProducto> familiasProducto;
	private int costoUnitario;

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

	public int getCantidadDisponible() {
		return this.cantidadDisponible;
	}

	/**
	 * 
	 * @param cantidadDisponible
	 */
	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}

	public boolean getNecesitaMayoriaEdad() {
		return this.necesitaMayoriaEdad;
	}

	/**
	 * 
	 * @param necesitaMayoriaEdad
	 */
	public void setNecesitaMayoriaEdad(boolean necesitaMayoriaEdad) {
		this.necesitaMayoriaEdad = necesitaMayoriaEdad;
	}

	public ArrayList<FamiliaProducto> getFamiliasProducto() {
		return this.familiasProducto;
	}

	/**
	 * 
	 * @param familiasProducto
	 */
	public void setFamiliasProducto(ArrayList<FamiliaProducto> familiasProducto) {
		this.familiasProducto = familiasProducto;
	}

	public int getCostoUnitario() {
		return this.costoUnitario;
	}

	/**
	 * 
	 * @param costoUnitario
	 */
	public void setCostoUnitario(int costoUnitario) {
		this.costoUnitario = costoUnitario;
	}

}