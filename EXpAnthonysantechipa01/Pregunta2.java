package EXpAnthonysantechipa01;
import java.util.Scanner;
// Importa la clase Scanner del paquete java.util
public class Pregunta2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    // Crea un objeto Scanner para leer la entrada del usuario
        int introducciones = 0;
        int numeroActual = 0;
        int repeticionesMaximas = 0;
        int numeroMasRepetido = 0;
        int repeticionesActuales = 0;

        System.out.println("Ingrese números (0 para finalizar):");
    // Solicita al usuario ingresar números, con 0 como indicador de finalización
        do {
            numeroActual = scanner.nextInt();
            introducciones++;
    // Lee el número ingresado y cuenta las introducciones

            if (numeroActual != 0) {
            if (numeroActual == numeroMasRepetido) {
            repeticionesActuales++;
            } else {
            if (repeticionesActuales >
            repeticionesMaximas) {
            repeticionesMaximas =
            repeticionesActuales;
            numeroMasRepetido = numeroActual;
            }
            repeticionesActuales = 1;
            }
            }
            } while (numeroActual != 0);
    // El bucle se repite hasta que se ingresa el número 0
            System.out.println("El número más repetido es el " +
            numeroMasRepetido + " y se ha escrito " + repeticionesMaximas +
            " veces.");
            System.out.println("Se han realizado " + introducciones
            + " introducciones en total.");
    // Imprime la cantidad total de números ingresados
        }
 } 

