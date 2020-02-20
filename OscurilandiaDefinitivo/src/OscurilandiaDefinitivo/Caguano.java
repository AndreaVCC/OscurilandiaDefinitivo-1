/* Definicion de la Clase Caguano.
 * 
 * 
 */

package OscurilandiaDefinitivo;

/**
 * Clase hija de Carro, define las caracteristicas especificas de carro tipo
 * Caguano.
 * 
 * @author DPJA
 * @version 1.0
 */
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
	 * @return alcanceTiro Retorna el alcance de tiro de Caguano.
	 */
	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	/**
	 * Define alcance de tiro
	 * 
	 * @param alcanceTiro. Define alcance de tiro de Caguano.
	 */
	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	/**
	 * Metodo retorna color confeti de Caguano.
	 * 
	 * @return colorConfeti. Retorna el color de confeti de Caguano.
	 */
	public String getColorConfeti() {
		return colorConfeti;
	}

	/**
	 * Define color confeti
	 * 
	 * @param colorConfeti Define color de confeti de Caguano.
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
	 * Metodo que imprime informacion de los carros tipo Caguano
	 * 
	 * @return Informacion del carro tipo Caguano
	 */
	public String imprimir() {
		return "Caguano -Aalcance tiro=" + alcanceTiro + ", Color confeti=" + colorConfeti + super.imprimir();
	}

}
