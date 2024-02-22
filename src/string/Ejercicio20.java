package string;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// Variable que recoge la cadena introducida por el usuario
		String cadena = "";

		// Variable que recogera el algoritmo usado
		int algoritmo;
		
		//Variable para recoger el Arrays 
		String [] tabla;

		// Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);

		// Solicitamos la cadena al usuario
		System.out.println("Introduzca una cadena:");

		// Leemos la cadena del teclado
		cadena = sc.nextLine();

		// Solicitamos al usuario el algoritmo
		System.out.println("Introduzca el algoritmo que desea seguir:");

		// Leemos el algoritmo del teclado
		algoritmo = sc.nextInt();

		// Si el algoritmo es mayor a la longitud de la palabra volvemos a pedir el
		// algoritmo
		while (algoritmo > cadena.length()) {
			// Repetimos la pregunta
			System.out.println("Introduzca el algoritmo que desea seguir:");
			// Volvemos a leer del teclado
			algoritmo = sc.nextInt();
		}

		// Llamamos a la funcion
		tabla = palabraSeparada(cadena, algoritmo);
		
		// Mostramos el mensaje
		System.out.println(Arrays.toString(tabla));

		// Cerramos el Scanner
		sc.close();
	}

	/*
	 * Función que obtiene una palabra y devuelve una tabla con su secuencia
	 */
	static String[] palabraSeparada(String cadena, int algoritmo) {
		// Variable donde se almacena la longitud de la tabla
		int longitud = cadena.length() / algoritmo;

		// Comprobamos si la longitud es diferente que 1 ya que habrá que sumarle 1
		if (longitud > 1) {
			longitud++;
		}
		// Tabla donde se almacenará la palabra dividida
		String[] separacion = new String[longitud];

		// Variable que recoge la primera subcadena
		String subcadena = "";

		// Variable que recoge la segundaSubcadena
		String segundaSubcadena = cadena;

		// Variable int que recoge el contador
		int contador = 0;

		// Creamos un bucle para dividir la palabra mientras sea posible
		do {
			// Obtenemos la subcadena
			subcadena = segundaSubcadena.substring(0, algoritmo);

			// Obtenemos la segunda subcadena
			segundaSubcadena = segundaSubcadena.substring(algoritmo);

			// Añadimos la subcadena a nuestra tabla
			separacion[contador] = subcadena;

			// Aumentamos el contador
			contador++;

		} while (segundaSubcadena.length() > algoritmo);

		// Creamos un if para añadir la segunda subcadena si no esta vacia
		if (!segundaSubcadena.equals("")) {
			separacion[contador] = segundaSubcadena;
		}

		// Devolvemos la tabla
		return separacion;
	}
}