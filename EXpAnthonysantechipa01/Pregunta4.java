package EXpAnthonysantechipa01;
import java.util.Scanner;
// Importa la clase Scanner del paquete java.util
public class Pregunta4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // solicitar al usuario que ingrese su fecha de nacimiento
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Año: ");
        int año = scanner.nextInt();
        System.out.print("Mes: ");
        int mes = scanner.nextInt();
        System.out.print("Día: ");
        int dia = scanner.nextInt();
        // verificar si la fecha es valida
        if (validarFecha(año, mes, dia)) {
        // calcular el numero magico asociado ala fecha de nacimiento
            int numeroMagico = calcularNumeroMagico(año, mes, dia);
            System.out.println("El número mágico asociado a su fecha de nacimiento es: " + numeroMagico);
        } else {
            System.out.println("La fecha introducida no es válida.");
        }
    }
    // metodo para validar si una fecha es valida
    public static boolean validarFecha(int año, int mes, int dia) {
        if (año <= 0 || mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            return false;
        }
    // determinar el numero maximo de dias para el mes ingresado
        int diasMes = 31;
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diasMes = 30;
        } else if (mes == 2) {
            diasMes = 28;
        }
        return dia <= diasMes;
    }
    // metodo para calcular el numero magico asociado a una fecha
    public static int calcularNumeroMagico(int año, int mes, int dia) {
        int sumaDigitos = 0;
        // Sumar los dígitos del año, mes y día
        sumaDigitos += sumarDigitos(año);
        sumaDigitos += sumarDigitos(mes);
        sumaDigitos += sumarDigitos(dia);

        // Reducir a un solo dígito
        while (sumaDigitos > 9) {
            sumaDigitos = sumarDigitos(sumaDigitos);
        }
        return sumaDigitos;
    }
    public static int sumarDigitos(int num) {
        int suma = 0;
        while (num != 0) {
            suma += num % 10;
            num /= 10;
        }
        return suma;
    }
}
