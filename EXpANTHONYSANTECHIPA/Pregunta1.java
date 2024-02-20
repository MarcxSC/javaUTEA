package EXpANTHONYSANTECHIPA;
import java.util.Scanner;
public class Pregunta1 {
    public static void main(String[] args) {
  // Método principal
        Scanner scanner = new Scanner(System.in);
  // Crea un objeto Scanner para leer la entrada del usuario
System.out.print("Ingrese el primer valor: ");
int primerValor = scanner.nextInt();
// Solicita al usuario ingresar el primer valor y lo almacena como entero
System.out.print("Ingrese el segundo valor: ");
int segundoValor = scanner.nextInt();
// Solicita al usuario ingresar el segundo valor y lo almacena como entero
System.out.print("Ingrese el tamaño del grupo: ");
int tamanoGrupo = scanner.nextInt();
// Solicita al usuario ingresar el tamaño del grupo y lo almacena como entero
int contador = 0;
// Inicializa un contador para llevar la cuenta de los números en cada grupo
for (int i = primerValor; i <= segundoValor; i++) {
// Crea un bucle para recorrer los números en el rango especificado
System.out.print(i + " ");
contador++;
if (contador == tamanoGrupo) {
// Si se ha alcanzado el tamaño del grupo especificado
System.out.print("\n¿Desea continuar? (S/N): ");
String respuesta = scanner.next();
// Lee la respuesta del usuario como una cadena de texto
if (respuesta.equalsIgnoreCase("N")) {
break;
}
contador = 0;
// Si la respuesta es "S" (sí), reinicia el contador de números en el grupo
      }
    } 
  }
}

  

