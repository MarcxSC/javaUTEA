package ARRAY;

public class NewArray {
  public static void main(String[] args) {
    // como dedinimos un array
    int [] arreglo;
    double[] notas;
    // espacios que va tener el arreglo
    arreglo = new int[4];
    notas = new double[5];
    //llenar esos espacios
    arreglo[0] = 12;
    arreglo[1] = 15;
    arreglo[2] = 17;
    arreglo[3] = 11;
    //mostramos los valores que tiene el arreglo
    System.out.println(arreglo[0]);
    System.out.println(arreglo[1]);
    System.out.println(arreglo[2]);
    System.out.println(arreglo[3]);
    int suma = arreglo[0]+arreglo[1];
    System.out.println("la sma del 1er numero y el segumdo es "+suma);

  }  
}
