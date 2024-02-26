package Ejercicios.Ejercicios03;

public class Ejercicio7 {
    public static void main(String[] args) {
        String linea;
        int solesHora = 12;
       
        System.out.print("Por favor, introduce las horas trabajadas: ");
        linea = System.console().readLine();
        int horasTrabajadas = Integer.parseInt(linea);
        
        int totalSueldo = (solesHora*horasTrabajadas);
        System.out.println( + horasTrabajadas + "h x s/ 12 "+ " = " + totalSueldo +" soles");
        System.out.printf("El sueldo correspondiente a %d horas de trabajo, son %d soles", horasTrabajadas, totalSueldo);

    }
}
