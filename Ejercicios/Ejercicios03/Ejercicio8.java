package Ejercicios.Ejercicios03;

public class Ejercicio8 {
    public static void main(String[] args) {
        String linea;
    int paso = 1024;
    
    System.out.print("Por favor, introduceun número de Mb: ");
    linea = System.console().readLine();
    int mb = Integer.parseInt(linea);
    
    int total = mb*paso;
    System.out.printf("%d Mb son %d Kb. \n", mb, total);
    }
}
