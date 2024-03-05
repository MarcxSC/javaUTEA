package ARRAY;

public class EjercicioArray04 {
    public static void main(String[] args) {

        int[] numeros = new int[8];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*51);
            System.out.println(numeros[i]);

        }
        System.out.println("-----------------------------------");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
              System.out.println(numeros[i] + "  par");
           } else {
              System.out.println(numeros[i] + " impar");
            }
  }
 }
}



