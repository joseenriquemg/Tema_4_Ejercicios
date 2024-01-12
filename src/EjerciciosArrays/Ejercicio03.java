package EjerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		int valores;
		
		int tabla[] = new int[20];
		int tabla1[] = new int[10];
		int tabla2[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for ( int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un valor: ");
			valores = sc.nextInt();
			tabla[i] = valores;
		}
			tabla1 = Arrays.copyOfRange(tabla, 0, 10);
			tabla2 = Arrays.copyOfRange(tabla, 10, 20); 
			
			
			if (Arrays.equals(tabla1, tabla2)) {
				System.out.println("Son iguales.");
			}else {
				System.out.println("No son iguales.");
			}
			
			
			System.out.println(Arrays.toString(tabla1));
			System.out.println(Arrays.toString(tabla2));
			
			
		

	}

}
