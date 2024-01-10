package EjerciciosSinArrays;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int numeros;
		int[] tabla = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un numero entero: ");
			numeros = sc.nextInt();
			tabla[i] = numeros;
		}
		for (int i = tabla.length; i > 0; i--) {
			System.out.println(tabla[i- 1]);
		}
	
			sc.close();

	}

}
