package arraysbidimensionales;

import java.util.Scanner;

/**
 * Clase Ejercicio02
 */
public class Ejercicio02 {
    
    // Definición de constantes para el número de alumnos y asignaturas
    public static final int NUM_ALUMNOS = 4;
    public static final int NUM_ASIGNATURAS = 5;

    public static void main(String[] args) {

        // Declaración de variables
        double notasAlumnos;

        // Declaración e inicialización del array bidimensional para almacenar las notas
        double notas[][] = new double[NUM_ALUMNOS][NUM_ASIGNATURAS];

        // Creación de un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Bucle para ingresar las notas de cada alumno
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            System.out.println("Ingrese las notas para el alumno " + (i + 1) + " :");
            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                System.out.print("Nota " + (j + 1) + " =");
                notasAlumnos = sc.nextDouble();
                notas[i][j] = notasAlumnos;
            }
        }
        // Barra de separacion para la nueva tabla
        System.out.println("----------------------------------------------------");
        // Texto introductorio para la tabla de notas
        System.out.println("Tabla de Notas:");

        // Imprimir la tabla de notas
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            System.out.print("Alumno " + (i + 1) + "\t");
            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                System.out.print(notas[i][j] + "\t");
            }
            System.out.println();
        }
        // Barra de separacion para la nueva tabla
        System.out.println("----------------------------------------------------");
        // Texto introductorio para la tabla de medias, minimos y maximos
        System.out.println("Notas de cada Alumno:");

        // Calcular y mostrar las estadísticas de las notas de cada alumno
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            double min = notas[i][0]; // Inicializar la variable min con la primera nota del alumno
            double max = notas[i][0]; // Inicializar la variable max con la primera nota del alumno
            double sum = 0; // Inicializar la variable sum para calcular la suma de las notas
            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                if (notas[i][j] < min) {
                    min = notas[i][j]; // Actualizar la nota mínima si se encuentra una nota menor
                }
                if (notas[i][j] > max) {
                    max = notas[i][j]; // Actualizar la nota máxima si se encuentra una nota mayor
                }
                sum += notas[i][j]; // Sumar todas las notas
            }
            double avg = sum / NUM_ASIGNATURAS; // Calcular el promedio de las notas
            // Imprimir las estadísticas de las notas de cada alumno
            System.out.println("Alumno " + (i + 1) + ": Mínima = " + min + " - Máxima = " + max + " -  Media = " + avg);
        }

        // Cerrar el objeto Scanner
        sc.close();
    }
}