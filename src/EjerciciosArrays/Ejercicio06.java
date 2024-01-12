package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		int tabla[] = new int[1000];
		int valor;
		int busqueda;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random() * 100);
	 }
		System.out.println("Escribe un valor que quieras ver si existe en la tabla:");
		valor = sc.nextInt();
				

	}

}
