package ejerciciossinarrays;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		int pideNum;

		int[] tabla = new int[8];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un numero entero: ");
			pideNum = sc.nextInt();

			tabla[i] = pideNum;}
			
			for (int resultado : tabla) {
				 if (resultado % 2 == 0) {
					 System.out.println(resultado + ": par");
				 }else {
					 System.out.println(resultado + ": impar");
				 }
			}

	}

}

