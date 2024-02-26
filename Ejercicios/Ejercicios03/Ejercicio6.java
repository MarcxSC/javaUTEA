package Ejercicios.Ejercicios03;

public class Ejercicio6 {
    public static void main(String[] args) {
        String linea;

        System.out.print("Por favor, introduzca la base del triangulo: ");
        linea = System.console().readLine();
        double base = Double.parseDouble(linea);
        
        System.out.print("Por favor, introduzca la altura del triangulo: ");
        linea = System.console().readLine();
        double altura = Double.parseDouble(linea);

        double area = base * altura;
        System.out.println("base x altura" );
        System.out.println(+ base+" x "+ altura + " = "+area );
        System.out.println("La area del triangulo es: "+area);
        }

    }

