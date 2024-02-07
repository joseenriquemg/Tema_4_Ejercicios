package ejerciciossinarrays;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Variable para recoger el numero del usuario
		double pideNum;
		// Variable para recoger la suma
		double suma = 0;
		// Inicializado con el valor máximo posible de double
		double min = Double.MAX_VALUE;
		// Inicializado con el valor mínimo posible de double
		double max = Double.MIN_VALUE;
		// Arrays para almacenar los números ingresados
		double[] tabla = new double[10];
		Scanner sc = new Scanner(System.in);

		// Bucle para solicitar al usuario que ingrese diez números
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un número entero: ");
			pideNum = sc.nextDouble();
			tabla[i] = pideNum;
		}

		// Bucle para calcular la suma, el valor máximo y el valor mínimo
		for (double resultado : tabla) {
			// Calculamos la suma de los números ingresados
			suma += resultado;

			if (resultado > max) {
				// Actualizamos el valor máximo si se encuentra un número mayor
				max = resultado;
			}

			if (resultado < min) {
				// Actualizamos el valor mínimo si se encuentra un número menor
				min = resultado;
			}
		}

		// Muestra los resultados por pantalla
		System.out.println("La suma de los valores es " + suma);
		System.out.println("El valor máximo es: " + max);
		System.out.println("El valor mínimo es: " + min);

		// Cierra el escáner
		sc.close();
	}
}