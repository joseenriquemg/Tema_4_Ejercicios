package ejerciciossinarrays;
import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        // Crear un Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Crear un array de enteros de tamaño 100
        int[] arreglo = new int[100];
        
        // Rellenamos con valores enteros aleatorios entre 1 y 10
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(1 + Math.random() * 10);
        }
        
        // Pedir al usuario que ingrese un valor N
        System.out.print("Ingrese un valor N entre 1 y 10: ");
        int valorN = scanner.nextInt();
        
        // Mostrar en qué posiciones aparece el valor N
        System.out.print("El valor " + valorN + " aparece en las posiciones: ");
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorN) {
                System.out.print(i + " ");
            }
        }
        
        // Cerrar el Scanner
        scanner.close();
    }
}