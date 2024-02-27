package NumerosAleatorios.EerciciosDeNumerosAleatorios;

public class ejercicios1 {
    public static void main(String[] args) {
    
        int lanzar;
        int suma = 0;
        
        System.out.print("Tirada de tres dados: ");
    
        for(int i = 0; i < 3 ; i++) {
          lanzar = (int)(Math.random() * 6) + 1;
          System.out.print(lanzar + " ");
          suma += lanzar;
        }
    
        System.out.println("\nSuma: " + suma);
      }
}
