package EXpAnthonysantechipa01;

public class Pregunta5 {
    public static void main(String[] args) {
        //solicita al usuario ingresar diez números enteros
        System.out.println("Por favor, introduzca 10 números enteros: ");
    
        int negativos = 0;
        int positivos = 0;
       // Inicializa contadores para negativos y positivos respectivamente 
        for (int i = 0; i < 10; i++) {
          if (Integer.parseInt(System.console().readLine()) < 0) {
            negativos++;
          } else {
        // Si no es menor a cero, incrementa el contador de positivos
            positivos++;
          }
        }
        
        System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " negativos.");
        // Imprime el resultado final con el número de positivos y negativos encontrados
      }
}
