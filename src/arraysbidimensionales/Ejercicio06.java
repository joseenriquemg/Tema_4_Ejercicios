package arraysbidimensionales;

public class Ejercicio06 {

	public static void main(String[] args) {
		

	}

	public static void tablaBidimensional(int[][] tabla) {

		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[0].length; j++) {
				tabla[i][j] = 10 * (i + j);
				System.out.print(tabla[i][j] + " \t ");
			}
			System.out.println();

		}

	}

}
