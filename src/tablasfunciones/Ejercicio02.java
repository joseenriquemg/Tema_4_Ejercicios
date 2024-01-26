package tablasfunciones;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Variables donde recogeremos los numeros del usuario.
		int num1;
		int num2;
		int num3;
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);
		// Solicitamos al usuario los tres numeros enteros.
		System.out.println("Introduzca su primer numero:");
		num1 = sc.nextInt();
		System.out.println("Introduzca su segundo numero:");
		num2 = sc.nextInt();
		System.out.println("Introduzca su tercer numero:");
		num3 = sc.nextInt();
		// Creamos un if else para darle la solucion al usuario.
		if ( num1 + num2 == num3) {
			System.out.println("La suma es: " + num1 + " + " + num2 + " = " + num3);
		}else if ( num3 + num2 == num1) {
			System.out.println("La suma es: " + num3 + " + " + num2 + " = " + num1);
		}else if ( num1 + num3 == num2) {
			System.out.println("La suma es: " + num1 + " + " + num3 + " = " + num2);
		}else {
			System.out.println("Sus numeros no poseen ninguna suma.");
		}
		// Cerramos el Scanner.
		sc.close();

	}

}
