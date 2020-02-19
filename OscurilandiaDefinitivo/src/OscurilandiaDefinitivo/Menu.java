/*Menu creado como método estático para que pueda ser llamado desde diferentes clases, en caso de ser necesario.
*Si necesitan editar, se debe comentar el @SupressWarnings o nunca mostrará si hay errores.
*
*
*/
package OscurilandiaDefinitivo;

import java.util.Scanner;

/**
 * Clase para probar la ejecucion del proyecto.
 * @author DPJA
 * @version 1.0
 */
public class Menu {
	public static void menu() {
		//@SuppressWarnings("resource") //Para evitar el warning que da scanner por no cerrarlo (Si se cierra da error de NoSuchElementException)
		Scanner scanner = new Scanner(System.in);
		boolean salir = true;
		scanner = new Scanner (System.in);
		int opcion = 0; 
		do {
			System.out.println("*************************");
			System.out.println("* Oscurilandia the game *");
			System.out.println("*************************");
			System.out.println("�Que desea hacer? \n 1) Agregar vehiculos \n 2) Mostrar carros \n 3) Jugar \n 4) Mostrar puntuacion \n 5) Salir");
			System.out.println("");
			System.out.print("Ingrese Opcion: ");
			opcion = scanner.nextInt();

			
			switch (opcion){
			
				case 1: 
					Tablero.agregarCarro(); 
					Tablero.muestraTablero(); 
					break;//LLamando al metodo agregar carro
					
				case 2: 
					Tablero.muestraTablero(); 
					break;//LLamando al emtodo mostrar tablero
	
				case 3: 
					Tablero.lanzarHuevo(); 
					break;//LLamando al metodo lanzar huevo, no me muestra el puntaje y se devuelve al menú central >:(
				
				case 4: 
					System.out.println("Mostrar Carros");
					Tablero.imprimeCarros();
					//System.out.println("caso4 ");//calcularPuntajes() no puesto aún
					
					break;
				case 5:
					salir = false;
					
				default: 
					System.out.println("Saliendo..."); //Devuelve el puntaje actual y si deseo continuar, y no sé por qué >:(
					salir = false;
					break;
			}		
			}while (opcion < 5);

	}


	/**
     	* Metodo que ejecuta la prueba de la clase Tablero
     	* @param args es un arreglo de tipo String de la linea de comandos
     	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Tablero tablero = new Tablero();
		Tablero.creaTablero();
		
		//Llamando a menú
		menu();
	}



}
