package Ejercicios.Ejercicios03;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
        double x1, x2;

        System.out.print("Introduce el primer número: ");
        x1 = s.nextDouble();

        System.out.print("Introduce el segundo número: ");
        x2 = s.nextDouble();

        double suma = x1 + x2;
        double resta = x1 - x2;
        double multiplicacion = x1 * x2;
        double division = x1 / x2;

        System.out.println("La suma de " + x1 + " + " + x2 + " es: " + suma);
        System.out.println("La resta de " + x1 + " - " + x2 + " es: " + resta);
        System.out.println("La multiplicación de " + x1 + " * " + x2 + " es: " + multiplicacion);
        System.out.println("La división de " + x1 + " / " + x2 + " es: " + division); 
        
    }
}
