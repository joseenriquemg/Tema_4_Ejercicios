package arraysbidimensionales; // Paquete donde se encuentra la clase

public class Ejercicio09 {

	public static void main(String[] args) {

		// Creamos nuestra tabla mágica.
		int[][] tabla = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };

		// Imprimimos si la matriz es mágica o no
		System.out.println("¿Es la matriz mágica? " + esMagica(tabla));
	}

	static boolean esMagica(int tabla2[][]) {
		// Variable para almacenar si la matriz es mágica o no
		boolean magica = true;
		// Variable para almacenar la suma de la primera fila o columna
		int sumaAnterior = 0;
		// Variable para almacenar la suma actual
		int suma = 0;
		// Contador para recorrer las filas de la matriz
		int contadorFilas = 0;
		// Contador para recorrer las columnas de la matriz

		int contadorColumnas = 0;
		// Calcular la suma de la primera fila
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < tabla2[i].length; j++) {
				suma += tabla2[i][j];
			}
			sumaAnterior = suma;
			suma = 0;
		}

		// Verificamos las sumas de las filas
		while (contadorFilas < tabla2.length) {
			while (contadorColumnas < tabla2.length) {
				suma += tabla2[contadorFilas][contadorColumnas];
				contadorColumnas++;
			}
			// Si la suma de la fila no es igual a la suma de la primera fila, la matriz no
			// es mágica
			if (suma != sumaAnterior) {
				magica = false;
				break;
			}
			sumaAnterior = suma;
			contadorFilas++;
			contadorColumnas = 0;
			suma = 0;
		}
		// Reiniciamos el contador de filas
		contadorFilas = 0; // Reiniciar el contador de filas

		// Verificamos las sumas de las columnas
		while (magica && contadorColumnas < tabla2[0].length) {
			while (contadorFilas < tabla2.length) {
				suma += tabla2[contadorFilas][contadorColumnas];
				contadorFilas++;
			}
			// Si la suma de la columna no es igual a la suma de la primera fila, la matriz
			// no es mágica
			if (suma != sumaAnterior) {
				magica = false;
				break;
			}
			sumaAnterior = suma;
			contadorColumnas++;
			contadorFilas = 0;
			suma = 0;
		}
		// Devolver si la matriz es mágica o no
		return magica;
	}
}
