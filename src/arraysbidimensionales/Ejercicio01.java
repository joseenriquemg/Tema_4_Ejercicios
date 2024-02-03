package arraysbidimensionales;

/**
 * Clase ejercicio01
 */
public class Ejercicio01 {

	/**
	 * Metodo main.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Creamos una tabla de bidimensionales.
		final int[][] numero = new int[3][6];

		// Ponemos nuestros numeros en la tabla.
		numero[0][0] = 0;
		numero[0][1] = 30;
		numero[0][2] = 2;
		numero[0][5] = 5;
		numero[1][0] = 75;
		numero[1][4] = 0;
		numero[2][2] = -2;
		numero[2][3] = 9;
		numero[2][5] = 11;

		// Creamos un bucle for para las filas.
		for (int i = 0; i < numero.length; i++) {
			// Creamos un bucle for para las columnas.
			for (int j = 0; j < numero[0].length; j++) {
				// Imprimimos la tabla a el usuario.
				System.out.print(numero[i][j] + " \t ");
			}
			// Imprimimos los espacios entre nuestros valores.
			System.out.println();
		}

	}

}
