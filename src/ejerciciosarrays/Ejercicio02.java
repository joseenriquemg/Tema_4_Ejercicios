package ejerciciosarrays;

import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {

		int tabla[] = new int[55];
		// Se inicializa inicio a 0
		int inicio = 0;

		// Se crea un for para los valores a rellenar
		for (int i = 1; i <= 10; i++) {
			// El final siempre coincide con la suma del inicio+valor a rellenar
			Arrays.fill(tabla, inicio, inicio + i, i);

			// El inicio del siguiente valor coincide con el final del anterior
			inicio = inicio + i;
		}

		System.out.println(Arrays.toString(tabla));
	}

}
