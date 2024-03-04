package ARRAY;

public class NewArray02 {
    public static void main(String[] args) {
        int[] numeros = new int[8];
        //mas rapido
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*10);  
            //optimizar el mostrado de pantalla
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
    }
  }
}
