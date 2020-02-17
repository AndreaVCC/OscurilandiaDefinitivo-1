/* Definicion de la Clase Trupalla
 * 
 * 
 */

package OscurilandiaDefinitivo;

public class Trupalla extends Carro{

	// Atributos 
	private int nivelArmadura;
	private String nombreConductor;

	// Constructor
	public Trupalla(int cantidadOcupantes, String fechaIngreso, int ubicacionX, int ubicacionY, int numCoche,
			int nivelArmadura, String nombreConductor) {
		super(cantidadOcupantes, fechaIngreso, ubicacionX, ubicacionY, numCoche);
		this.nivelArmadura = nivelArmadura;
		this.nombreConductor = nombreConductor;
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

	//Método imprimir
	public void imprimir() {
		super.imprimir();
		System.out.println("Nivel de Armadura: " + getNivelArmadura() + "\n Nombre del Conductor: " + getNombreConductor());
	}	

}