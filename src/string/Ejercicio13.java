package string;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Variable que recoge la primera palabra
		String palabra1 = "";
		// Variable que recoge la segunda palabra
		String palabra2 = "";
		// Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		// Solicitamos al usuario la primera palabra
		System.out.println("Introduce la primera palabra:");
		// Leemos del teclado la primera palabra
		palabra1 = sc.nextLine();
		// Solicitamos al usuario la segunda palabra
		System.out.println("Introduce la segunda palabra:");
		// Leemos del teclado la segunda palabra
		palabra2 = sc.nextLine();
		// Cerramos el Scanner
		sc.close();
		// Creamos un if else paroferecer la soluciona al usuario
		if (sonAnagramas(palabra1, palabra2)) {
			System.out.println("¡Son anagramas!");
		} else {
			System.out.println("No son anagramas.");
		}
	}

	public static boolean sonAnagramas(String palabra1, String palabra2) {
		// Eliminamos espacios y convertimos a minúsculas para comparación sin
		// distinción de mayúsculas y minúsculas
		palabra1 = palabra1.replaceAll("\\s", "").toLowerCase();
		palabra2 = palabra2.replaceAll("\\s", "").toLowerCase();

		// Verificamos si las longitudes son diferentes
		if (palabra1.length() != palabra2.length()) {
			return false;
		}

		// Convertimos las cadenas a arrays de caracteres y ordenarlos
		char[] arregloPalabra1 = palabra1.toCharArray();
		char[] arregloPalabra2 = palabra2.toCharArray();

		Arrays.sort(arregloPalabra1);
		Arrays.sort(arregloPalabra2);

		// Comparamos los arrays ordenados
		return Arrays.equals(arregloPalabra1, arregloPalabra2);
	}
}
