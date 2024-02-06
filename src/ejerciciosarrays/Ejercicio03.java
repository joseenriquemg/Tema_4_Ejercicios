package ejerciciosarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
    	// Variable para almacenar el valor ingresado por el usuario
        int valores; 
        
        // Array para almacenar los valores ingresados
        int tabla[] = new int[20]; 
        
        // Primer subarray de longitud 10
        int tabla1[] = new int[10]; 
        
        // Segundo subarray de longitud 10
        int tabla2[] = new int[10]; 

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese 20 valores y almacenarlos en el array tabla
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Introduzca un valor: ");
            valores = sc.nextInt();
            tabla[i] = valores;
        }

        // Copiar los primeros 10 elementos del array tabla al array tabla1
        tabla1 = Arrays.copyOfRange(tabla, 0, 10);
        
        // Copiar los siguientes 10 elementos del array tabla al array tabla2
        tabla2 = Arrays.copyOfRange(tabla, 10, 20);

        // Verificar si los arrays tabla1 y tabla2 son iguales
        if (Arrays.equals(tabla1, tabla2)) {
            System.out.println("Son iguales.");
        } else {
            System.out.println("No son iguales.");
        }

        // Imprimir los contenidos de los arrays tabla1 y tabla2
        System.out.println(Arrays.toString(tabla1));
        System.out.println(Arrays.toString(tabla2));
    }
}