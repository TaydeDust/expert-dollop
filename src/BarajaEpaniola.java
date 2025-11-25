import java.util.Scanner;

public class BarajaEpaniola {
	private static final int NUMERODECARTA = 8;
	private static final Scanner teclado = new Scanner(System.in);
	private static final char PALOBASTO = 'B';
	private static final char PALOORO = 'O';
	private static final char PALOCOPA = 'C';
	private static final char PALOESPADA = 'E';
	private static final char SOTA = 'S';
	private static final char CABALLO = 'C';
	private static final char REY = 'R';

//creamos todas las constates que vamos a utilizar más de una vez en los metodos, todas estas constantes podrian cambiar en el futuro
	public static void main(String[] args) {

		int num = 0;

		do {
			System.out.println(" ");
			System.out.println("1. Mostrar un palo");
			System.out.println("2. Mostrar baraja");
			System.out.println("3. Carta aleatoria");
			System.out.println("4. Salir");
			num = teclado.nextInt();
			if (num == 1 || num == 2 || num == 3) {
				menu(num);
				// llamamos a el metodo menu para que lea que opción a marcado el usuario.
			}
		} while (num != 4);
		// en el do escribimos las instrucciones del programa para el cliente.
		System.out.println("!Hasta luego¡");
	}

	private static void menu(int num) {
		// tenemos el menu con cada if con su correspondiente opción dependiendo de lo
		// escrito por el usuario.
		if (num == 1) {
			mostrarPalo();
		} else if (num == 2) {
			mostrarBaraja();
		} else if (num == 3) {
			cartaAleatorio();
		}

	}

	private static void mostrarPalo() {
		// muestra un palo 
		System.out.println("Eligue el palo: ");
		System.out.println("0. Bastos");
		System.out.println("1. Oro");
		System.out.println("2. Sota");
		System.out.println("3. Espada");
		int numrandom=teclado.nextInt();
		if (numrandom == 0) {
			for (int i = 1; i < NUMERODECARTA; i++) {
				System.out.print(" " + i + "-" + PALOBASTO);
			}
			System.out.print(
					" " + SOTA + "-" + PALOBASTO + " " + CABALLO + "-" + PALOBASTO + " " + REY + "-" + PALOBASTO);
		} // Muestra el palo de bastos
		else if (numrandom == 1) {
			for (int i = 1; i < NUMERODECARTA; i++) {
				System.out.print(" " + i + "-" + PALOORO);
			}
			System.out.print(" " + SOTA + "-" + PALOORO + " " + CABALLO + "-" + PALOORO + " " + REY + "-" + PALOORO);
		} // Muestra el palo de oro
		else if (numrandom == 2) {
			for (int i = 1; i < NUMERODECARTA; i++) {
				System.out.print(" " + i + "-" + PALOESPADA);
			}
			System.out.print(
					" " + SOTA + "-" + PALOESPADA + " " + CABALLO + "-" + PALOESPADA + " " + REY + "-" + PALOESPADA);
		} // muestra el palo de sota
		else if (numrandom == 3) {
			for (int i = 1; i < NUMERODECARTA; i++) {
				System.out.print(" " + i + "-" + PALOCOPA);
			}
			System.out.print(" " + SOTA + "-" + PALOCOPA + " " + CABALLO + "-" + PALOCOPA + " " + REY + "-" + PALOCOPA);
		} // muestra el palo de espadas
	}

	private static void cartaAleatorio() {
		int numrandom2 = 0;
		// muestra una carta aleatoria de la baraja.
		double numrandom = Math.random() * 4;
		// utilizamos el Math.random para sacar un numero entre 0 y 0.9 periodico, y lo
		// multiplicamos por 4, las opciones disponibles.
		numrandom = Math.floor(numrandom);
		// redondeamos hacia abajo con el Math.floor.
		do {
			double numrandomElegir = Math.random() * 11;
			// numero de cartas que tenemos que son 10, multiplicamos por once porque
			// contamos el 0 en el Math.random.
			numrandom2 = (int) Math.floor(numrandomElegir);
		} while (numrandom2 == 0);
		// redondeamos hacia abajo con el Math.floor y con el (int) convertimos el
		// double en entero.
		if (numrandom == 0) {
			if (numrandom2 < NUMERODECARTA) {
				System.out.print(" " + numrandom2 + "-" + PALOBASTO);
			} else if (numrandom == NUMERODECARTA) {
				System.out.print(" " + SOTA + "-" + PALOBASTO);
			} else if (numrandom == 9) {
				System.out.print(" " + CABALLO + "-" + PALOBASTO);
			} else {
				System.out.print(" " + REY + "-" + PALOBASTO);
			}
		} // muestra una carta aleatoria del palo de basto.
		else if (numrandom == 1) {
			if (numrandom2 < NUMERODECARTA) {
				System.out.print(" " + numrandom2 + "-" + PALOORO);
			} else if (numrandom == NUMERODECARTA) {
				System.out.print(" " + SOTA + "-" + PALOORO);
			} else if (numrandom == 9) {
				System.out.print(" " + CABALLO + "-" + PALOORO);
			} else {
				System.out.print(" " + REY + "-" + PALOORO);
			}
		} // muestra una carta aleatoria del palo de oro.
		else if (numrandom == 2) {
			if (numrandom2 < NUMERODECARTA) {
				System.out.print(" " + numrandom2 + "-" + PALOESPADA);
			} else if (numrandom == NUMERODECARTA) {
				System.out.print(" " + SOTA + "-" + PALOESPADA);
			} else if (numrandom == 9) {
				System.out.print(" " + CABALLO + "-" + PALOESPADA);
			} else {
				System.out.print(" " + REY + "-" + PALOESPADA);
			}
		} // muestra una carta aleatoria del palo de espada.
		else if (numrandom == 3) {
			if (numrandom2 < NUMERODECARTA) {
				System.out.print(" " + numrandom2 + "-" + PALOCOPA);
			} else if (numrandom == NUMERODECARTA) {
				System.out.print(" " + SOTA + "-" + PALOCOPA);
			} else if (numrandom == 9) {
				System.out.print(" " + CABALLO + "-" + PALOCOPA);
			} else {
				System.out.print(" " + REY + "-" + PALOCOPA);
			}
		} // muestra una carta aleatoria del palo de copa.

	}

	private static void mostrarBaraja() {
		// muestra la baraja entera, en cada linea muestra un palo.
		for (int i = 1; i < NUMERODECARTA; i++) {
			System.out.print(" " + i + "-" + PALOBASTO);
		}
		System.out.print(" " + SOTA + "-" + PALOBASTO + " " + CABALLO + "-" + PALOBASTO + " " + REY + "-" + PALOBASTO);
		System.out.println();
		for (int i = 1; i < NUMERODECARTA; i++) {
			System.out.print(" " + i + "-" + PALOORO);
		}
		System.out.print(" " + SOTA + "-" + PALOORO + " " + CABALLO + "-" + PALOORO + " " + REY + "-" + PALOORO);
		System.out.println();
		for (int i = 1; i < NUMERODECARTA; i++) {
			System.out.print(" " + i + "-" + PALOESPADA);
		}
		System.out
				.print(" " + SOTA + "-" + PALOESPADA + " " + CABALLO + "-" + PALOESPADA + " " + REY + "-" + PALOESPADA);
		System.out.println();
		for (int i = 1; i < NUMERODECARTA; i++) {
			System.out.print(" " + i + "-" + PALOCOPA);
		}
		System.out.print(" " + SOTA + "-" + PALOCOPA + " " + CABALLO + "-" + PALOCOPA + " " + REY + "-" + PALOCOPA);
	}

}