package string;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// Creamos una variable stream para recoger la palabra del usuario
		String frase = "";
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner (System.in);
		
		//Solicitamos al usuario su palabra o frase
		System.out.println("Introduzca el fragmento a el cual desea remover:");
		
		//Leemos la frase o palabra del teclado
		frase = sc.nextLine();
		
		
		
		//Cerramos el Scanner
		sc.close();

	}

}
