package NumerosAleatorios;
public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("Diez numeros aleatorios con enteros");
        for (int i = 1 ; i < 11; i++) {
            System.out.println((int)(Math.random() * 6+15) + " ");
          }
    }
}
