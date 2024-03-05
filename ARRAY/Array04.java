package ARRAY;

public class Array04 {
    // un  programa que genere 100 numeros aleatorios del 0 al 20, los mostraremos por pantalla
    //separados por espacos, el programa pedira que ingrese dos valores por teclado y a continuacion el programa cambiara
    public static void main(String[] args) {
        int[] numeros = new int[100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*21);

                System.out.print(numeros[i]+ " ");
        }
        System.out.print("\ningrese un numero de los que se han mostrado ");
        int valor1 =  Integer.parseInt(System.console().readLine());

        System.out.print("ingrese el valor para reemlazarlo: ");
        int valor2 =  Integer.parseInt(System.console().readLine());

        String rojo = "\033[31m";
        String blanco = "\033[37m";

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor1) {
                numeros[i] = valor2;
                System.out.print(rojo + numeros[i]+ "-");
            }
            else{
                System.out.print(blanco + numeros[i]+"-");
            }
            
        }
    }
 }
