/* Definicion de la Clase Tablero
*Los métodos quedaron como static, para que el menú pudiese llamarlos, y viceversa. 
*Al cambiar a static, se cambiaron también algunas líneas de los constructores, porque sino daba errores y warnings.
 * 
 * 
 */

package OscurilandiaDefinitivo;

import java.util.ArrayList;
import java.util.Scanner;

public class Tablero {


	// Atributos
	static String tablero[][] = new String[15][15];
	static String tablero2 [][] = new String[15][15];
	
	public static  ArrayList <Huevo> listaHuevos = new ArrayList <>(); 
	public static ArrayList <Carro> listaCarros = new ArrayList <>();
	public int[] id = new int[29];
	static Carro carros = new Carro();

	
	static Scanner teclado = new Scanner(System.in);
	
	static int puntaje=0;

	
	
	// Contructor
	


	public Tablero () {
			
	}
	
/*
	
	public Tablero(String[][] tablero, String[][] tablero2, ArrayList<Huevo> listaHuevos, ArrayList<Carro> listaCarros,
			int[] id, Carro carros, Scanner teclado, int puntaje) {
		super();
		this.tablero = tablero;
		this.tablero2 = tablero2;
		this.listaHuevos = listaHuevos;
		this.listaCarros = listaCarros;
		this.id = id;
		this.carros = carros;
		this.teclado = teclado;
		this.puntaje = puntaje;
	}

*/

	// Metodo crea tablero 15x15 ---------------------//
	public static void creaTablero() {
		
	// Rellenar tablero completo con signo + ---------//
			
		for (int x=0; x < tablero.length; x++) {
			for (int y=0; y < tablero[x].length; y++) {
			tablero[x][y] ="+";
			tablero2[x][y] ="+";
			}
		}
	}
	
	
	// Crear arraylist con todos los coches
		public static void agregarCarro() {
		//Scanner teclado = new Scanner(System.in);
		creaTablero();
	
		
		for (int i = 0; i < 5; i++) {
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
				// llamamos al metodo posicionar Kromi en Tablero
				posicionaKromis();
				// Asignamos a los atributos la posicion x e y en el tablero.
				ubicacionX = carros.getUbicacionX();
				ubicacionY = carros.getUbicacionY();

				numCoche = numCoche + 1;
				
			
				Kromi kromi = new Kromi(cantidadOcupantes, fechaIngreso, ubicacionX, ubicacionY, numCoche,
						anioFabricacion, marca);
				
				listaCarros.add(i, kromi);
				System.out.println("Kromi " + numCoche + " agregado con exito");
								
				
			} else if (i > 2 && i <= 7) {
				System.out.println("Agregando tipo Caguano");
				System.out.println("Alcance de tiro:");
				int alcanceTiro = teclado.nextInt();
				System.out.println("Color confeti:");
				String colorConfeti = teclado.next();
				posicionarCanguanos();
				
				// Asignamos a los atributos la posicion x,y en el tablero.
				ubicacionX = carros.getUbicacionX();
				ubicacionY = carros.getUbicacionY();

				numCoche = numCoche + 1;			
				
				Caguano caguano = new Caguano(cantidadOcupantes, fechaIngreso, ubicacionX, ubicacionY, numCoche,
						alcanceTiro, colorConfeti);
				
				listaCarros.add(i, caguano);
	
				
				
	
			} else {
				System.out.println("Agregando tipo Trupalla");
				System.out.println("Nivel de armadura:");
				int nivelArmadura = teclado.nextInt();
				System.out.println("Nombre conductor:");
				String nombreConductor = teclado.nextLine();
				posicionarTrupallas();
				// Asignamos a los atributos la posicion x,y en el tablero.
				ubicacionX = carros.getUbicacionX();
				ubicacionY = carros.getUbicacionY();
//				System.out.println("asignacion ub x: " + ubicacionX);
//				System.out.println("asignacion ub y: " + ubicacionY);
				numCoche = numCoche + 1;
				
				
				Trupalla trupalla = new Trupalla(cantidadOcupantes, fechaIngreso, ubicacionX, ubicacionY, numCoche,
						nivelArmadura, nombreConductor);
				listaCarros.add(i, trupalla);
				//trupalla.imprimir();
			}
			
		}
		
	}
		
		
	// Posicionar dentro de la tablero los carros... Kromis
	public static void posicionaKromis() {
		//String posxy = " ";
		boolean pos = false;
		do {
			// Generamos numero random para posicionar
			int x = (int) (Math.random()*13);
			int y = (int) (Math.random()*15);
	
			// validamos que el tablero tenga 3 posiciones libres
			if (tablero[x][y].equals("+") && tablero[x+1][y].equals("+") && tablero[x+2][y].equals("+")){
				tablero[x][y] = "K";
				tablero[x+1][y] = "K";
				tablero[x+2][y] = "K";
				
				pos = true;
		
				// Asignamos posiciones a los atributos de objeto carro
				carros.setUbicacionX(x);
				carros.setUbicacionY(y);

				pos = true;
				break;

			}
	
		}while (pos == false);
		
	}
	
	public static void posicionarCanguanos() {
	// Posicionar dentro de la tablero los carros... Canguanos
		boolean pos = false;
		do {
			// Generamos numero random para posicionar
			int x = (int) (Math.random()*14);
			int y = (int) (Math.random()*14);
			// validamos que tablero este vacio. 
			if (tablero[x][y].equals("+") && tablero[x][y+1].equals("+")) {
				tablero[x][y] = "C";
				tablero[x][y+1] = "C";
				
			pos = true;
			
			// Asignamos posiciones a los atributos de objeto carro
			carros.setUbicacionX(x);
			carros.setUbicacionY(y);

			pos = true;
			break;

		}
	

		}while (pos == false);
	
	}
	
	public static void posicionarTrupallas() {
	// Posicionar dentro de la tablero los carros... Trupallas
		boolean pos = false;
		do {
			// Generamos numero random para posicionar
			int x = (int) (Math.random()*15);
			int y = (int) (Math.random()*15);
			// validamos que tablero este vacio. 
			if (tablero[x][y].equals("+")) {
				tablero[x][y] = "T";
				
				pos = true;
				
				// Asignamos posiciones a los atributos de objeto carro
				carros.setUbicacionX(x);
				carros.setUbicacionY(y);

				pos = true;
				break;

			}


		}while (pos == false);
		
	}
	

	
	public static void muestraTablero() {
	// Mostramos Tablero con Coches
	System.out.println("Tablero Oficial");
	System.out.println(" ");
	for (int x=0; x < tablero.length; x++) {
		for (int y=0; y < tablero[x].length; y++) {
			System.out.print(tablero[x][y]+" ");
		}
		 System.out.println();
	}

	// Mostramos Tablero SIN Coches
	System.out.println(" ");
	for (int x=0; x < tablero2.length; x++) {
		for (int y=0; y < tablero2[x].length; y++) {
			System.out.print(tablero2[x][y]+" ");
		}
		 System.out.println();
	}
	}

	// Metodo lanza huevos a coches

	public static void lanzarHuevo () {
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
			
			}
			else {
			
				if (tablero[fil][col].equals("T") || tablero[fil][col].equals("C") || tablero[fil][col].equals("K")){
					if (tablero[fil][col].equals("T")){
						puntaje = puntaje + 1;
						System.out.println("Trupalla inutilizado");
						System.out.println("Puntaje actual: " + puntaje);
						tablero[fil][col] = "X";
						tablero2[fil][col] = "X";
						huevo.setFilaCaida(fil);
						huevo.setColumnaCaida(col);
						huevo.setPuntaje(puntaje);
						listaHuevos.add(huevo);
						for (Huevo huevoslanzados: listaHuevos) {
							System.out.println(huevoslanzados);
						}
						
		
						
					}
						else {
							if  (tablero[fil][col].equals("C")) {
								puntaje = puntaje + 2;
								System.out.println("Puntaje actual: " + puntaje);
								huevo.setFilaCaida(fil);
								huevo.setColumnaCaida(col);
								huevo.setPuntaje(puntaje);
								listaHuevos.add(huevo);							
								
								System.out.println(fil);
								System.out.println(col);
								tablero[fil][col] = "X";
								tablero2[fil][col] = "X";
								carros.getUbicacionX();
								carros.getUbicacionY();
								for (Carro recorre:listaCarros) {	
									if (recorre.getUbicacionX() == fil) {
										if (recorre.getUbicacionY() == col && tablero[fil][col+1].equals("X")) {
											System.out.println("Encontro posicion exacta Caguano 1");
											System.out.println("7 puntos EXTRA Caguano");
											puntaje = puntaje + 7;
										} else  if (col - recorre.getUbicacionY() == 1 && tablero[fil][col-1].equals("X")) {
										       System.out.println("7 puntos EXTRA Caguano 2");
										       puntaje = puntaje + 7;
										}			
										         
									}
								}

							}
							else {
								if (tablero[fil][col].equals("K")) {
									puntaje =  puntaje + 3;
								
									System.out.println("Puntaje actual: " + puntaje);
									tablero[fil][col] = "X";
									tablero2[fil][col] = "X";
									huevo.setFilaCaida(fil);
									huevo.setColumnaCaida(col);
									huevo.setPuntaje(puntaje);
									listaHuevos.add(huevo);
										
									
									for (Carro recorre:listaCarros) {
										if (recorre.getUbicacionY() == col) {
											if (recorre.getUbicacionX() == fil && tablero[fil+1][col].equals("X") && tablero[fil+2][col].equals("X")){														
												System.out.println("10 puntos EXTRA Kromi");
												puntaje = puntaje + 10;
														
											}else if (fil - recorre.getUbicacionX() == 1 && tablero[fil-1][col].equals("X") && tablero[fil+1][col].equals("X")){
								       			System.out.println("10 puntos EXTRA Kromi");
										        puntaje = puntaje + 10;
										     
											}else if (fil - recorre.getUbicacionX() == 2 && tablero[fil-1][col].equals("X") && tablero[fil-2][col].equals("X")){
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
							tablero2[fil][col] = "H";
						}
					}
					muestraTablero();
					System.out.println("Puntaje actual: " + puntaje);
				
					System.out.println("¿Desea continuar Y / N ?");
					String cont = teclado.next();
					if (cont.equalsIgnoreCase("N")){	
						seguir = false;
					
					
					}
					else {
						seguir = true;
					}
					
				}
		
			
			
				
			}while (seguir == true);
		
			
		}
		
		
}


		

