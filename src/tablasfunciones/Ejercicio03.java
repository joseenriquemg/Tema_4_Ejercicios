package tablasfunciones;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Longitud del arrays a generar
		int longitud = 10;
		// Valor máximo para los números pares
		int fin = 20;

		// Llama a la función rellenaPares para generar el arrays y lo imprime
		int[] arregloPares = rellenaPares(longitud, fin);
		System.out.println(Arrays.toString(arregloPares));
	}

	// Función para generar un arreglo de longitud especificada
	public static int[] rellenaPares(int longitud, int fin) {
		Random random = new Random(); // Objeto para generar números aleatorios
		int[] arreglo = new int[longitud]; // Crear un nuevo arreglo con la longitud especificada

		// Llenar el arrays con números pares aleatorios entre 2 y fin
		for (int i = 0; i < longitud; i++) {
			arreglo[i] = random.nextInt((fin / 2) + 1) * 2; // Genera números pares aleatorios
		}
		// Ordenar el arrays en orden ascendente
		Arrays.sort(arreglo);
		// Devolver el arrays generado y ordenado
		return arreglo;
	}
}
