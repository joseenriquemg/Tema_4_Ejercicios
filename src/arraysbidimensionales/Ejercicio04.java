package arraysbidimensionales;

/*
 * Clase Ejercicio04
 */
public class Ejercicio04 {

	// Método que genera una tabla de multiplicar de tamaño 10x10
	public static int[][] tablaMultiplicar() {
		// Crea una nueva tabla bidimensional de tamaño 10x10
		int[][] tabla = new int[10][10];

		// Bucle para cada fila de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Bucle para cada columna de la fila actual
			for (int j = 0; j < tabla[0].length; j++) {
				// Calcula el valor de la celda como el resultado de multiplicar el número de fila por el número de columna
				tabla[i][j] = (i + 1) * (j + 1);
			}
		}
		// Retorna la tabla generada
		return tabla;
	}
	
	/*
	 * Metodo main
	 */
	public static void main(String[] args) {
		// Declara una variable para almacenar la tabla generada
		int[][] tablaNueva;

		// Genera la tabla de multiplicar llamando al método tablaMultiplicar
		tablaNueva = tablaMultiplicar();

		// Imprime la tabla de multiplicar en la consola
		for (int i = 0; i < tablaNueva.length; i++) {
			for (int j = 0; j < tablaNueva[0].length; j++) {
				System.out.print(tablaNueva[i][j] + "\t"); // Imprime el valor de cada celda seguido de un tabulador
			}
			System.out.println(); // Imprime un salto de línea al final de cada fila
		}
	}
}