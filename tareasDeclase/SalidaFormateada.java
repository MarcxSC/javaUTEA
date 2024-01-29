package tareasDeclase;
public class SalidaFormateada {
    public static void main(String[] args) {
        System.out.print("El número 21 no tiene decimales. \n");
        System.out.printf("El número %f sale con decimales.\n", 21.0);
        System.out.printf("El %.3f sale exactamente con 3 decimales.\n", 21.0);
   } 
}
