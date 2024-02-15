package string;

import java.util.Scanner;

public class Ejercicio07 {

	public static int contarPalabraEnFrase(String frase, String palabra) {
        // Convertir la frase y la palabra a minúsculas para hacer la búsqueda insensible a mayúsculas
        frase = frase.toLowerCase();
        palabra = palabra.toLowerCase();

        // Dividir la frase en palabras
        String[] palabrasEnFrase = frase.split("\\s+");

        // Inicializar el contador de ocurrencias
        int contador = 0;

        // Bucle sobre cada palabra en la frase y contar las ocurrencias de la palabra específica
        for (String palabraEnFrase : palabrasEnFrase) {
            if (palabraEnFrase.equals(palabra)) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar la frase al usuario
        System.out.println("Ingrese una frase:");
        String frase = sc.nextLine();

        // Solicitar la palabra al usuario
        System.out.println("Ingrese una palabra para contar:");
        String palabra = sc.next();

        // Contar las ocurrencias de la palabra en la frase
        int ocurrencias = contarPalabraEnFrase(frase, palabra);
        System.out.println("La palabra '" + palabra + "' aparece " + ocurrencias + " veces en la frase.");

        sc.close();
    }
}