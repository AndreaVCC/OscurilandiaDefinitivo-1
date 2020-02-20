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

	/**
	 * Metodo que retorna la fila de caida del huevo.
	 * @return Huevo. Retorna filaCaida.
	 */
	public int getFilaCaida() {
		return filaCaida;
	}

	/**
	 * Metodo que define la fila de caida del huevo
	 * @param filaCaida. Define la fila de caida del huevo.
	 */
	public void setFilaCaida(int filaCaida) {
		this.filaCaida = filaCaida;
	}

	/**
	 * Metodo que retorna la columna de caida del huevo.
	 * @return columnaCaida Retorna columnaCaida.
	 */
	public int getColumnaCaida() {
		return columnaCaida;
	}

	/**
	 * Metodo que define la columna de caida del huevo
	 * @param columnaCaida define la columna de caida del huevo.
	 */
	public void setColumnaCaida(int columnaCaida) {
		this.columnaCaida = columnaCaida;
	}

	/**
	 * Metodo retorna el puntaje del lanzamiento
	 * @return Retorna puntaje.
	 */
	public int getPuntaje() {
		return puntaje;
	}

	/**
	 * Metodo que define el puntaje del lanzamiento
	 * @param puntaje define el puntaje del lanzamiento
	 */
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	/**
	 * Metodo toString
	 * 
	 * @return Muestra la fila de caida, la columna de caida y el puntaje obtenido.
	 */
	@Override
	public String toString() {
		return "Huevo [filaCaida=" + filaCaida + ", columnaCaida=" + columnaCaida + ", puntaje=" + puntaje + "]";
	}

}
