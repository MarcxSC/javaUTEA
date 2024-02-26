package Ejercicios.Ejercicios02;

import java.util.Scanner;

public class Ejercicio4 {
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double soles, euros;
        
        System.out.print("Ingresa el monto en soles: ");
        soles = in.nextDouble();
        
        // Se asume una tasa de cambio de 1 euro = 4.00 soles
        euros = soles / 4.00;
        
        System.out.println("La cantidad en soles ingresada es: " + soles);
        System.out.println("El monto en euros es: " + euros);
    }
}
        
      
      

