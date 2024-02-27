package Ejercicios06;

public class Ejercicio6 {
  public static void main(String[] args) {
    int numRows = 25; // Número de filas
    int numCols = 80; // Número de columnas

    for (int i = 0; i < numRows; i++) {
        for (int j = 0; j < numCols; j++) {
            int asciiValue = (int) (Math.random() * (126 - 32 + 1) + 32);
            System.out.print((char) asciiValue);
          System.out.print("\033[32m ");
        }
        System.out.println();
    }
}
} 