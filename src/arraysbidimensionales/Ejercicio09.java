package arraysbidimensionales;

public class Ejercicio09 {
	
	public static void main(String[] args) {

		// Creamos nuestra tabla mágica.
		int[][] tabla = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

		System.out.println(esMagica(tabla));
	}

	static boolean esMagica(int tabla2[][]) {

		boolean magica = true;

		int sumaAnterior = 0;

		int suma = 0;

		int contadorFilas = 0;

		int contadorColumnas = 0;

		for (int i = 0; i < 1; i++) {

			for (int j = 0; j < tabla2[i].length; j++) {

				suma += tabla2[i][j];
			}

			sumaAnterior = suma;
			suma = 0;
		}

		while (contadorFilas < tabla2.length) {

			while (contadorColumnas < tabla2.length) {

				suma += tabla2[contadorFilas][contadorColumnas];

				contadorColumnas++;
			}

			if (suma != sumaAnterior) {

				magica = false;
				break;
			}

			sumaAnterior = suma;

			contadorFilas++;
			contadorColumnas = 0;
			suma = 0;
		}

		contadorFilas = 0;

		while (magica && contadorColumnas < tabla2[0].length) {

			while (contadorFilas < tabla2.length) {

				suma += tabla2[contadorFilas][contadorColumnas];
				contadorFilas++;
			}
			if (suma != sumaAnterior) {

				magica = false;
				break;
			}
			sumaAnterior = suma;

			contadorColumnas++;
			contadorFilas = 0;
			suma = 0;
		}
		
		return magica;

	}
	

}
