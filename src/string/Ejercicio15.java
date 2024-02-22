package string;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {

		// Variable donde guardaremos la frase del jugador 1
		String frase;

		// Variable donde guardaremos el intento del jugador 2
		String intento;

		// Variable donde guardaremos la frase desordenada
		String fraseDesordenada;

		// //Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);

		// Solicitamos la frase al jugador 1
		System.out.println("Jugador 1 escriba una frase o palabra:");

		// Leemos la frase del teclado
		frase = sc.nextLine();

		// Desordenamos la frase del jugador 1 llamando a la funcion
		fraseDesordenada = textoDesordenado(frase);
		System.out.println("Frase desordenada: " + fraseDesordenada);

		// Creamos un do while para que no pare hasta acertar
		do {
			System.out.println("Jugador 2 escriba su intento:");
			intento = sc.nextLine();

		} while (!intento.equalsIgnoreCase(frase));

		// Imprimimos el resultado de acierto
		System.out.println("ENHORABUENA");

		// Cerramos el Scanner
		sc.close();

	}

	/*
	 * Funcion que recoge el texto desordenado
	 */
	public static String textoDesordenado(String frase) {

		// Arrays para recoger las letras introducidas por el jugador 1
		char[] letras = frase.toCharArray();

		// Arrays que almacenara las letras desordenadas
		char[] letrasDesordenadas = new char[frase.length()];

		// Variable que recoge el numero Ramdon
		int numeroLetra;

		// Creamos un nuevo numero Ramdon
		Random random = new Random();

		// Bucle para ir escogiendo letras para añadir en la tabla de letras
		// desordenadas
		for (int i = 0; i < frase.length(); i++) {

			// Generamos un número random mientras la letra no haya sido seleccionada
			do {
				numeroLetra = random.nextInt(frase.length());

				// Verificamos si la letra ya ha sido seleccionada
			} while (letras[numeroLetra] == 0);

			// Asignamos una letra aleatoria de 'letras' a 'letrasDesordenadas'
			letrasDesordenadas[i] = letras[numeroLetra];

			// Marcamos la letra como ya seleccionada
			letras[numeroLetra] = 0;
		}

		// Devolvemos las letras desordenadas como una cadena
		return String.valueOf(letrasDesordenadas);

	}

}
