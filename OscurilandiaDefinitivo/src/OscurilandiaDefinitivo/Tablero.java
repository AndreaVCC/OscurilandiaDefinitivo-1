/* Definicion de la Clase Tablero
 * 
 * 
 */

package OscurilandiaDefinitivo;

import java.util.ArrayList;

import java.util.*;

public class Tablero {

	//private static final String String = null;

	// Atributos
	String tablero[][] = new String[15][15];
	
	public  ArrayList <Huevo> listaHuevos = new ArrayList <>(); 
	public ArrayList <Carro> listaCarros = new ArrayList <>();
	Carro carros = new Carro();
	
	int puntaje=0;
	
	// Contructor
	
	

//	public Tablero(String[][] tablero) {
//			this.tablero = tablero;
//	}
		
	public Tablero(String[][] tablero, ArrayList<Huevo> listaHuevos, ArrayList<Carro> listaCarros, Carro carros,
			int puntaje) {
		this.tablero = tablero;
		this.listaHuevos = listaHuevos;
		this.listaCarros = listaCarros;
		this.carros = carros;
		this.puntaje = puntaje;
	}

	public Tablero () {
			
	}
	
	// Metodo crea tablero 15x15 ---------------------//
<<<<<<< HEAD
	public void creaTablero() {
		
	// Rellenar tablero completo con signo + ---------//
			
		for (int x=0; x < tablero.length; x++) {
			for (int y=0; y < tablero[x].length; y++) {
			tablero[x][y] ="+";
			}
		}
	}
	
	
	// Crear arraylist con todos los coches
=======

>>>>>>> branch 'master' of https://github.com/Jose-Paulo/OscurilandiaDefinitivo.git
	public void agregarCarro() {
		Scanner teclado = new Scanner(System.in);
		creaTablero();
	
		
		for (int i = 0; i < 2; i++) {
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
//				System.out.println("asignacion ub x: " + ubicacionX);
//				System.out.println("asignacion ub y: " + ubicacionY);
				numCoche = numCoche + 1;
			
				Kromi kromi = new Kromi(cantidadOcupantes, fechaIngreso, ubicacionX, ubicacionY, numCoche,
						anioFabricacion, marca);
<<<<<<< HEAD
				
				listaCarros.add(i, kromi);
=======
				listaCarros.add(0, kromi);
>>>>>>> branch 'master' of https://github.com/Jose-Paulo/OscurilandiaDefinitivo.git
				System.out.println("Kromi " + numCoche + " agregado con exito");
				
//				System.out.println("Imprimir Kromi");
//				//kromi.imprimir();
//				System.out.print("Lsita Carros: " + "\n" + listaCarros);
//				
				
			} else if (i > 2 && i <= 7) {
				System.out.println("Agregando tipo Caguano");
				System.out.println("Alcance de tiro:");
				int alcanceTiro = teclado.nextInt();
				System.out.println("Color confeti:");
<<<<<<< HEAD
				String colorConfeti = teclado.next();
				posicionarCanguanos();
				// Asignamos a los atributos la posicion x,y en el tablero.
				ubicacionX = carros.getUbicacionX();
				ubicacionY = carros.getUbicacionY();
//				System.out.println("asignacion ub x: " + ubicacionX);
//				System.out.println("asignacion ub y: " + ubicacionY);
				numCoche = numCoche + 1;			
				
=======
				String colorConfeti = scanner.next();
>>>>>>> branch 'master' of https://github.com/Jose-Paulo/OscurilandiaDefinitivo.git
				Caguano caguano = new Caguano(cantidadOcupantes, fechaIngreso, ubicacionX, ubicacionY, numCoche,
						alcanceTiro, colorConfeti);
<<<<<<< HEAD
				
				listaCarros.add(i, caguano);
				//caguano.imprimir();
				
				
	
=======
				listaCarros.add(1, caguano);

>>>>>>> branch 'master' of https://github.com/Jose-Paulo/OscurilandiaDefinitivo.git
			} else {
				System.out.println("Agregando tipo Trupalla");
				System.out.println("Nivel de armadura:");
				int nivelArmadura = teclado.nextInt();
				System.out.println("Nombre conductor:");
<<<<<<< HEAD
				String nombreConductor = teclado.nextLine();
				posicionarTrupallas();
				// Asignamos a los atributos la posicion x,y en el tablero.
				ubicacionX = carros.getUbicacionX();
				ubicacionY = carros.getUbicacionY();
//				System.out.println("asignacion ub x: " + ubicacionX);
//				System.out.println("asignacion ub y: " + ubicacionY);
				numCoche = numCoche + 1;
				
				
=======
				String nombreConductor = scanner.next();
>>>>>>> branch 'master' of https://github.com/Jose-Paulo/OscurilandiaDefinitivo.git
				Trupalla trupalla = new Trupalla(cantidadOcupantes, fechaIngreso, ubicacionX, ubicacionY, numCoche,
						nivelArmadura, nombreConductor);
<<<<<<< HEAD
				listaCarros.add(i, trupalla);
				//trupalla.imprimir();
=======
				listaCarros.add(2, trupalla);
>>>>>>> branch 'master' of https://github.com/Jose-Paulo/OscurilandiaDefinitivo.git
			}
			
		}
<<<<<<< HEAD
		teclado.close();
=======
		scanner.close();

		// Muestra el listado de todos los coches agregados al arraylist, Prueba
		for (Carro cars : listaCarros) {
			System.out.println(cars);
		}
		
>>>>>>> branch 'master' of https://github.com/Jose-Paulo/OscurilandiaDefinitivo.git
	}
<<<<<<< HEAD
=======
	
	public void creaTablero() {
>>>>>>> branch 'master' of https://github.com/Jose-Paulo/OscurilandiaDefinitivo.git
		
		
	// Posicionar dentro de la tablero los carros... Kromis
	public void posicionaKromis() {
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
	
	public void posicionarCanguanos() {
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
	
	public void posicionarTrupallas() {
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
		System.out.println("Binvenido a Oscurilandia");
	
				
		boolean seguir = false;
		do {
			Scanner opc = new Scanner(System.in);
		
			System.out.print("Ingrese Fila entre 0 y 14: ");
			int fil = opc.nextInt();
			System.out.print("Ingrese Columna entre 0 y 14:");
			int col = opc.nextInt();
			
			// validamos que el lanzamiento este dentro del tablero
			if (fil > 14 || col > 14) {
				System.out.println("coordenadas fuera del recuadro... vuelva a intentarlo");
			
			}
			else {
			
				if (tablero[fil][col].equals("T") || tablero[fil][col].equals("C") || tablero[fil][col].equals("K")){
					System.out.println(tablero[fil][col].equals("T"));

					if (tablero[fil][col].equals("T")){
						puntaje = puntaje + 1;
						System.out.println("Trupalla inutilizado");
						System.out.println("Puntaje actual: " + puntaje);
						tablero[fil][col] = "X";
						
					}
						else {
							if  (tablero[fil][col] == "C") {
								puntaje = puntaje + 2 ;
								System.out.println("Caguano inutilizado");
								System.out.println("Puntaje actual: " + puntaje);
								
								for (int i=0;i<listaCarros.size();i++) {
									System.out.println(fil);
									System.out.println(col);
									if (listaCarros.get(i).getUbicacionX() == fil && listaCarros.get(i).getUbicacionY() == col) {
										System.out.println("ubicacion encontrada");
										tablero[fil][col] = "X";
										
									}
									else {
										System.out.println("No es igual");
									}
										
									
								}
								carros.getUbicacionX();
								carros.getUbicacionY();
								
							}
							else {
								if (tablero[fil][col].equals("K")) {
									puntaje =  puntaje + 3;
									System.out.println("Kromi inutilizado");
									System.out.println("Puntaje actual: " + puntaje);
									tablero[fil][col] = "X";
								}
							}
						}


					}
					else {
						if (tablero[fil][col].equals("X"))
							System.out.println("Puntaje actual: " + puntaje);
						else {
							tablero[fil][col] = "H";
						}
					}
				}
<<<<<<< HEAD
					System.out.println("¿Desea continuar Y / N ?");
					String cont = opc.next();
					if (cont.equalsIgnoreCase("N")){
						seguir = false;
						System.out.println("Puntaje actual: " + puntaje);
						//break;
			
		
			muestraTablero();
					}
		
					opc.close();
			}while (seguir == true);
		
}
=======
			}
			//				System.out.println("Â¿Desea continuar Y / N ?");
			//				String cont = continuar.next();
			//				if (cont.equalsIgnoreCase("N")){
			//					seguir = false;
			//					System.out.println("Puntaje actual: " + puntaje);
			//					break;
			//				}
			//				else {
			//muestraTablero();
			//				}
		}while (seguir = true);

		lanzahuevo.close();
		continuar.close();

	}

>>>>>>> branch 'master' of https://github.com/Jose-Paulo/OscurilandiaDefinitivo.git
}
