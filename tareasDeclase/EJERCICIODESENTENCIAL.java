package tareasDeclase;

import java.util.Scanner;

public class EJERCICIODESENTENCIAL {
    public static void main(String[] args) {
        System.out.println("ingrese tu nota");
        Scanner s = new Scanner(System.in);
        int nota = s.nextInt();
        
        if (nota > 10.5){
        System.out.println("aprobado el curso");
        }else{
        System.out.println("desaprobo el curso");

        
        }

    }
}
