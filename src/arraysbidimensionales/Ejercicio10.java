package arraysbidimensionales; // Paquete donde se encuentra la clase

public class Ejercicio10 {

    public static void main(String[] args) {
        // Definir la matriz original
        int tabla[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        
        // Obtener la matriz girada 90 grados
        int tablaFin[][] = gira90(tabla);
        
        // Imprimir la matriz girada
        for (int[] fila : tablaFin) {
            for (int valor : fila) {
                System.out.print(valor + "\t"); 
            }
         // Salto de línea después de imprimir cada fila
            System.out.println(); 
        }
    }

    /* 
     * Función para girar una matriz 90 grados
     */
    public static int[][] gira90(int tablaInicio[][]) {
    	// Inicializar la matriz girada como null
        int tablaFinal[][] = null; 
        
        // Verificar si la matriz de entrada no es nula y es cuadrada 
        if (tablaInicio != null && tablaInicio.length == tablaInicio[0].length) {
        	// Crear la matriz girada con la misma dimensión
            tablaFinal = new int[tablaInicio.length][tablaInicio.length]; 
            
            // Girar la matriz
            for (int i = 0; i < tablaInicio.length; i++) {
                for (int j = 0; j < tablaInicio[0].length; j++) {
                    tablaFinal[j][tablaInicio.length - i - 1] = tablaInicio[i][j]; 
                }
            }
        }
     // Devolver la matriz girada
        return tablaFinal; 
    }
}