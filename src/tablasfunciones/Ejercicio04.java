package tablasfunciones;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        // Variable para recoger el numero
        int numeroBuscar;
        int numr;
        int t[] = new int[20]; // Arrays para almacenar los números aleatorios
        Scanner sc = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario

        // Generación de números aleatorios y almacenamiento en el arreglo
        for (int i = 0; i < t.length; i++) {
            numr = (int) (Math.random() * 20 + 1); // Genera un número aleatorio entre 1 y 20
            t[i] = numr; // Almacena el número aleatorio en el arreglo
        }

        // Entrada del número a buscar por el usuario
        System.out.println("Introduzca el valor que le gustaría encontrar en la tabla: ");
        numeroBuscar = sc.nextInt();

        // Llamada al método buscar para encontrar el número en el arreglo y mostrar su posición
        System.out.println("El número: " + numeroBuscar + " se encuentra en la posición " + buscar(t, numeroBuscar));

        sc.close(); // Cierre del Scanner

    }

    // Método para buscar un número en un arreglo y devolver su índice
    public static int buscar(int t[], int clave) {

        int indiceBusqueda = 0; // Índice de búsqueda inicializado en 0

        // Bucle para buscar el número en el arreglo
        while (indiceBusqueda < t.length && clave != t[indiceBusqueda]) {
            indiceBusqueda++; // Incrementa el índice de búsqueda hasta encontrar el número o llegar al final del arreglo
        }

        // Si el número no se encontró, se establece el índice de búsqueda en -1
        if (indiceBusqueda >= t.length) {
            indiceBusqueda = -1;
        }

        return indiceBusqueda; // Devuelve el índice de búsqueda (-1 si no se encontró el número)
    }

}