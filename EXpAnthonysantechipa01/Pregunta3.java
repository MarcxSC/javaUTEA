package EXpAnthonysantechipa01;
import java.util.Scanner;
// Importa la clase Scanner del paquete java.util
public class Pregunta3 {
    public static void main(String[] args) {
        double gravedad = 9.81;   // Constante de aceleración gravitacional
        Scanner scanner = new Scanner(System.in);
        // Crea un objeto Scanner para leer la entrada del usuario
        System.out.print("Ingrese la altura inicial : ");
        double altura = scanner.nextDouble();
        // Solicita al usuario ingresar la altura inicial y la almacena como un número de punto flotante
        if (altura > 0) {     // Verificación sencilla sobre la validez de la altura
            double tiempoCaida = Math.sqrt((2 * altura) / gravedad);
        // Calcula el tiempo de caída utilizando la fórmula de la física
            System.out.printf("El tiempo de caída es %.3f segundos.\n", tiempoCaida);
        // Imprime el resultado con tres decimales de precisión
        } else {
            System.out.println("La altura no puede ser igual o menor a cero");
        // Si la altura es menor o igual a cero, imprime un mensaje de error
        }
        scanner.close();       
        // Cierra el escáner cuando ya no sea necesario
    }
}
