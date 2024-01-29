package Ejercicios03;

public class Ejercicio3 {
    public static void main(String[] args) {
        String linea;
        /* Recibe el número de pesetas */
        System.out.print("Por favor, introduce una cantidad de pesetas: ");
        linea = System.console().readLine();
        int pesetas = Integer.parseInt(linea);
        /* Convierte las ptas en euros y los muestra */
        double euros = (double)(pesetas)*0.006;
        System.out.printf("La cantidad de %s en soles es: %.2f%n. \n", pesetas, euros);
    }
}
