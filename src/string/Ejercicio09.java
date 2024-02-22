package string;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Variable que recoge lña frase del usuario
		String frase = "";
		// Variable que recoge el mensaje mostrado
		String mensaje = "";
		// Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		// Solicitamos la frase al usuario
		System.out.println("Ingresa una frase:");
		// Leemos la frase del teclado
		frase = sc.nextLine();
		// Creamos un if else para ofrecer el resultado al usuario
		if (frase.startsWith("Javalín, javalón") && frase.endsWith("javalén, len, len")) {
			mensaje = frase.substring("Javalín, javalón".length(), frase.length() - "javalén, len, len".length())
					.trim();
			System.out.println("Mensaje en Javalandia: " + mensaje);
		} else {
			System.out.println("La frase no está en el idioma de Javalandia.");
		}

		sc.close();
	}
}
