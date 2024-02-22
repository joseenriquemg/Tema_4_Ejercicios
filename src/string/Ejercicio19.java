package string;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// Creamos la variable para recoger la cadena
		String cadena = "";

		// Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		// Solicitamos la cadena al usuario
		System.out.println("Introduzca una cadena:");
		// Leemos la cadena del teclado
		cadena = sc.nextLine();
		// Nombramos a la funcion camelCase
		System.out.println(camelCase(cadena));
	}

	public static String camelCase(String cadena) {
		String segundaCadena = "";

		String[] cadenaArray = cadena.trim().toLowerCase().split(" ");

		segundaCadena += cadenaArray[0];

		for (int i = 1; i < cadenaArray.length; i++) {

			segundaCadena += Character.toUpperCase(cadenaArray[i].charAt(0)) + cadenaArray[i].substring(1);
		}

		return segundaCadena;
	}

}
