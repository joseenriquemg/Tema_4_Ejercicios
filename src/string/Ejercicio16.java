package string;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {

		// Variable que recoge la frase del jugador 1
		String frase;

		// Variable que recoge los intentos del jugador 2
		String intento;

		// Variable que alamacena la frase desordenada
		String fraseDesordenada;

		// Variable que cuenta el número de aciertos
		int intentos = 0;

		// Variable para guardar la cantidad de letras acertadas
		int coincidencias;

		// Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);

		// Solicitamos la frase al jugador 1
		System.out.println("Jugador 1 escriba una frase/palabra:");

		// Leemos la frase del usuario
		frase = sc.nextLine();

		// Desordenamos la frase del jugador 1 llamando a la funcion
		fraseDesordenada = textoDesordenado(frase);
		System.out.println("Frase desordenada: " + fraseDesordenada);

		// Bucle para repetir al jugador 2 hasta acertar
		do {
			System.out.println("Jugador 2 escriba su intento:");
			intento = sc.nextLine();
			intentos++;

			coincidencias = contarCoincidencias(frase, intento);
			System.out.println("Coincidencias con la frase original: " + coincidencias);
		} while (!intento.equalsIgnoreCase(frase));
		// Ofrecemos el resultado al usuario
		System.out.println("ENHORABUENA, has acertado en " + intentos + " intentos.");

		// Cerramos el Scanner
		sc.close();

	}

	/*
	 * Funcion que recoge el texto deordenado
	 */
	public static String textoDesordenado(String frase) {

		// Array que guarda las letras de la frase introducidas por el
		// jugador 1
		char[] letras = frase.toCharArray();

		// Array para almacenar las letras desordenadas
		char[] letrasDesordenadas = new char[frase.length()];

		// Variable donde guardaremo el número random
		int numeroLetra;

		// Creamos un nuevo numero Ramdon
		Random random = new Random();

		// Bucle que recorres las letras y las añade desordenadas
		for (int i = 0; i < frase.length(); i++) {

			// Creamos un do while para crear un random de las letras que faltan por
			// seleccionar
			do {
				numeroLetra = random.nextInt(frase.length());

				// Comprobamos si la letras es repetida
			} while (letras[numeroLetra] == 0);

			// Asignamos una letra aleatoria de 'letras' a 'letrasDesordenadas'
			letrasDesordenadas[i] = letras[numeroLetra];

			// Marcamos la letra como ya seleccionada
			letras[numeroLetra] = 0;

		} // Cierre de la función

// Devolvemos las letras desordenadas como una cadena
		return String.valueOf(letrasDesordenadas);
	}

	/*
	 *  Función para contar las letras acertadas
	 */
	public static int contarCoincidencias(String fraseOriginal, String intento) {

		// Variable donde guardaremos la cantidad de letras acertadas
		int coincidencias = 0;

		// Bucle que recoge el numero de letras acertadas
		for (int i = 0; i < fraseOriginal.length() && i < intento.length(); i++) {
			if (fraseOriginal.charAt(i) == intento.charAt(i)) {
				coincidencias++;
			}
		}

		// Devolvemos el número de letras acertadas
		return coincidencias;

	}

}
