package EjerciciosSinArrays;

import java.util.Random;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Creamos nuestra tabla de longitud 10.
		int[] tabla = new int[10];

		// Creamos la variable para recoger los numeros aleatorios.
		int numeros;

		// Generamos los numeros Randoms.
		Random rand = new Random();

		for (int i = 0; i < tabla.length; i++) {
			numeros = rand.nextInt(1, 101);
			tabla[i] = numeros;

		}
	}

}
