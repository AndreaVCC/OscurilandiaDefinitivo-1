/* Definicion de la Clase Trupalla
 * 
 * 
 */

package OscurilandiaDefinitivo;

/**
 * Clase hija de Carro, define las caracteristicas especificas de carro tipo
 * Trupalla.
 * 
 * @author DPJA
 * @version 1.0
 */
public class Trupalla extends Carro {

	// Atributos
	private int nivelArmadura;
	private String nombreConductor;

	// Constructor
	/**
	 * Constructor con 5 parametros
	 * 
	 * @param cantidadOcupantes numero de ocupantes del carro
	 * @param fechaIngreso      fecha ingreso del carro
	 * @param ubicacionX        ubicacion de fila del carro
	 * @param ubicacionY        ubicacion de columna del carro
	 * @param numCoche          numero de carro ingresado
	 * @param nivelArmadura     nivel de armadura del carro
	 * @param nombreConductor   nombre del conductor del carro
	 */
	public Trupalla(int cantidadOcupantes, String fechaIngreso, int ubicacionX, int ubicacionY, int numCoche,
			int nivelArmadura, String nombreConductor) {
		super(cantidadOcupantes, fechaIngreso, ubicacionX, ubicacionY, numCoche);
		this.nivelArmadura = nivelArmadura;
		this.nombreConductor = nombreConductor;
	}

	/**
	 * Constructor por defecto.
	 */
	public Trupalla() {
	}

	// Getters & Settters

	/**
	 * Metodo retorna nivel de armadura del carro
	 * 
	 * @return Nivel armadura de Trupalla.
	 */
	public int getNivelArmadura() {
		return nivelArmadura;
	}

	/**
	 * Define nivel de armadura
	 * 
	 * @param nivelArmadura Define nivel de armadura de Trupalla.
	 */
	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}

	/**
	 * Metodo retorna nombre conductor
	 * 
	 * @return nombreConductor. Retorna nombre de conductor de Trupalla
	 */
	public String getNombreConductor() {
		return nombreConductor;
	}

	/**
	 * Define nombre de conductor
	 * 
	 * @param nombreConductor Define nombre de conductor de Trupalla.
	 */
	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}

	/**
	 * Metodo toString
	 * 
	 * @return Muestra toString de Trupalla + Carro
	 */
	@Override
	public String toString() {
		return super.toString() + "Trupalla [nivelArmadura=" + nivelArmadura + ", nombreConductor=" + nombreConductor
				+ "]";
	}

	/**
	 * Metodo que imprime informacion de los carros tipo Trupalla
	 * 
	 * @return Informacion del carro tipo Trupalla
	 */
	public String imprimir() {
		return "Trupalla - Nivel armadura=" + nivelArmadura + ", Nombre conductor=" + nombreConductor
				+ super.imprimir();
	}

}
