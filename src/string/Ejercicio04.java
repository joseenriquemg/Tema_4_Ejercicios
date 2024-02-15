package string;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Creamos una variable para recoger la frase
		String frase = "";
		
		//Creamos la variable para recoger los digitos
		String palabras[];

		// Creamos un nuevo Scanner
		Scanner sc = new Scanner (System.in);
		
		//Solicitamos al usuario la frase que desea ordenar
		System.out.println("Introduzca la frase que desea ordenar");
		
		//Leemos del teclado
		frase = sc.nextLine();
		
		//Utilizamos el .split para dividir la frase por palabras asd
		palabras = frase.split(" ");
		
		// Utilizamos Arrays.sort para ordenar la frase
		Arrays.sort(palabras);
		
		//Imprimimos por pantalla las palabras ordenadas
		System.out.println(Arrays.toString(palabras));
		
		// Cerramos el Scanner
		sc.close();

	}
	
	

}
