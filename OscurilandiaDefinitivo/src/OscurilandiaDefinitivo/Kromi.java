/* Definicion de la Clase Kromi.
 * 
 * 
 */

package OscurilandiaDefinitivo;

/**
 * Clase hija de Carro, define las caracteristicas especificas de carro tipo
 * Kromi
 * 
 * @author DPJA
 * @version 1.0
 */
public class Kromi extends Carro {

	// Atributos
	private int anioFabricacion;
	private String marca;

	// Constructor
	/**
	 * Constructor con 5 parametros
	 * 
	 * @param cantidadOcupantes numero de ocupantes del carro
	 * @param fechaIngreso      fecha ingreso del carro
	 * @param ubicacionX        ubicacion de fila del carro
	 * @param ubicacionY        ubicacion de columna del carro
	 * @param numCoche          numero de carro ingresado
	 * @param anioFabricacion   año fabricacion del carro
	 * @param marca             marca del carro
	 */
	public Kromi(int cantidadOcupantes, String fechaIngreso, int ubicacionX, int ubicacionY, int numCoche,
			int anioFabricacion, String marca) {
		super(cantidadOcupantes, fechaIngreso, ubicacionX, ubicacionY, numCoche);
		this.anioFabricacion = anioFabricacion;
		this.marca = marca;
	}

	/**
	 * Constructor por defecto.
	 */
	public Kromi() {
	}

	// Getters & Setters

	/**
	 * Metodo retorna anio fabricacion del carro
	 * 
	 * @return Anio fabricacion
	 */
	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	/**
	 * Define anio fabricacion
	 * 
	 * @param anioFabricacion Define anio fabricacion.
	 */
	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	/**
	 * Metodo retorna marca del carro.
	 * 
	 * @return marca. Retorna marca del carro.
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Define Marca
	 * 
	 * @param marca Define Marca de Kromi
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Metodo toString
	 * 
	 * @return Muestra toString de Kromi + Carro
	 */
	@Override
	public String toString() {
		return super.toString() + "Kromi [anioFabricacion=" + anioFabricacion + ", marca=" + marca + "]";
	}

	/**
	 * Metodo que imprime informacion de los carros tipo Kromi
	 * 
	 * @return Informacion del carro tipo Kromi
	 */
	public String imprimir() {
		return "Kromi - Anio fabricacion=" + anioFabricacion + ", Marca=" + marca + super.imprimir();
	}

}
