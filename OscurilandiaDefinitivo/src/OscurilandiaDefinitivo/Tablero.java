/* Definicion de la Clase Tablero
 * 
 * 
 */

package OscurilandiaDefinitivo;

import java.util.ArrayList;
import java.util.Scanner;

public class Tablero {

	// Atributos
	String tablero[][] = new String[15][15];

	public  ArrayList <Huevo> listaHuevos = new ArrayList <>(); 
	public ArrayList <Carro> listaCarros = new ArrayList <>();
	int puntaje;

	// Contructor

	public Tablero(String[][] tablero) {
		this.tablero = tablero;
	}

	public Tablero () {

	}

	// Metodo crea tablero 15x15 ---------------------//

	public void creaTablero() {

		// Rellenar tablero completo con signo + ---------//

		for (int x=0; x < tablero.length; x++) {
			for (int y=0; y < tablero[x].length; y++) {
				tablero[x][y] ="+";
			}
		}
	}

		// Crear arraylist con todos los coches
	public void agregarCarro() {

		for (int i = 0; i < 18; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Ingrese informacion comun de los coches: ");
			System.out.println("Cantidad de ocupantes:");
			int cantidadOcupantes = scanner.nextInt();
			System.out.println("Fecha ingreso:");
			String fechaIngreso = scanner.next();
			int ubicacionX = 0;
			int ubicacionY = 0;
			int numCoche = i;

			if (i <= 2) {
				System.out.println("Ingrese informacion de coches tipo Kromi");
				System.out.println("Anio fabricacion:");
				int anioFabricacion = scanner.nextInt();
				System.out.println("Marca:");
				String marca = scanner.next();
				Kromi kromi = new Kromi(cantidadOcupantes, fechaIngreso, ubicacionX, ubicacionY, numCoche,
						anioFabricacion, marca);
				listaCarros.add(0, kromi);
				numCoche = numCoche + 1;
				System.out.println("Kromi " + numCoche + " agregado con exito");

			} else if (i > 2 && i <= 7) {
				System.out.println("Agregando tipo Caguano");
				System.out.println("Alcance de tiro:");
				int alcanceTiro = scanner.nextInt();
				System.out.println("Color confeti:");
				String colorConfeti = scanner.nextLine();
				Caguano caguano = new Caguano(cantidadOcupantes, fechaIngreso, ubicacionX, ubicacionY, numCoche,
						alcanceTiro, colorConfeti);
				listaCarros.add(0, caguano);
				numCoche = numCoche + 1;

			} else {
				System.out.println("Agregando tipo Trupalla");
				System.out.println("Nivel de armadura:");
				int nivelArmadura = scanner.nextInt();
				System.out.println("Nombre conductor:");
				String nombreConductor = scanner.nextLine();
				Trupalla trupalla = new Trupalla(cantidadOcupantes, fechaIngreso, ubicacionX, ubicacionY, numCoche,
						nivelArmadura, nombreConductor);
				listaCarros.add(0, trupalla);
				numCoche = numCoche + 1;
			}
			scanner.close();
		}

		/* Muestra el listado de todos los coches agregados al arraylist, Prueba
		for (Carro cars : listaCarros) {
			System.out.println(cars);
		}
		*/
	}

	public void posicionaKromis() {
		// Posicionar dentro de la tablero los carros... Kromis
		for (int i = 0 ; i<3; i++) {
			// Generamos numero random para posicionar
			int x = (int) (Math.random()*13);
			int y = (int) (Math.random()*15);

			// validamos que el tablero tenga 3 posiciones libres
			if (tablero[x][y].equals("+") && tablero[x+1][y].equals("+") && tablero[x+2][y].equals("+")){
				tablero[x][y] = "K";
				tablero[x+1][y] = "K";
				tablero[x+2][y] = "K";
			} 
			else { 
				i = i - 1;
			}
		}
	}

	public void posicionarCanguanos() {
		// Posicionar dentro de la tablero los carros... Canguanos
		for (int i = 0 ; i<5; i++) {
			// Generamos numero random para posicionar
			int x = (int) (Math.random()*14);
			int y = (int) (Math.random()*14);
			// validamos que tablero este vacio. 
			if (tablero[x][y].equals("+") && tablero[x][y+1].equals("+")) {
				tablero[x][y] = "C";
				tablero[x][y+1] = "C";
			} 
			else { 
				i = i - 1;
			}
		}
	}

	public void posicionarTrupallas() {
		// Posicionar dentro de la tablero los carros... Trupallas
		for (int i = 0 ; i<10; i++) {
			// Generamos numero random para posicionar
			int x = (int) (Math.random()*15);
			int y = (int) (Math.random()*15);
			// validamos que tablero este vacio. 
			if (tablero[x][y].equalsIgnoreCase("+")) {
				tablero[x][y] = "T";
			} 
			else { 
				i = i - 1;
			}
		}
	}

	// Mostrar tablero 
	public void muestraTablero() {
		System.out.println(" ");
		for (int x=0; x < tablero.length; x++) {
			for (int y=0; y < tablero[x].length; y++) {
				System.out.print(tablero[x][y]+" ");
			}
			System.out.println();
		}

	}

	// Metodo lanza huevos a coches
	public void lanzarHuevo () {
		System.out.println("Binvenido a Oscurilandia Gamer");

		Scanner lanzahuevo = new Scanner(System.in);
		Scanner continuar = new Scanner(System.in);
		boolean seguir = true;
		do {
			System.out.print("Ingrese Fila entre 0 y 14: ");
			int fila = lanzahuevo.nextInt();
			System.out.print("Ingrese Columna entre 0 y 14:");
			int columna = lanzahuevo.nextInt();

			// validamos que el lanzamiento este dentro del tablero
			if (fila > 14 || columna > 14) {
				System.out.println("coordenadas fuera del recuadro... vuelva a intentarlo");
				//seguir = false;
				//break;
			}
			else {
				seguir = true;
				if (tablero[fila][columna].equals("T") || tablero[fila][columna].equals("C") || tablero[fila][columna].equals("K")){
					System.out.println(tablero[fila][columna].equals("T"));

					if (tablero[fila][columna].equalsIgnoreCase("T")){
						puntaje = puntaje + 1;
						System.out.println("Trupalla inutilizado");
						System.out.println("Puntaje actual: " + puntaje);
						tablero[fila][columna] = "X";
					}
					else {
						if  (tablero[fila][columna].equals("C")) {
							puntaje = puntaje +1 ;
							System.out.println("Caguano inutilizado");
							System.out.println("Puntaje actual: " + puntaje);
							tablero[fila][columna] = "X";
						}
						else {
							if (tablero[fila][columna].equals("K")) {
								puntaje =  puntaje + 1;
								System.out.println("Kromi inutilizado");
								System.out.println("Puntaje actual: " + puntaje);
								tablero[fila][columna] = "X";
							}
						}
					}


				}
				else {
					if (tablero[fila][columna].equals("X"))
						System.out.println("Puntaje actual: " + puntaje);
					else {
						tablero[fila][columna] = "H";
					}
				}
			}
			//				System.out.println("Â¿Desea continuar Y / N ?");
			//				String cont = continuar.next();
			//				if (cont.equalsIgnoreCase("N")){
			//					seguir = false;
			//					System.out.println("Puntaje actual: " + puntaje);
			//					break;
			//				}
			//				else {
			muestraTablero();
			//				}
		}while (seguir = true);

		lanzahuevo.close();
		continuar.close();

	}

}
