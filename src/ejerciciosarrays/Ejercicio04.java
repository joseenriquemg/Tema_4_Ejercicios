package ejerciciosarrays;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Crear un array de enteros con una longitud de 30
		int tabla[] = new int[30];

		// Llenar el array con números enteros aleatorios entre 0 y 9
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 10);
		}

		// Imprimir el contenido del array antes de ordenarlo
		System.out.println("Tabla antes de ordenar: " + Arrays.toString(tabla));

		// Ordenar el array 'tabla' en orden ascendente
		Arrays.sort(tabla);

		// Imprimir el contenido del array después de ordenarlo
		System.out.println("Tabla ordenada: " + Arrays.toString(tabla));
	}

}
