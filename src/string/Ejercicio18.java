package string;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// Variable que recoge el titulo del html
		String titulo = "";
		// Variable en la que el usuario guardara el texto del html
		String texto = "";
		// Variable en la guardaremos la concatenación de las dos partes del html
		String html = "";
		// Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		// Solicitamos el titulo al usuario
		System.out.println("Introduce el título de tu página html");
		// Leemos el titulo por teclado
		titulo = sc.nextLine();
		// Solicitamos el titulo al usuario
		System.out.println("Introduce el texto de tu página html");
		// Leemos el texto por teclado
		texto = sc.nextLine();
		// Unimos las dos clases en el html global con titulo y texto
		html = htmlInicio(titulo) + htmlFinal(texto);
		// Imprimimos el html al usuario
		System.out.println(html);
		// Cerramos el Scanner
		sc.close();

	}

	/**
	 * Esta clase va a crear la primera parte del código html con el título
	 * 
	 * @param titulo variable de entrada, el título de nuestro html
	 * @return devolverá el título una vez modificado como html
	 */
	public static String htmlInicio(String titulo) {

		titulo = "<HTML> \n <HEAD> \n \t <TITLE>" + titulo + "</TITLE> \n </HEAD> \n<BODY> \n<H1> " + titulo
				+ " </H1>\n";

		return titulo;
	}

	/**
	 * Esta clase va a crear la otra parte del código html con el texto
	 * 
	 * @param texto variable de entrada, el texto de nuestro html
	 * @return devolverá el texto una vez modificado como html
	 */
	public static String htmlFinal(String texto) {

		texto = "<P>" + texto + "</P>\n </BODY> \n </HTML>";

		return texto;

	}
}