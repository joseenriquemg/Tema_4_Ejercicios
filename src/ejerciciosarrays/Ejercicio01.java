package ejerciciosarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		int valorN ;
		int valorM;
		int tabla[];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un valor para darle el tamaño: ");
		valorN = sc.nextInt();
		tabla = new int[valorN];
		
		System.out.println("Introduzca el valor que deseas que aparezca dentro: ");
		valorM = sc.nextInt();
		
		Arrays.fill(tabla, 0, valorN, valorM);
		
		System.out.println(Arrays.toString(tabla));
	}

}
