package string;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		// Creamos una variable para recoger la frase introducida
		String frase = "";

		// Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);

		// Solicitamos la frase al usuario
		System.out.println("Introduzca la frase que desea analizar:");

		frase = frase.toLowerCase();
		
		frase = sc.nextLine();

		int[] contadorLetras = new int[26];

		
		for (char caracter : frase.toCharArray()) {
			if (caracter >= 'a' && caracter <= 'z') {
				contadorLetras[caracter - 'a']++;
			}
		}

		for (char letra = 'a'; letra <= 'z'; letra++) {
			if (contadorLetras[letra - 'a'] > 0) { 
				System.out.println(letra + ": " + contadorLetras[letra - 'a'] + " veces");
			}
		}
		// Cerramos el Scanner
		sc.close();

	}

}
