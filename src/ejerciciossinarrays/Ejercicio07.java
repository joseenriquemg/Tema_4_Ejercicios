package ejerciciossinarrays;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Arrays de nombres de los meses
        final String MESES[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre" };
        // Arrays para almacenar las temperaturas de los meses
        int[] temperaturas = new int[MESES.length];
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // Bucle para solicitar al usuario ingresar la temperatura de cada mes
        for(int i=0; i<temperaturas.length; i++) {
            System.out.println("Introduzca la temperatura de " + MESES[i]);
            temperaturas[i] = sc.nextInt();
        }
        
        // Bucle para imprimir el histograma de temperaturas
        for(int i=0; i<MESES.length; i++) {
            // Imprimir el nombre del mes
            if(MESES[i].length()>=9) {
                System.out.print(MESES[i] + "\t");
            }
            else {
                System.out.print(MESES[i] + "\t\t");
            }
            // Imprimir asteriscos para representar la temperatura
            for(int j=1; j<=temperaturas[i]; j++) {
                System.out.print("*");
                // Nueva línea para el próximo mes
            }
            System.out.println();
        }
        
        // Cerrar el objeto Scanner para liberar recursos del sistema
        sc.close();
	}

}
