package Ejercicios03;

public class Ejercicio5 {
    public static void main(String[] args) {
        String linea;
    
    System.out.print("Por favor, introduzca el largo del rectángulo: ");
    linea = System.console().readLine();
    double largo = Double.parseDouble(linea);
    
    System.out.print("Por favor, introduzca el ancho del rectángulo: ");
    linea = System.console().readLine();
    double ancho = Double.parseDouble(linea);
    double area = largo*ancho;
    System.out.println("largo x ancho" );
    System.out.println(+ largo+" x "+ ancho+ " = "+area );
    System.out.println("La area del rectángulo es: "+area);
    }
}