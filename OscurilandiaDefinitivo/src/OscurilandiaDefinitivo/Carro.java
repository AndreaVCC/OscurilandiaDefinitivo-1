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

	public Carro() {

	}

	// Getters & Setters
	public int getCantidadOcupantes() {
		return cantidadOcupantes;
	}

	public void setCantidadOcupantes(int cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getUbicacionX() {
		return ubicacionX;
	}

	public void setUbicacionX(int ubicacionX) {
		this.ubicacionX = ubicacionX;
	}

	public int getUbicacionY() {
		return ubicacionY;
	}

	public void setUbicacionY(int ubicacionY) {
		this.ubicacionY = ubicacionY;
	}

	public int getNumCoche() {
		return numCoche;
	}

	public void setNumCoche(int numCoche) {
		this.numCoche = numCoche;
	}

	@Override
	public String toString() {
		return "Carro [cantidadOcupantes=" + cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + ", ubicacionX="
				+ ubicacionX + ", ubicacionY=" + ubicacionY + ", numCoche=" + numCoche + "]";
	
	}
	
	public String imprimir () {
		return " ,Cantidad ocupantes=" + cantidadOcupantes + ", Fecha ingreso=" + fechaIngreso + ", Ubicacion (" + ubicacionX + "|" + ubicacionY + "), " + " Numero carro=" + numCoche;
	}



}
