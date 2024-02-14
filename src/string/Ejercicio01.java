package string;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Creamos una primera variable String para recoger la cadena 1
		String cadena1;

		// Creamos una segunda variable String para recoger la cadena 2
		String cadena2;

		// Creamos un nuevo Scanner para guardar cadenas introducidas
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario la primera cadena
		System.out.println("Introduzca la primera cadena de palabras");

		// Leemos la cadena del teclado
		cadena1 = sc.next();

		// Solicitamos al usuario la segunda cadena
		System.out.println("Introduzca la segunda cadena de palabras");

		// Leemos la cadena del teclado
		cadena2 = sc.next();
		
		//Creamos nuestras condiciones para ofrecer el resultado al usuario
		if (cadena1.length() == cadena2.length()) {
			System.out.println("Ambas cadenas tienen la misma longitud de digitos.");
		}else if (cadena1.length() > cadena2.length()) {
			System.out.println("La cadena 1 posee mas digitos que la cadena 2.");
		}else{
			System.out.println("La cadena 2 posee mas digitos que la cadena 1.");
		}
		//Cerramos el Scanner
		sc.close();
		
		
		
		
		
		
		
		

	}

}
