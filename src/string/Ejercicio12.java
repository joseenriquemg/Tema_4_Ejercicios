package string;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		//Variablepra recoger la frase introducida
		String frase;
		//Creamos el nuevo Scanner
		Scanner sc = new Scanner(System.in);
		//Solicitamos la frase al usuario
		System.out.println("Ingrese una frase: ");
		//Leemos del teclado
		frase = sc.nextLine();
		// Dividir la frase en palabras utilizando el espacio como delimitador
		String[] palabras = frase.split(" ");

		// Inicializar variables para almacenar la palabra de mayor longitud y su
		// longitud
		String palabraMasLarga = "";
		int longitudMasLarga = 0;

		// Bucle para todas las palabras en la frase
		for (String palabra : palabras) {
			// Verificar si la longitud de la palabra actual es mayor que la longitud máxima
			// encontrada hasta ahora
			if (palabra.length() > longitudMasLarga) {
				// Si es así, actualizar la palabra de mayor longitud y su longitud
				palabraMasLarga = palabra;
				longitudMasLarga = palabra.length();
			}
		}

		// Imprimir la palabra de mayor longitud y su longitud
		System.out.println("La palabra más larga es: " + palabraMasLarga);
		System.out.println("Longitud de la palabra más larga: " + longitudMasLarga);

		sc.close(); // Cerrar el scanner
	}
}
