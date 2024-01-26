package ejerciciosarrays;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		int tabla[] = new int[30];
		
		 for (int i = 0; i < tabla.length; i++) {
	            tabla[i] = (int) (Math.random() * 10);
		 }
		 
		 System.out.println("Tabla antes de ordenar: " + Arrays.toString(tabla));
		 
		 Arrays.sort(tabla);
		 
		 System.out.println("Tabla ordenada: " + Arrays.toString(tabla));
		 
		 
		

	}

}
