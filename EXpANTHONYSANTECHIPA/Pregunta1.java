package EXpANTHONYSANTECHIPA;
import java.util.Scanner;
public class Pregunta1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("Ingrese el primer valor: ");
int primerValor = scanner.nextInt();
System.out.print("Ingrese el segundo valor: ");
int segundoValor = scanner.nextInt();
System.out.print("Ingrese el tamaño del grupo: ");
int tamanoGrupo = scanner.nextInt();
int contador = 0;
for (int i = primerValor; i <= segundoValor; i++) {
System.out.print(i + " ");
contador++;
if (contador == tamanoGrupo) {
System.out.print("\n¿Desea continuar? (S/N): ");
String respuesta = scanner.next();
if (respuesta.equalsIgnoreCase("N")) {
break;
}
contador = 0;
      }
    } 
  }
}

  

