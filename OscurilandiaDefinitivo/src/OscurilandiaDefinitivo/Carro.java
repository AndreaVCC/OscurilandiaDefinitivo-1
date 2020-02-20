/* Definicion de la Clase Carro.
 * 
 * 
 */

package OscurilandiaDefinitivo;

/**
 * Clase padre	que definira atributos comunes de todos los tipos de carro.
 * @author DPJA
 * @version 1.0
 */
public class Carro {

	// Atributos
	private int cantidadOcupantes;
	private String fechaIngreso;
	private int ubicacionX;
	private int ubicacionY;
	private int numCoche;


	// Constructores
    	/**
     	* Constructor con 5 parametros
     	* @param cantidadOcupantes numero de ocupantes del carro
     	* @param fechaIngreso fecha ingreso del carro
     	* @param ubicacionX ubicacion de fila del carro
     	* @param ubicacionY ubicacion de columna del carro
     	* @param numCoche numero de carro ingresado
     	*/
	public Carro(int cantidadOcupantes, String fechaIngreso, int ubicacionX, int ubicacionY, int numCoche) {
		super();
		this.cantidadOcupantes = cantidadOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.ubicacionX = ubicacionX;
		this.ubicacionY = ubicacionY;
		this.numCoche = numCoche;
	}
	
	/**
	 * Constructor por defecto.
	 */
	public Carro() {

	}

	// Getters & Setters
	/**
	 * Obtiente cantidad de ocupantes.
	 * 
	 * @return cantidadOcupantes. Retorna cantidad de ocupantes.
	 */
	public int getCantidadOcupantes() {
		return cantidadOcupantes;
	}
	/**
	 * Define cantidad de ocupantes.
	 * 
	 * @param cantidadOcupantes. Define cantidad de ocupantes.
	 */
	public void setCantidadOcupantes(int cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}
	/**
	 * Obtiente cantidad de ocupantes.
	 * 
	 * @return FechaIngresa. Retorna fecha de ingreso.
	 */
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	/**
	 * Define fecha de ingreso.
	 * 
	 * @param fechaIngreso. Define fecha de ingreso de carro.
	 */
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	/**
	 * Obtiente ubicacion x.
	 * 
	 * @return ubicacionX. Retorna ubicacion horizontal del tablero.
	 */
	public int getUbicacionX() {
		return ubicacionX;
	}
	/**
	 * Define ubicacion de fila.
	 * 
	 * @param ubicacionX. Define ubicacion horizontal.
	 */
	public void setUbicacionX(int ubicacionX) {
		this.ubicacionX = ubicacionX;
	}
	/**
	 * Obtiente ubicacion y.
	 * 
	 * @return ubicacionY. Retorna ubicacion vertical de tablero.
	 */
	public int getUbicacionY() {
		return ubicacionY;
	}
	/**
	 * Define ubicacion de columna.
	 * 
	 * @param ubicacionY. Define ubicacion vertical.
	 */
	public void setUbicacionY(int ubicacionY) {
		this.ubicacionY = ubicacionY;
	}
	/**
	 * Obtiente numero de carro.
	 * 
	 * @return numCoche. Retorna numero de coche.
	 */
	public int getNumCoche() {
		return numCoche;
	}
	/**
	 * Define numero de carro.
	 * 
	 * @param numCoche. Define numero de coche.
	 */
	public void setNumCoche(int numCoche) {
		this.numCoche = numCoche;
	}
	/**
	 * Metodo toString
	 * 
	 * @return Muestra toString de Carro
	 */
	@Override
	public String toString() {
		return "Carro [cantidadOcupantes=" + cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + ", ubicacionX="
				+ ubicacionX + ", ubicacionY=" + ubicacionY + ", numCoche=" + numCoche + "]";
	
	}
	/**
	 * Metodo que imprime informacion de los carros.
	 * 
	 * @return Informacion del carro.
	 */
	public String imprimir () {
		return " ,Cantidad ocupantes=" + cantidadOcupantes + ", Fecha ingreso=" + fechaIngreso + ", Ubicacion (" + ubicacionX + "|" + ubicacionY + "), " + " Numero carro=" + numCoche;
	}



}
