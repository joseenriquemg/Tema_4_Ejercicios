package EjerciciosSinArrays;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Creamos nuestra tabla num de longitud 12.
		int[] num = new int[12];

		// Modificamos los valores de la tabla para adaptarla al modelo.
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		
		//Refelejamos el resultado de la tabla num al usuario.
		for (int resultado : num) {
			System.out.println(resultado);
		}

	}
}
