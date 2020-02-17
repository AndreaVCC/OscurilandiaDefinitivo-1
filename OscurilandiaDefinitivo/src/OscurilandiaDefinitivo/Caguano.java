/* Definicion de la Clase Caguano.
 * 
 * 
 */

package OscurilandiaDefinitivo;

public class Caguano extends Carro{

	// ATributos
	private int alcanceTiro;
	private String colorConfeti;

	// Constructores
	public Caguano(int cantidadOcupantes, String fechaIngreso, int ubicacionX, int ubicacionY, int numCoche,
			int alcanceTiro, String colorConfeti) {
		super(cantidadOcupantes, fechaIngreso, ubicacionX, ubicacionY, numCoche);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
	}

	public Caguano() {

	}

	// Getters & Setters

	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	public String getColorConfeti() {
		return colorConfeti;
	}

	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}

	// Metodo ToString
	@Override
	public String toString() {
		return super.toString() + "Caguano [alcanceTiro=" + alcanceTiro + ", colorConfeti=" + colorConfeti + "]";
	}

	//Método imprimir
	public void imprimir() {
		super.imprimir();
		System.out.println("Alcance tiro: " + getAlcanceTiro() + "\n Color del Confeti: " + getColorConfeti());
	}

}	