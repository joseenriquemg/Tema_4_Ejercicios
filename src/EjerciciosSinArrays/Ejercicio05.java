package EjerciciosSinArrays;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		double pideNum;

		double suma = 0;

		double min = Double.MAX_VALUE;

		double max = Double.MIN_VALUE;

		double[] tabla = new double[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un numero entero: ");
			pideNum = sc.nextDouble();

			tabla[i] = pideNum;

		}
		for (double resultado : tabla) {

			suma += resultado;

			if (resultado > max) {
				max = resultado;
			}
			
			if (resultado < min) {
				min = resultado;
			}

		}
		System.out.println("La suma de los valores es " + suma);
		System.out.println("El valor máximo es: " + max);
		System.out.println("El valor mínimo es: " + min);

		sc.close();

	}
}
