package ARRAY;

public class Array03 {
    public static void main(String[] args) {
        //arreglo de notas
        double[] notas = new double[5];
        double suma = 0;
        System.out.println("ingtrese3 la nota de la parcial ");

        for (int i = 0; i < notas.length; i++) {
           System.out.print("nota del estudiante nº "+(i+1)+": "); 
           notas[i] = Double.parseDouble(System.console().readLine());
           suma = suma + notas[i];
        }
        System.out.println("El promedio del aula es: "+suma / notas.length);
    }
}
