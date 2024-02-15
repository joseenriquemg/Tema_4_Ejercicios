package string;

import java.util.Scanner;

public class Ejercicio08 {
	
	public static boolean esPalindromo(String frase) {
        // Eliminar espacios y convertir la frase a minúsculas
        frase = frase.replaceAll("\\s+", "").toLowerCase();
        
        // Comparar la frase original con su reverso
        for (int i = 0; i < frase.length() / 2; i++) {
            if (frase.charAt(i) != frase.charAt(frase.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar la frase al usuario
        System.out.println("Ingrese una frase para verificar si es palíndromo:");
        String frase = sc.nextLine();

        // Verificar si la frase es un palíndromo
        if (esPalindromo(frase)) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }

        sc.close();
    }
}



