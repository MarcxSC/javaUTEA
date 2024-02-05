package EjerciciosEnClases;

public class SwitchCURSOS {
        public static void main(String[] args) {
            System.out.println("Ingrese un dia de la semana");
            System.out.println("----------------");
            int dia;
            String diaSem;
        diaSem = System.console().readLine().toLowerCase();
        switch (diaSem){
            case "lunes":
            case "martes":
              System.out.print("Toca algoritmos y Programacion I.");
              break;
            case "miercoles":
            case "jueves":
            case "viernes":
              System.out.print("Estadistica");
              break;
            case "sábado":
            case "domingo":
              System.out.print("No hay clase.");
            default:
              System.out.print("Introduzca un nombre de la semana...");
        }
    }
}
