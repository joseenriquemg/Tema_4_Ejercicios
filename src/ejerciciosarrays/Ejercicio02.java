package ejerciciosarrays;

import java.util.Arrays;

public class Ejercicio02 {

    public static void main(String[] args) {
        // Se declara un array de enteros con un tamaño de 55
        int tabla[] = new int[55];

        // Se inicializa la variable de inicio a 0
        int inicio = 0;

        // Se crea un bucle for para rellenar los valores del array
        for (int i = 1; i <= 10; i++) {
            
            Arrays.fill(tabla, inicio, inicio + i, i);

            // Se actualiza el valor de inicio para apuntar al siguiente espacio libre del array
            inicio = inicio + i;
        }

        // Se imprime el contenido del array 
        System.out.println(Arrays.toString(tabla));
    }

}