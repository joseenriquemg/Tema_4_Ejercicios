package string;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		//Creamos una variable para recoger la frase introducida
		String frase = "";
		
		//Segunda variable para recoger los espacios en blanco
		int espaciosEnBlanco;
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Solicitamos la frase al usuario
		System.out.println("Por favor, introduce una frase:");
		
		//Leemos las frase del teclado
		frase = sc.nextLine();
		
		espaciosEnBlanco = contarEspaciosEnBlanco(frase);
		System.out.println("La frase tiene " + espaciosEnBlanco + " espacios en blanco.");
		sc.close();
	}
	/*
	 * Funcion que calcula el numero de espacios en la frase
	 */
	public static int contarEspaciosEnBlanco(String frase) {
		
		//Variable que cuenta los espacios en blanco
		int contador = 0;
		
		//Bucle for para recorrer la frse contando los espacios
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				contador++;
			}
		}
		//Devolvemos el numero de veces contados
		return contador;
	}
}
