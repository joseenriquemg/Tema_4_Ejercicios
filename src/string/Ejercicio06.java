package string;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		//Creamos una variable para recoger la frase
		String frase = "";
				
		//Creamos la variable para recoger la palabra
		String palabra = "";

		// Creamos un nuevo Scanner
		Scanner sc = new Scanner (System.in);
				
		//Solicitamos al usuario la palabra que desea añadir
		System.out.println("Introduzca la palabra que desea añadir:");
				
		//Leemos del teclado
		palabra = sc.nextLine();
		
		while (!palabra.equalsIgnoreCase("fin")) {
			frase += palabra + " ";
			
			System.out.println("Introduzca otra palabra que desea añadir:");
			palabra = sc.next();
		}
		
		//Imprimimos el resuultado al usuario
		System.out.println(frase);
		
		//Cerramos el Scanner
		sc.close();

	}

}
