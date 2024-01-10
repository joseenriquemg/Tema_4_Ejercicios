package EjerciciosSinArrays;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		double numeros;
		double[] tabla = new double[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un numero decimal: ");
			numeros = sc.nextDouble();
			tabla[i] = numeros;
		}
		for (double resultado: tabla ) {
			System.out.println(resultado);
		}
			sc.close();
	}

}
