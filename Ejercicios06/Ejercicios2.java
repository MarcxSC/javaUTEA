package Ejercicios06;
/*Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios. 
 */
public class Ejercicios2 {
    public static void main(String[] args) {
        for (int i = 1 ; i < 21; i++) {
            System.out.print((int)(Math.random() * 11) + " ");
    }
  }
}
