package arraysbidimensionales;

/*
 * Clase Ejercicio03
 */
public class Ejercicio03 {
	
	// Método que crea y muestra una tabla bidimensional
	public static void tablaBidimensional(int[][] tabla) {
		// Bucle para crear las filas de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Bucle para crear las columnas de la tabla 
			for (int j = 0; j < tabla[0].length; j++) {
				// Asigna un valor específico basado en la posición de fila y columna
				tabla[i][j] = 10 * (i + j);
				// Imprime el valor de la posición actual seguido de un espacio y un tabulador
				System.out.print(tabla[i][j] + " \t ");
			}
			// Imprime un salto de línea al final de cada fila
			System.out.println();
		}
	}
	
	/*
	 * Metodo main
	 */
	public static void main(String[] args) {
		// Crea una nueva tabla bidimensional de tamaño 4x5
		int[][] tabla = new int[4][5];
		// Llama al método tablaBidimensional para generar y mostrar la tabla
		tablaBidimensional(tabla);
	}
}