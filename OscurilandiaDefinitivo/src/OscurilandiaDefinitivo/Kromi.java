/* Definicion de la Clase Kromi.
 * 
 * 
 */

package OscurilandiaDefinitivo;

public class Kromi extends Carro{

	// Atributos
	private int anioFabricacion;
	private String marca;

	//Constructor
	public Kromi(int cantidadOcupantes, String fechaIngreso, int ubicacionX, int ubicacionY, int numCoche,
			int anioFabricacion, String marca) {
		super(cantidadOcupantes, fechaIngreso, ubicacionX, ubicacionY, numCoche);
		this.anioFabricacion = anioFabricacion;
		this.marca = marca;
	}

	// Getters & Setters

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// Metodo toString
	@Override
	public String toString() {
		return super.toString() + "Kromi [anioFabricacion=" + anioFabricacion + ", marca=" + marca + "]";
	}

	//Método imprimir
	public void imprimir() {
		super.imprimir();
		System.out.println("Año Fabricación: " + getAnioFabricacion() + "\n Marca: " + getMarca());
	}

}