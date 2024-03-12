package ArrayBidimi;
//EJERCICIO 1: Realiza un programa que rellene un array de 6 filas por 10 columnas
    //con numeros enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
    //continuacio, el programa deberá dar la posición tanto del maximo como del minimo.
public class ArrayBi032 {
    public static void main(String[] args) {
        int[][] n = new int[6][10];
        int fila;
        int columna;
        int maximo = 0;
        int minimo = 0;
        int maxRow = 0;
        int maxCol = 0;
        int minRow = 0;
        int minCol = 0;

        // Llenar el array con números aleatorios entre 0 y 1000
        for ( fila = 0; fila < 6; fila++) {
            for ( columna = 0; columna < 10; columna++) {
                n[fila][columna] = (int) (Math.random() * 1001);
            }
        } // Números aleatorios entre 0 y 1000

        // Mostrar el array
        for (fila = 0; fila < 6; fila++) {
            System.out.print("Fila: " + fila);
            for (columna = 0; columna < 10; columna++) {
                System.out.printf("%10d ", n[fila][columna]);
            }
            System.out.println();
            
        }
         if (n[fila][columna] < minimo) {
            minimo = n[fila][columna];
            minRow = fila;
            minCol = columna;
          }
        
        // Mostrar la posición del máximo y del mínimo
        System.out.println("El máximo es " + n+ " en la posición [" + maxRow + "][" + maxCol + "]");
        System.out.println("El mínimo es " + fila + " en la posición [" + minRow + "][" + minCol + "]");
    }
}
