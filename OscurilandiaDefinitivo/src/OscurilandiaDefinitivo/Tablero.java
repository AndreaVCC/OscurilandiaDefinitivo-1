/* Definicion de la Clase Tablero
 *Los mÃ©todos quedaron como static, para que el menÃº pudiese llamarlos, y viceversa. 
 *Al cambiar a static, se cambiaron tambiÃ©n algunas lÃ­neas de los constructores, porque sino daba errores y warnings.
 * 
 * 
 */

package OscurilandiaDefinitivo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que representa el terreno en el que se ubica cada carro y en el cual se
 * situan los proyectiles.
 * 
 * @author DPJA
 * @version 1.0
 */
public class Tablero {

	static String tablero[][] = new String[15][15];
	public static ArrayList<Huevo> listaHuevos = new ArrayList<>();
	public static ArrayList<Carro> listaCarros = new ArrayList<>();
	public int[] id = new int[29];
	static Carro carros = new Carro();
	static Scanner teclado = new Scanner(System.in);
	static int puntaje = 0;
	//static boolean evalua = true;

	/**
	 * Constructor por defecto.
	 */
	public Tablero() {
	}

	/**
	 * Metodo que crea un tablero de 15 columnas y 15 filas.
	 */
	public static void creaTablero() {
		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[x].length; y++) {
				tablero[x][y] = "+";

			}
		}
	}

	/**
	 * Metodo que agrega 18 carros. 3 tipo Kromi, 5 tipo Caguano y 10 tipo Trupalla.
	 */
	public static void agregarCarro() {
		// Scanner teclado = new Scanner(System.in);
		creaTablero();

		for (int i = 0; i < 18; i++) {
			System.out.println("Ingrese informacion comun de los coches: ");
			System.out.println("Cantidad de ocupantes:");
			int cantidadOcupantes = teclado.nextInt();
			System.out.println("Fecha ingreso:");
			String fechaIngreso = teclado.next();

			int numCoche = i;
			int ubicacionX = 0;
			int ubicacionY = 0;

			if (i <= 2) {
				System.out.println("Ingrese informacion de coches tipo Kromi");
				System.out.println("Anio fabricacion:");
				int anioFabricacion = teclado.nextInt();
				System.out.println("Marca:");
				String marca = teclado.next();
				posicionaKromis(); // llamamos al metodo posicionar Kromi en Tablero
				ubicacionX = carros.getUbicacionX(); // Asignamos a los atributos la posicion x e y en el tablero.
				ubicacionY = carros.getUbicacionY();

				numCoche = numCoche + 1;

				Kromi kromi = new Kromi(cantidadOcupantes, fechaIngreso, ubicacionX, ubicacionY, numCoche,
						anioFabricacion, marca);

				listaCarros.add(i, kromi);
				System.out.println("Coche : " + numCoche + " tipo Kromi agregado con exito");

			} else if (i > 2 && i <= 7) {
				System.out.println("Ingrese informacion de coches tipo Caguano");
				System.out.println("Alcance de tiro:");
				int alcanceTiro = teclado.nextInt();
				System.out.println("Color confeti:");
				String colorConfeti = teclado.next();
				posicionarCanguanos();

				ubicacionX = carros.getUbicacionX(); // Asignamos a los atributos la posicion x,y en el tablero.
				ubicacionY = carros.getUbicacionY();

				numCoche = numCoche + 1;

				Caguano caguano = new Caguano(cantidadOcupantes, fechaIngreso, ubicacionX, ubicacionY, numCoche,
						alcanceTiro, colorConfeti);

				listaCarros.add(i, caguano);
				System.out.println("Coche : " + numCoche + " tipo Caguano agregado con exito");

			} else {
				System.out.println("Ingrese informacion de coches tipo Trupalla");
				System.out.println("Nivel de armadura:");
				int nivelArmadura = teclado.nextInt();
				System.out.println("Nombre conductor:");
				String nombreConductor = teclado.nextLine();
				posicionarTrupallas();
				ubicacionX = carros.getUbicacionX(); // Asignamos a los atributos la posicion x,y en el tablero.
				ubicacionY = carros.getUbicacionY();

				numCoche = numCoche + 1;

				Trupalla trupalla = new Trupalla(cantidadOcupantes, fechaIngreso, ubicacionX, ubicacionY, numCoche,
						nivelArmadura, nombreConductor);
				listaCarros.add(i, trupalla);
				System.out.println("Coche : " + numCoche + " tipo Trupalla agregado con exito");

			}
		}
	}

	/**
	 * Metodo que posiciona de manera aleatoria los carros de tipo Kromi.
	 */
	public static void posicionaKromis() {
		boolean pos = false;
		do {

			int x = (int) (Math.random() * 13); // Generamos numero random para posicionar
			int y = (int) (Math.random() * 15);

			// validamos que el tablero tenga 3 posiciones libres
			if (tablero[x][y].equals("+") && tablero[x + 1][y].equals("+") && tablero[x + 2][y].equals("+")) {
				tablero[x][y] = "K";
				tablero[x + 1][y] = "K";
				tablero[x + 2][y] = "K";

				pos = true;

				// Asignamos posiciones a los atributos de objeto carro
				carros.setUbicacionX(x);
				carros.setUbicacionY(y);

				pos = true;
				break;
			}
		} while (pos == false);
	}

	/**
	 * Metodo que posiciona de manera aleatoria los carros de tipo Caguanos.
	 */
	public static void posicionarCanguanos() {
		boolean pos = false;
		do {
			int x = (int) (Math.random() * 14);
			int y = (int) (Math.random() * 14);
			if (tablero[x][y].equals("+") && tablero[x][y + 1].equals("+")) { // validamos que tablero este vacio.
				tablero[x][y] = "C";
				tablero[x][y + 1] = "C";

				pos = true;

				carros.setUbicacionX(x); // Asignamos posiciones a los atributos de objeto carro
				carros.setUbicacionY(y);

				pos = true;
				break;
			}
		} while (pos == false);
	}

	/**
	 * Metodo que posiciona de manera aleatoria los carros de tipo Trupalla.
	 */
	public static void posicionarTrupallas() {
		boolean pos = false;
		do {
			int x = (int) (Math.random() * 15);
			int y = (int) (Math.random() * 15);
			if (tablero[x][y].equals("+")) { // validamos que tablero este vacio.
				tablero[x][y] = "T";

				pos = true;

				carros.setUbicacionX(x); // Asignamos posiciones a los atributos de objeto carro
				carros.setUbicacionY(y);

				pos = true;
				break;
			}
		} while (pos == false);
	}

	/**
	 * Metodo que muestra el tablero y los carros generados.
	 */
	public static void muestraTablero() {
		System.out.println("Tablero Oficial");
		System.out.println(" ");
		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[x].length; y++) {
				System.out.print(tablero[x][y] + " ");
			}
			System.out.println();
		}


	}

	/**
	 * Metodo que lanza huevos y genera puntos segun el coche.
	 */
	public static void lanzarHuevo() {

		if (listaCarros.size() == 0) {
			System.out.println("No hay Coches registrados");
		}else{
			System.out.println("Binvenido a Oscurilandia");
			Huevo huevo = new Huevo();
			puntaje = 0;

			boolean seguir = false;
			do {
				System.out.println("Puntaje actual: " + puntaje);

				System.out.print("Ingrese Fila entre 0 y 14: ");
				int fil = teclado.nextInt();
				System.out.print("Ingrese Columna entre 0 y 14:");
				int col = teclado.nextInt();

				// validamos que el lanzamiento este dentro del tablero
				if (fil > 14 || col > 14) {
					System.out.println("coordenadas fuera del recuadro... vuelva a intentarlo");
					seguir = true;

				} else {

					if (tablero[fil][col].equals("T") || tablero[fil][col].equals("C") || tablero[fil][col].equals("K")) {
						if (tablero[fil][col].equals("T")) {
							puntaje = puntaje + 1;
							System.out.println("Trupalla inutilizado");
							System.out.println("Puntaje actual: " + puntaje);
							tablero[fil][col] = "X";

							huevo.setFilaCaida(fil);
							huevo.setColumnaCaida(col);
							huevo.setPuntaje(puntaje);
							listaHuevos.add(huevo);
							for (Huevo huevoslanzados : listaHuevos) {
								System.out.println(huevoslanzados);
							}

						} else {
							if (tablero[fil][col].equals("C")) {
								puntaje = puntaje + 2;
								System.out.println("Puntaje actual: " + puntaje);
								huevo.setFilaCaida(fil);
								huevo.setColumnaCaida(col);
								huevo.setPuntaje(puntaje);
								listaHuevos.add(huevo);

								System.out.println(fil);
								System.out.println(col);
								tablero[fil][col] = "X";

								carros.getUbicacionX();
								carros.getUbicacionY();
								for (Carro recorre : listaCarros) {
									if (recorre.getUbicacionX() == fil) {
										if (recorre.getUbicacionY() == col && tablero[fil][col + 1].equals("X")) {
											System.out.println("Encontro posicion exacta Caguano 1");
											System.out.println("7 puntos EXTRA Caguano");
											puntaje = puntaje + 7;
										} else if (col - recorre.getUbicacionY() == 1
												&& tablero[fil][col - 1].equals("X")) {
											System.out.println("7 puntos EXTRA Caguano 2");
											puntaje = puntaje + 7;
										}

									}
								}

							} else {
								if (tablero[fil][col].equals("K")) {
									puntaje = puntaje + 3;

									System.out.println("Puntaje actual: " + puntaje);
									tablero[fil][col] = "X";

									huevo.setFilaCaida(fil);
									huevo.setColumnaCaida(col);
									huevo.setPuntaje(puntaje);
									listaHuevos.add(huevo);

									for (Carro recorre : listaCarros) {
										if (recorre.getUbicacionY() == col) {
											if (recorre.getUbicacionX() == fil && tablero[fil + 1][col].equals("X")
													&& tablero[fil + 2][col].equals("X")) {
												System.out.println("10 puntos EXTRA Kromi");
												puntaje = puntaje + 10;

											} else if (fil - recorre.getUbicacionX() == 1
													&& tablero[fil - 1][col].equals("X")
													&& tablero[fil + 1][col].equals("X")) {
												System.out.println("10 puntos EXTRA Kromi");
												puntaje = puntaje + 10;

											} else if (fil - recorre.getUbicacionX() == 2
													&& tablero[fil - 1][col].equals("X")
													&& tablero[fil - 2][col].equals("X")) {
												System.out.println("10 puntos EXTRA Kromi");
												puntaje = puntaje + 10;
											}
										}
									}

								}
							}

						}

					}

					else {
						if (tablero[fil][col].equals("X"))
							System.out.println("");
						else {
							tablero[fil][col] = "H";

						}
					}
					muestraTablero();
					System.out.println("Puntaje actual: " + puntaje);

					System.out.println("¿Desea continuar Y / N ?");
					String cont = teclado.next();
					if (cont.equalsIgnoreCase("N")) {
						seguir = false;

					} else {
						seguir = true;
					}

				}
			} while (seguir == true);
		}

	}

	/**
	 * Metodo que muestra los carros que se guardaron en el arraylist listaCarro
	 */
	public static void mostrarCarros() {

		if (listaCarros.size() == 0) {
			System.out.println("No hay Carros ingresados");

		} else {
			for (Carro carro : listaCarros) {

				System.out.println(carro.imprimir());
			}
		}
	}

}
