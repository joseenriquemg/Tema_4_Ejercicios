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

		// Leemos la frase introducida por teclado
		frase = sc.nextLine();
		
		// Convertimos las letras introducidas a minusculas
		frase = frase.toLowerCase();

		// Creamos una tabla arrays para recoger las 26 letras del abecedario
		int[] contadorLetras = new int[26];

		// Creamos un bucle for each, el cual va a recorrer letra por letra de la frase
		// y si se encuentra comprendidadas entre las del abecedario las ira acumulando
		// y sumando a la cantidad de veces quie se repite
		for (char caracter : frase.toCharArray()) {
			if (caracter >= 'a' && caracter <= 'z') {
				contadorLetras[caracter - 'a']++;
			}
		}

		// Creamos un segundo bucle para ofrecerle el resultado al usuario impreso en pantalla
		for (char letra = 'a'; letra <= 'z'; letra++) {
			if (contadorLetras[letra - 'a'] > 0) {
				System.out.println(letra + ": " + contadorLetras[letra - 'a'] + " veces");
			}
		}
		
		// Cerramos el Scanner
		sc.close();

	}

}
