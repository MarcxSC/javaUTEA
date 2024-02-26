package Ejercicios.Ejercicios01;

public class Ejercicio5 {
    public static void main(String[] args) {
        String r = "\033[31m";
        String v = "\033[32m";
        String n = "\033[33m";
        String a = "\033[34m";
        String m = "\033[35m";
        String c = "\033[36m";
        String b = "\033[37m";
        System.out.println("┌────────┬───────────┬──────────┬───────────┬───────────┬───────────┐");
        System.out.println("│ hora   │ Lunes     │ Martes   │ Miercoles │ Jueves    │ Viernes   │");        
        System.out.println("├────────┼───────────┼──────────┼───────────┼───────────┼───────────┤"); 
        System.out.printf("│ %s  │ %-8s  │%-8s      │%-8s   │%-8s       │%-8s      │\n",  "08:15", b+"Sistemas", a+"Prog", a+"Sistemas", a+"Prog", a+"xxxxx");
        System.out.printf("│ %s  │ %-8s  │%-8s      │%-8s   │%-8s       │%-8s      │\n",  "09:15", a+"Sistemas", a+"Prog", a+"Sistemas", a+"Prog", a+"xxxxx");
        System.out.printf("│ %s  │ %-8s  │%-8s      │%-8s   │%-8s       │%-8s      │\n",  "10:15", b+"Sistemas", a+"Prog", a+"Sistemas", a+"Prog", v+"xxxxx");
        System.out.printf("│ %s  │ %-8s  │%-8s      │%-8s   │%-8s       │%-8s      │\n",  "11:45", b+"Sistemas", c+"Prog", a+"xxxxxxxx", m+"BBDD", n+"xxxxx");
        System.out.printf("│ %s  │ %-8s  │%-8s      │%-8s   │%-8s       │%-8s      │\n",  "12:40", b+"Sistemas", c+"xxxx", m+"xxxxxxxx", m+"BBDD", n+"xxxxx");
        System.out.printf("│ %s  │ %-8s  │%-8s      │%-8s   │%-8s       │%-8s      │\n",  "13:35", b+"Sistemas", c+"xxxx", m+"xxxxxxxx", m+"BBDD", n+"xxxxx");
        System.out.println("└────────┴───────────┴──────────┴───────────┴───────────┴───────────┘");
    }
}