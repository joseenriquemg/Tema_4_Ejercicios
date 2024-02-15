package ejerciciosarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] puntuaciones = new int[8];

        // Solicitar al usuario que introduzca las puntuaciones de los jugadores
        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.print("Introduce la puntuación del jugador " + (i + 1) + ": ");
            puntuaciones[i] = scanner.nextInt();
        }

        // Ordenar las puntuaciones en orden descendente
        Arrays.sort(puntuaciones);
        int[] puntuacionesOrdenadas = new int[8];
        for (int i = 0; i < puntuaciones.length; i++) {
            puntuacionesOrdenadas[i] = puntuaciones[puntuaciones.length - 1 - i];
        }

        // Mostrar las puntuaciones en orden descendente
        System.out.println("Ranking de puntuaciones de ajedrez:");
        for (int i = 0; i < puntuacionesOrdenadas.length; i++) {
            System.out.println("Jugador " + (i + 1) + ": " + puntuacionesOrdenadas[i]);
        }

        scanner.close();
    }
}