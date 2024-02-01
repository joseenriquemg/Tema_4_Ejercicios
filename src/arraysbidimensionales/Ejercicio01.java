package arraysbidimensionales;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		//Creamos una tbla de bidimensionales.
		int [] [] numero = new int [3][6];
		
		//Ponemos nuestros numeros
		numero [0][0] = 0;
		numero [0][1] = 30;
		numero [0][2] = 2;
		numero [0][5] = 5;
		numero [1][0] = 75;
		numero [1][4] = 0;
		numero [2][2] = -2;
		numero [2][3] = 9;
		numero [2][5] = 11;
		
		//Creamos un bucle .
		for ( int i = 0; i < numero.length; i++) {
			for ( int j = 0; j < numero[0].length; j++) {
				System.out.print(numero [i][j] + " \t ");
			}
			System.out.println();
		}

	}

}
