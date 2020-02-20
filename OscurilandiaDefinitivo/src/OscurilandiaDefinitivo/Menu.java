/*Menu creado como metodo estatico para que pueda ser llamado desde diferentes clases, en caso de ser necesario.
*Si necesitan editar, se debe comentar el @SupressWarnings o nunca mostrarÃ¡ si hay errores.
*
*
*/
package OscurilandiaDefinitivo;

import java.util.Scanner;

/**
 * Clase para probar la ejecucion del proyecto.
 * 
 * @author DPJA
 * @version 1.0
 */
public class Menu {
	
	/**
	 * Metodo que genera el menu 
	 */
	public static void menu() {
		 @SuppressWarnings("resource") /*Para evitar el warning que da scanner por no
		 cerrarlo (Si se cierra da error de NoSuchElementException)*/
		Scanner scanner = new Scanner(System.in);
		
		scanner = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("*************************");
			System.out.println("* Oscurilandia the game *");
			System.out.println("*************************");
			System.out.println(
					"�Que desea hacer? \n 1) Agregar carros \n 2) Imprimir lista carros \n 3) Lanzar huevos \n 4) Salir");
			System.out.println("");
			System.out.print("Ingrese Opcion: ");
			opcion = scanner.nextInt();

			switch (opcion) {

			case 1:
				Tablero.agregarCarro();
				Tablero.muestraTablero();
				break;

			case 2:
				Tablero.mostrarCarros();
				break;

			case 3:
				Tablero.muestraTablero();
				Tablero.lanzarHuevo();
				break;
						
			case 4:
				System.out.println("Has salido del juego"); 
				break;
			default:
				System.out.println("Opcion invalida"); 				
				break;
			}
		} while (opcion < 4);

	}

	/**
	 * Metodo que ejecuta la prueba de la clase Tablero
	 * 
	 * @param args es un arreglo de tipo String de la linea de comandos
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Tablero tablero = new Tablero();
		Tablero.creaTablero();

		/** Llamando a metodo menu
		 * 
		 */
		menu();
	}

}
