package ARRAY;

public class EjerciciosArray05 {
    public static void main(String[] args) {
  
            int[] n = new int[100];
            int maximo = 0;
            int minimo = 100;
        
            // Genera los números y calcula el máximo y el mínimo
            for (int i = 0; i < 100; i++) {
              n[i] = (int)(Math.random() * 501);
              
              if (n[i] < minimo) {
                minimo = n[i];
              }
              
              if (n[i] > maximo)  {
                maximo = n[i];
              }
            }
        
            for (int elemento : n) {
              System.out.print(elemento + " ");
            }
            
            System.out.print("\n\n¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
            int opcion = Integer.parseInt(System.console().readLine());
        
            int destacado;
            
            if (opcion == 1) {
              destacado = minimo;
            } else {
              destacado = maximo;
            }
        
            System.out.println();
        
            String rojo = "\033[31m";
            String verde = "\033[32m";

            for (int elemento : n) {
              if (elemento == destacado) {
                System.out.print(rojo +" **" + elemento + "** ");
              } else {
                System.out.print(verde + elemento + " ");
              }
            }
          }
        }