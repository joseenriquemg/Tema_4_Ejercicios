package EjerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		int tabla[] = new int[1000];
		int valor;
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random() * 100);
	 }
		
		System.out.println("Tabla de numeros aleatorios: " + Arrays.toString(tabla));
		
		System.out.println("Escribe un valor que quieras ver si existe en la tabla:");
		valor = sc.nextInt();
		
		for (int i = 0; i < tabla.length; i++) {
			if (valor == tabla[i]) {
				contador ++;	
			}
			
		}
		
			if ( contador != 0) {
				System.out.println("Su numero se repite un total de " + contador + " veces." );
			}else if ( contador == 0) {
				System.out.println("Su numero no se encuentra en la tabla.");
			}
			sc.close();
	}

}
