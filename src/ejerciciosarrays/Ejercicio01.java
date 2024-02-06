package ejerciciosarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        // Variable para almacenar el tamaño del array 
        int valorN; 
        
        // Variable para almacenar el valor que se insertará en el array
        int valorM; 
        
        // Array para almacenar los valores
        int tabla[]; 

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese el tamaño del array
        System.out.println("Introduzca un valor para darle el tamaño: ");
        valorN = sc.nextInt();

        // Crear un array con el tamaño especificado por el usuario
        tabla = new int[valorN];

        // Solicitar al usuario que ingrese el valor que se insertará en el array
        System.out.println("Introduzca el valor que deseas que aparezca dentro: ");
        valorM = sc.nextInt();

        // Llenar el array con el valor especificado por el usuario
        Arrays.fill(tabla, 0, valorN, valorM);

        // Imprimir el contenido del array
        System.out.println(Arrays.toString(tabla));
    }

}
