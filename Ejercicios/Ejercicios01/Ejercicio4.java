package Ejercicios.Ejercicios01;

public class Ejercicio4 {
    public static void main(String[] args) {
    System.out.println("┌────────┬───────────┬──────────┬───────────┬───────────┬───────────┐");
    System.out.println("│ hora   │ Lunes     │ Martes   │ Miercoles │ Jueves    │ Viernes   │");        
    System.out.println("├────────┼───────────┼──────────┼───────────┼───────────┼───────────┤"); 
    System.out.printf("│ %s  │ %-8s  │%-8s  │%-8s  │%-8s   │%-8s   │\n",  "08:15", "Sistemas", " Prog", " Sistemas", " Prog", " xxxxx");
    System.out.printf("│ %s  │ %-8s  │%-8s  │%-8s  │%-8s   │%-8s   │\n",  "09:15", "Sistemas", " Prog", " Sistemas", " Prog", " xxxxx");
    System.out.printf("│ %s  │ %-8s  │%-8s  │%-8s  │%-8s   │%-8s   │\n",  "10:15", "Sistemas", " Prog", " Sistemas", " Prog", " xxxxx");
    System.out.printf("│ %s  │ %-8s  │%-8s  │%-8s  │%-8s   │%-8s   │\n",  "11:45", "Sistemas", " Prog", " xxxxxxxx", " BBDD", " xxxxx");
    System.out.printf("│ %s  │ %-8s  │%-8s  │%-8s  │%-8s   │%-8s   │\n",  "12:40", "Sistemas", " xxxx", " xxxxxxxx", " BBDD", " xxxxx");
    System.out.printf("│ %s  │ %-8s  │%-8s  │%-8s  │%-8s   │%-8s   │\n",  "13:35", "Sistemas", " xxxx", " xxxxxxxx", " BBDD", " xxxxx");
    System.out.println("└────────┴───────────┴──────────┴───────────┴───────────┴───────────┘");
}
}
