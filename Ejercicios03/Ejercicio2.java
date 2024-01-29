package Ejercicios03;

public class Ejercicio2 {
    public static void main(String[] args) {
        String linea;
   
        System.out.println("Por favor, introduce la cantida de soles: ");
    
        linea = System.console().readLine();
        int soles = Integer.parseInt(linea);
        /* Convierte los soles en euros y los muestra */
        double euros = (double)(soles)*0.24;
        System.out.printf("La cantidad de %s en soles es: %.2f%n. \n", soles, euros);
        
    }
}
