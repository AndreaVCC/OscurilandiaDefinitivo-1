/* Definicion de la Clase Trupalla
 * 
 * 
 */

package OscurilandiaDefinitivo;

/**
 * Clase hija de Carro, define las caracteristicas especificas de carro tipo Trupalla.
 * @author DPJA
 * @version 1.0
 */
public class Trupalla extends Carro{

	// Atributos 
	private int nivelArmadura;
	private String nombreConductor;

	// Constructor
	/**
     	* Constructor con 5 parametros
     	* @param cantidadOcupantes numero de ocupantes del carro
     	* @param fechaIngreso fecha ingreso del carro
     	* @param ubicacionX ubicacion de fila del carro
     	* @param ubicacionY ubicacion de columna del carro
     	* @param numCoche numero de carro ingresado
     	* @param nivelArmadura nivel de armadura del carro
     	* @param nombreConductor nombre del conductor del carro
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

	public int getNivelArmadura() {
		return nivelArmadura;
	}

	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}

	public String getNombreConductor() {
		return nombreConductor;
	}

	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}

	// Metodo toString
	@Override
	public String toString() {
		return super.toString() + "Trupalla [nivelArmadura=" + nivelArmadura + ", nombreConductor=" + nombreConductor + "]";
	}
	

}
