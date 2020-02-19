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
	/**
     	* Constructor con 5 parametros
     	* @param cantidadOcupantes numero de ocupantes del carro
     	* @param fechaIngreso fecha ingreso del carro
     	* @param ubicacionX ubicacion de fila del carro
     	* @param ubicacionY ubicacion de columna del carro
     	* @param numCoche numero de carro ingresado
     	* @param alcanceTiro alcance del tiro del carro.
     	* @param colorConfeti color del confeti del carro.
     	*/
	public Caguano(int cantidadOcupantes, String fechaIngreso, int ubicacionX, int ubicacionY, int numCoche,
			int alcanceTiro, String colorConfeti) {
		super(cantidadOcupantes, fechaIngreso, ubicacionX, ubicacionY, numCoche);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
	}

	/**
     	* Constructor por defecto.
     	*/
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


}	
