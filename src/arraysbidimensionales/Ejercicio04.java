package arraysbidimensionales;

public class Ejercicio04 {

	public static int[][] tablaMultiplicar() {
		int[][] tabla = new int[10][10];

		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[0].length; j++) {
				tabla[i][j] = (i + 1) * (j + 1);
			}
		}
		return tabla;

	}

	public static void main(String[] args) {

		int[][] tablaNueva;

		tablaNueva = tablaMultiplicar();

		for (int i = 0; i < tablaNueva.length; i++) {

			for (int j = 0; j < tablaNueva[0].length; j++) {
				System.out.print(tablaNueva[i][j] + "\t");
			}
			System.out.println();

		}

	}

}
