package EjerciciosEnClases;

public class SwitchHora {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------");
        System.out.println("Por favor, introduce la hora (número entero....): ");
        System.out.println("------------------------------------------------------------------");
        int hora = Integer.parseInt(System.console().readLine());
        if ((hora >= 6)&&(hora <= 12)){
          System.out.print("Buenos días.");
        } 
        else if ((hora >= 13)&&(hora <= 18)){
          System.out.print("Buenas tardes.");
        } 
        else if ((hora >= 17)&&(hora <= 23)){
          System.out.print("Buenas noches.");
        } 
        else if ((hora >= 0)&&(hora <= 5)){
          System.out.print("Buenas madrugadas.");
        } 
        else {
          System.out.print("Revisa el formato, porque no lo introdujiste correctamente.");
        }
    }
}
