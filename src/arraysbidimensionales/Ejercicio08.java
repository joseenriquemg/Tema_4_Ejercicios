package arraysbidimensionales; // Paquete donde se encuentra la clase

import java.util.Scanner; // Importación de la clase Scanner para la entrada de datos

public class Ejercicio08 {
	public static void main(String[] args) {
		// Creamos la tabla
		int tabla[][] = new int[4][4];
		// Variable para almacenar si la tabla es simétrica o no
		boolean simetrico;
		// Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);

		// Rellenar la tabla con valores ingresados por el usuario
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.println("Introduce un valor para la posición [" + i + "][" + j + "]: ");
				tabla[i][j] = sc.nextInt();
			}
		}

		// Mostrar la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			// Salto de línea después de imprimir cada fila
			System.out.println();
		}

		// Verificar si la tabla es simétrica llamando a la función igual()
		simetrico = igual(tabla);

		// Mostrar resultado de simetría
		if (simetrico) {
			System.out.println("Tu tabla es simétrica");
		} else {
			System.out.println("Tu tabla no es simétrica");
		}

		// Cerramos el Scanner
		sc.close();
	}

	/*
	 * Función para verificar si la tabla es simétrica
	 */
	public static boolean igual(int tabla[][]) {
		// Variable para almacenar si la tabla es simétrica o no
		boolean igual = true;
		// Variables para los índices de las filas y columnas
		int i, j;
		int n = tabla.length;

		// Recorrer la matriz y comparar cada elemento con su posición simétrica
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				// Si algún elemento no es igual a su posición simétrica, la matriz no es
				// simétrica
				if (tabla[i][j] != tabla[j][i]) {
					igual = false;
					break;
				}
			}
			if (!igual) {
				break;
			}
		}
		// Devolver si la tabla es simétrica o no
		return igual; // Devolver si la tabla es simétrica o no
	}
}
