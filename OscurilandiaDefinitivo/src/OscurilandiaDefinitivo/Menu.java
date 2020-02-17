package OscurilandiaDefinitivo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

	/* COMENTANDO MIENTRAS 
	static List<Kromi>ListaKromis = new ArrayList <Kromi>();
	static List<Caguano>ListaCaguanos = new ArrayList <Caguano>();
	static List<Trupalla>ListaTrupallas = new ArrayList <Trupalla>();
	private static Scanner scanner;
	private static void mostrarKromis() {
		System.out.println("Las Kromis actuales son: ");
		for (Kromi est:ListaKromis) {
			est.imprimir();
		}
	}
	private static void mostrarCaguanos() {
		System.out.println("Los Caguanos actuales son: ");
		for (Caguano est:ListaCaguanos) {
			est.imprimir();
		}
	}
	private static void mostrarTrupallas() {
		System.out.println("Las Trupallas actuales son: ");
		for (Trupalla est:ListaTrupallas) {
			est.imprimir();
		}
	}
	
	
	 
	private static void agregar() {
		System.out.println();
		int op1 = scanner.nextInt(); //se lee la opcion ingresada
		while (op1 != 4) {
			switch (op1) {
			case 1:
				agregarKromi();
				break;
			case 2:
				agregarCaguano();
				break;
			case 3:
				//agregarTrupalla();
				break;
			case 4:
				System.out.println("Volvemos...");
				break;
			default:
				System.out.println("Ingrese una opcion valida");
				break;
			}
			System.out.println("¿Qué desea hacer? \n 1) Atributos vehículos \n 2) Generar Carros \n 3) Mostrar Matriz \n 4) Calcular Puntajes \n 5) Salir");
			System.out.print("Elija su opcion: ");
			op1 = scanner.nextInt(); //se lee la opcion ingresada
		}
	}
	private static void agregarKromi() {
		System.out.println("Cantidad Ocupantes: ");
		String ocupantesKromi = scanner.next(); //se lee la opcion ingresada
		System.out.println("Fecha de Ingreso: ");
		String ingresoKromi = scanner.next(); //se lee la opcion ingresada
		System.out.println("Institución: ");
		String institucionKromi = scanner.next(); //se lee la opcion ingresada
		System.out.println("Ubicacion Tablero: ");
		String tableroKromi = scanner.next(); //se lee la opcion ingresada
		System.out.println("Año Fabricación: ");
		String fabricacionKromi = scanner.next(); //se lee la opcion ingresada
		System.out.println("Marca: ");
		String marcaKromi = scanner.next(); //se lee la opcion ingresada
		Kromi kromi1 = new Kromi (ocupantesKromi, ingresoKromi, institucionKromi, tableroKromi, fabricacionKromi, marcaKromi);
		ListaKromis.add(kromi1);//se guarda objeto en lista Kromis
	}
	private static void agregarCaguano() {
		System.out.println("Cantidad Ocupantes: ");
		String ocupantesCaguano = scanner.next(); //se lee la opcion ingresada
		System.out.println("Fecha de Ingreso: ");
		String ingresoCaguano = scanner.next(); //se lee la opcion ingresada
		System.out.println("Institución: ");
		String institucionCaguano = scanner.next(); //se lee la opcion ingresada
		System.out.println("Ubicacion Tablero: ");
		String tableroCaguano = scanner.next(); //se lee la opcion ingresada
		System.out.println("Alcance de tiro: ");
		String alcanceCaguano = scanner.next(); //se lee la opcion ingresada
		System.out.println("Color del confeti: ");
		String confetiCaguano = scanner.next(); //se lee la opcion ingresada
		Caguano caguano1 = new Caguano (ocupantesCaguano, ingresoCaguano, institucionCaguano, tableroCaguano, alcanceCaguano, confetiCaguano);
		ListaCaguanos.add(caguano1);//se guarda objeto en lista Caguanos
	}
	private static void mostrar() {
		System.out.println("¿Qué desea hacer? \n 1) Mostrar Kromis \n 2) Mostrar Caguanos\n 3) Mostrar Trupallas \n 4) Volver");
		System.out.print("Elija su opcion: ");
		int op3 = scanner.nextInt(); //se lee la opcion ingresada
		while (op3 != 4) {
			switch (op3) {
			case 1:
				mostrarKromis();
				break;
			case 2:
				mostrarCaguanos();
				break;
			case 3:
				mostrarTrupallas();
				break;
			case 4:
				System.out.println("Volvemos...");
				break;
			default:
				System.out.println("Ingrese una opcion valida");
				break;
			}
			System.out.println("¿Qué desea hacer? \n 1) Atributos vehículos \n 2) Generar Carros \n 3) Mostrar Matriz \n 4) Calcular Puntajes \n 5) Salir");
			System.out.print("Elija su opcion: ");
			op3 = scanner.nextInt(); //se lee la opcion ingresada
		}
	}
	
	*/
	private static void salir() {
		System.out.print("Hasta luego");
	}
	
	public static void main(String[] args) {
		//Menu del programa y lector de variables.
		Tablero tablero = new Tablero();

		Scanner scanner = new Scanner (System.in);
		System.out.println("¿Qué desea hacer? \n 1) Atributos vehículos \n 2) Generar Carros \n 3) Mostrar Matriz \n 4) Calcular Puntajes \n 5) Salir");
		System.out.print("Elija su opcion: ");
		int opcion = scanner.nextInt(); //se lee la opcion ingresada
		while (opcion != 5) {
			switch (opcion) {
			case 1:
				tablero.agregarCarro();
				break;
			case 2:
				tablero.creaTablero();
				tablero.posicionaKromis();
				tablero.posicionarCanguanos();
				tablero.posicionarTrupallas();
				tablero.muestraTablero();
				break;
			case 3:
				tablero.creaTablero();
				tablero.muestraTablero();
				break;
			case 4:
				//calcular()
				break;
			case 5:
				salir();
				break;				
			default:
				System.out.println("\n --Ingrese una opcion válida-- \n");
				break;
			}
			System.out.println("¿Qué desea hacer? \n 1) Atributos vehículos \n 2) Generar Carros \n 3) Mostrar Matriz \n 4) Calcular Puntajes \n 5) Salir");
			System.out.print("Elija su opcion: ");
			opcion = scanner.nextInt(); //se lee la opcion ingresada			
		}
		scanner.close();
	}
	/*public static void main(String[] args) {
		System.out.println("¿Qué desea hacer? \n 1) Atributos vehículos \n 2) Generar Carros \n 3) Mostrar Matriz \n 4) Calcular Puntajes \n 5) Salir");
		Scanner opcion = new Scanner();
		while (opcion != 5) {
			switch(opcion) {
			case 1:
				System.out.println("hola");
				break;
			case 2:
				//Se imprime tablero
				Tablero tablero = new Tablero();
				tablero.creaTablero();
				tablero.posicionaKromis();
				tablero.posicionarCanguanos();
				tablero.posicionarTrupallas();
				tablero.muestraTablero();
				tablero.lanzarHuevo();
				break;
			case 3:
				break;
			case 4:
				break;
		}
		}
	}*/
}