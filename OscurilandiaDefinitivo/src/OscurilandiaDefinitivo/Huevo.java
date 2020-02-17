/* Definicion de la Clase Huevo
 * 
 * 
 */

package OscurilandiaDefinitivo;

public class Huevo {

	// Atrubutos
	private int filaCaida;
	private int columnaCaida;
	private int puntaje;

	// Constructores
	public Huevo(int filaCaida, int columnaCaida, int puntaje) {

		this.filaCaida = filaCaida;
		this.columnaCaida = columnaCaida;
		this.puntaje = puntaje;
	}

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