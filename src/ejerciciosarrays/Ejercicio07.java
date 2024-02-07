package ejerciciosarrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio07 {

	public static void main(String[] args) {
		//Variable que recoge la tabla arrays ganadora
		int[] ganadora = { 7, 19, 22, 33, 40, 45 };
		//Variable para recoger la serie del jugador
		int[] apuesta = new int[6];
		
		int numero;
		
		int i = 0;
		//Variabe para recoger el numero de aciertos
		int aciertos = 0;

		Random rand = new Random();

		while (i < apuesta.length) {
			numero = rand.nextInt(1, 50);

			if (busquedaSecuencial(apuesta, numero) < 0) {
				apuesta[i] = numero;
				i++;
			}
		}
		Arrays.sort(apuesta);

		System.out.println(Arrays.toString(apuesta));

		for (int valor : apuesta) {
			if (Arrays.binarySearch(ganadora, valor) >= 0) {
				aciertos++;
			}
		}
		System.out.println("Tienes " + aciertos + " aciertos.");

	}

	public static int busquedaSecuencial(int[] tabla, int valor) {
		int indice = 0;

		while (indice < tabla.length && valor != tabla[indice]) {
			indice++;
		}

		if (indice == tabla.length) {
			indice = -1;
		}
		return indice;

	}
}
