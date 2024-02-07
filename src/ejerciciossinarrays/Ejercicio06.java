package ejerciciossinarrays;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Variable para almacenar el número ingresado por el usuario
		int pideNum;
		// Arrays para almacenar los números enteros ingresados
		int[] tabla = new int[8];
		// Creamos un nuevo Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Bucle para solicitar al usuario ingresar 8 números enteros
		for (int i = 0; i < tabla.length; i++) {
			// Solicitamos al usuario que ingrese un número entero
			System.out.println("Introduzca un numero entero: ");
			// Leer el número entero ingresado por el usuario
			pideNum = sc.nextInt();
			// Almacenar el número ingresado en el arrays
			tabla[i] = pideNum;
		}

		// Bucle para recorrer el arreglo y determinar si cada número es par o impar
		for (int resultado : tabla) {
			// Verificar si el número es par o impar y mostrar el resultado
			if (resultado % 2 == 0) {
				// Mostrar el número y "par"
				System.out.println(resultado + ": par");
			} else {
				// Mostrar el número y "impar"
				System.out.println(resultado + ": impar");
			}
		}
		// Cerrar el objeto Scanner
		sc.close();
	}
}
