/*Menu creado como m�todo est�tico para que pueda ser llamado desde diferentes clases, en caso de ser necesario.
*Si necesitan editar, se debe comentar el @SupressWarnings o nunca mostrar� si hay errores.
*
*
*/
package OscurilandiaDefinitivo;

import java.util.Scanner;

public class Menu {
	public static void menu() {
		@SuppressWarnings("resource") //Para evitar el warning que da scanner por no cerrarlo (Si se cierra da error de NoSuchElementException)
		Scanner scanner = new Scanner(System.in);

		scanner = new Scanner (System.in);
		int opcion = 0; 

			System.out.println("*************************");
			System.out.println("* Oscurilandia the game *");
			System.out.println("*************************");
			System.out.println("�Qu� desea hacer? \n 1) Agregar veh�culos \n 2) Mostrar carros \n 3) Jugar \n 4) Mostrar puntuaci�n \n 5) Salir");
			System.out.println("");
			System.out.print("Ingrese Opci�n: ");
			opcion = scanner.nextInt();

			switch (opcion){
			case 1: Tablero.agregarCarro(); Tablero.muestraTablero(); break;//LLamando al m�todo agregar carro

			case 2: Tablero.muestraTablero(); break;//LLamando al m�todo mostrar tablero

			case 3: Tablero.lanzarHuevo(); break;//LLamando al m�todo lanzar huevo, no me muestra el puntaje y se devuelve al men� central >:(
			case 4: System.out.println("caso4 ");//calcularPuntajes() no puesto a�n
			break;
			default: System.out.println("Saliendo..."); //Devuelve el puntaje actual y si deseo continuar, y no s� por qu� >:(
			break;
			}while (opcion < 4);
			

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Tablero tablero = new Tablero();
		Tablero.creaTablero();
		//Llamando a men�
		menu();
	}



}
