package string;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Creamos una primera variable String para recoger la contraseña
		String contraseña = "";

		// Creamos una segunda variable String para recoger el intento de adivinarla
		String intento = "";

		// Creamos otra variable para recoger el resultado
		String resultado = "";
		
		//Creamos la variable parta recoger el caracter
		char[] = caracter;

		// Creamos un nuevo Scanner para guardar cadenas introducidas
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario la contraseña
		System.out.println("Introduzca la contraseña que desea crear:");

		// Leemos la contraseña del teclado
		contraseña = sc.next();

		do {
			// Solicitamos al usuario su intento
			System.out.println("Ahora, intente acertarla, JUGADOR 2:");
			// Leemos el intento del teclado
			intento = sc.next();

			while (intento.length() != contraseña.length()) {
				System.out.println("La longitud de la cadena es " + contraseña.length());
				System.out.println("Incorrecta, intentelo de nuevo:");
				intento = sc.next();
			}
			
			for (int i = 0; i < contraseña.length(); i++) {
				
			}
			
			
			
			
			
			

		} 

	}

}
