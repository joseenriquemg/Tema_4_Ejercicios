package TablasFunciones;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio01 {

	public static void main(String[] args) {
		int tablaNum[] = new int[5];
		int numRand = 0;
		Random rand = new Random();

		for (int i = 0; i < tablaNum.length; i++) {
			tablaNum[i] = rand.nextInt(1, 10);
		}
		System.out.println(Arrays.toString(tablaNum));
		System.out.println("La suma de los numeros enteros es: " + sumaNumeros(tablaNum));

	}

	public static int sumaNumeros(int[] tabla) {
		int suma = 0;

		for (int valor : tabla) {
			suma += valor;
		}
		return suma;

	}

}
