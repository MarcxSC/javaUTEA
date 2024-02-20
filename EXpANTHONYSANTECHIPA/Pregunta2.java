package EXpANTHONYSANTECHIPA;
import java.util.Scanner;
public class Pregunta2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int introducciones = 0;
        int numeroActual = 0;
        int repeticionesMaximas = 0;
        int numeroMasRepetido = 0;
        int repeticionesActuales = 0;
        System.out.println("Ingrese números (0 para finalizar):");
        do {
            numeroActual = scanner.nextInt();
            introducciones++;
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
            System.out.println("El número más repetido es el " +
            numeroMasRepetido + " y se ha escrito " + repeticionesMaximas +
            " veces.");
            System.out.println("Se han realizado " + introducciones
            + " introducciones en total.");
            }
            }
            