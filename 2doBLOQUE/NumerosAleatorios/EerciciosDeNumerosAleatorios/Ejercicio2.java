package NumerosAleatorios.EerciciosDeNumerosAleatorios;

public class Ejercicio2 {
    /* Muestra 50 numeros enteros aleatorios entre 100 y 199 
    *(ambos incluidos) separados por espacios. Muestre tambien el Maximo, 
    * el minimo y la media.
    * */
    public static void main(String[] args) {
        int maximo = 100;
        int minimo = 199;
        int suma = 0;
        int n;

        for(int i = 1; i < 50; i++){
        n = ((int)(Math.random() * 100 +100));
        System.out.print(n + " ");
        suma += n;
        if (n < minimo) {
            minimo = n;
          }
        
          if (n > maximo) {
            maximo = n;
          }
        }
        
        System.out.println("\nMínimo: " + minimo + "\nMáximo: " + maximo + "\nMedia: " + suma / 50);

        }

 }
