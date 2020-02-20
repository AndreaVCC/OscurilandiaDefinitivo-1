/* Definicion de la Clase Caguano.
 * 
 * 
 */

package OscurilandiaDefinitivo;

public class Caguano extends Carro {

	// ATributos
	private int alcanceTiro;
	private String colorConfeti;

	// Constructores
	/**
	 * Constructor con 5 parametros
	 * 
	 * @param cantidadOcupantes numero de ocupantes del carro
	 * @param fechaIngreso      fecha ingreso del carro
	 * @param ubicacionX        ubicacion de fila del carro
	 * @param ubicacionY        ubicacion de columna del carro
	 * @param numCoche          numero de carro ingresado
	 * @param alcanceTiro       alcance del tiro del carro.
	 * @param colorConfeti      color del confeti del carro.
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

	/**
	 * Metodo retorna alcance de tiro del carro
	 * 
	 * @return Alcance de tiro.
	 */
	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	/**
	 * Define alcance de tiro
	 * 
	 * @param alcanceTiro. Define alcance de tiro del caguano.
	 */
	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	/**
	 * Metodo retorna color confeti del carro
	 * 
	 * @return Color confeti.
	 */
	public String getColorConfeti() {
		return colorConfeti;
	}

	/**
	 * Define color confeti
	 * 
	 * @param colorConfeti Define color confeti
	 */
	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}

	/**
	 * Metodo toString
	 * 
	 * @return Muestra toString de Caguano + Carro
	 */
	@Override
	public String toString() {
		return super.toString() + "Caguano [alcanceTiro=" + alcanceTiro + ", colorConfeti=" + colorConfeti + "]";

	}

	/**
	 * Metodo que imprime informacion de los carros tipo caguano
	 * 
	 * @return Informacion del carro tipo Caguano
	 */
	public String imprimir() {
		return "Caguano -Aalcance tiro=" + alcanceTiro + ", Color confeti=" + colorConfeti + super.imprimir();
	}

}
