package EXpANTHONYSANTECHIPA;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        double gravedad = 9.81;   // Constante de aceleración gravitacional
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura inicial : ");
        double altura = scanner.nextDouble();
    
        if (altura > 0) {     // Verificación sencilla sobre la validez de la altura
            double tiempoCaida = Math.sqrt((2 * altura) / gravedad);
            System.out.printf("El tiempo de caída es %.3f segundos.\n", tiempoCaida);
        } else {
            System.out.println("La altura no puede ser igual o menor a cero");
        }
        scanner.close();       // Cierra el escáner cuando ya no sea necesario
    }
}

