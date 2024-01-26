package ejerciciossinarrays;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		final String MESES[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
				"Agosto", "Octubre", "Septiembre", "Noviembre", "Diciembre"};
		
		int[] temperaturas = new int[MESES.length];
		
		Scanner sc = new Scanner(System.in);
		
		for ( int i = 0; i < temperaturas.length; i++) {
			System.out.println("Introduzca la temperatura de " + MESES);
			temperaturas[i] = sc.nextInt();	
		}
		
		for ( int i = 0; i < MESES.length; i++) {
			
		}

	}

}
