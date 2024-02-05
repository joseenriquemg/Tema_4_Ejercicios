package arraysbidimensionales;

import java.util.Random;

/*
 * Clase Ejercicio05
 */
public class Ejercicio05 {

	// Método que genera y devuelve una matriz de enteros de tamaño 4x5 con números
	// aleatorios
	public static int[][] rellenaArray() {
		int[][] tabla = new int[4][5]; // Crea una nueva matriz de tamaño 4x5
		Random rand = new Random(); // Crea un objeto Random para generar números aleatorios

		// Bucle para cada fila de la matriz
		for (int i = 0; i < tabla.length; i++) {
			// Bucle para cada columna de la fila actual
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = rand.nextInt(1000 - 100) + 100; // Asigna un número aleatorio entre 100 y 999 a cada
																// elemento
			}
		}

		return tabla; // Retorna la matriz generada
	}

	/*
	 * Metodo main
	 */
	public static void main(String[] args) {
		int[][] sumatorios = rellenaArray(); // Genera una matriz de números aleatorios llamando al método rellenaArray

		int sumaFila = 0; // Variable para almacenar la suma de cada fila
		int sumaColumna = 0; // Variable para almacenar la suma de cada columna
		int total = 0; // Variable para almacenar la suma total de todos los elementos de la matriz

		// Bucle para cada fila de la matriz
		for (int[] fila : sumatorios) {
			sumaFila = 0; // Reinicia la suma de la fila a cero
			for (int valor : fila) {
				System.out.print(valor + "\t"); // Imprime cada elemento de la fila
				sumaFila += valor; // Calcula la suma de la fila
			}
			System.out.println(sumaFila); // Imprime la suma de la fila
		}

		// Bucle para cada columna de la matriz
		for (int j = 0; j < sumatorios[0].length; j++) {
			sumaColumna = 0; // Reinicia la suma de la columna a cero
			for (int i = 0; i < sumatorios.length; i++) {
				sumaColumna += sumatorios[i][j]; // Calcula la suma de la columna
			}
			total += sumaColumna; // Suma la suma de cada columna al total
			System.out.print(sumaColumna + "\t"); // Imprime la suma de la columna
		}
		System.out.println(total); // Imprime la suma total de todos los elementos de la matriz
	}
}