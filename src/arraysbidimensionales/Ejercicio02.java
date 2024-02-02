package arraysbidimensionales;

import java.util.Scanner;

/**
 * Clase Ejercicio02
 */
public class Ejercicio02 {

	public static final int NUM_ALUMNOS = 4;
	public static final int NUM_ASIGNATURAS = 5;

	public static void main(String[] args) {

		double notasAlumnos;

		double notas[][] = new double[NUM_ALUMNOS][NUM_ASIGNATURAS];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < NUM_ALUMNOS; i++) {
			System.out.println("Ingrese las notas para el alumno " + (i + 1) + " :");
			for (int j = 0; j < NUM_ASIGNATURAS; j++) {
				System.out.print("Nota " + (j + 1) + " =");
				notasAlumnos = sc.nextDouble();
				notas[i][j] = notasAlumnos;
			}
		}
		System.out.println("----------------------------------------------------");
		System.out.println("Tabla de Notas:");

		for (int i = 0; i < NUM_ALUMNOS; i++) {
			System.out.print("Alumno " + (i + 1) + "\t");
			for (int j = 0; j < NUM_ASIGNATURAS; j++) {
				System.out.print(notas[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------"); 
		System.out.println("Notas de cada Alumno:");
         for (int i = 0; i < NUM_ALUMNOS; i++) {
             double min = notas[i][0];
             double max = notas[i][0];
             double sum = 0;
             for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                 if (notas[i][j] < min) {
                     min = notas[i][j];
                 }
                 if (notas[i][j] > max) {
                     max = notas[i][j];
                 }
                 sum += notas[i][j];
             }
             double avg = sum / NUM_ASIGNATURAS;
             System.out.println("Alumno " + (i + 1) + ": Mínima = " + min + " - Máxima = " + max + " -  Media = " + avg);
         }


		sc.close();
	}
}
