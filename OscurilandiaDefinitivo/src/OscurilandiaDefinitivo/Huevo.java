/* Definicion de la Clase Huevo
 * 
 * 
 */

package OscurilandiaDefinitivo;

/**
 * Clase que define cada lanzamiento realizado dentro del tablero.	
 * @author DPJA
 * @version 1.0
 */
public class Huevo {

	// Atrubutos
	private int filaCaida;
	private int columnaCaida;
	private int puntaje;

	// Constructores
	/**
     	* Constructor con 3 parametros
    	* @param filaCaida fila donde se hubica el huevo lanzado
     	* @param columnaCaida columna donde se hubica el huevo lanzado
     	* @param puntaje puntaje acumulado del juego
     	*/
	public Huevo(int filaCaida, int columnaCaida, int puntaje) {
		this.filaCaida = filaCaida;
		this.columnaCaida = columnaCaida;
		this.puntaje = puntaje;
	}
	
	/**
     	* Constructor por defecto
     	*/
	public Huevo() {
	}

	// Getters & Setters

	public int getFilaCaida() {
		return filaCaida;
	}

	public void setFilaCaida(int filaCaida) {
		this.filaCaida = filaCaida;
	}

	public int getColumnaCaida() {
		return columnaCaida;
	}

	public void setColumnaCaida(int columnaCaida) {
		this.columnaCaida = columnaCaida;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Huevo [filaCaida=" + filaCaida + ", columnaCaida=" + columnaCaida + ", puntaje=" + puntaje + "]";
	}

}
