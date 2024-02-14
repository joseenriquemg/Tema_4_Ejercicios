package string;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//Variable para recoger la cadena
		String cadena = "";
		
		//Creamos el Scanner
		Scanner sc = new Scanner (System.in);
		
		//Solicitamos la frase al usuario
		System.out.println("Introduzca la frase que desea invertir:");
		
		//Leemos del teclado
		cadena = sc.nextLine();
		
		//Imprimimos el resultado al usuario
		System.out.println(cadenaInvertida(cadena));
		
		//Cerramos el Scanner
		sc.close();
		

	}
	
	public static String cadenaInvertida (String cadena) {
		//Creamos nuestra variable para recoger la cadena invertida
		String cadenaInvertida = "";
		
		//Creamos un bucle for para ir leyendo la frase
		for ( int i = cadena.length() - 1; i >= 0; i--) {
			cadenaInvertida += cadena.charAt(i);
		}
		//Devolvemos la cadena invertida
		return cadenaInvertida;
		
	}

}
