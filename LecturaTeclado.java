public class LecturaTeclado {
    public static void main(String[] args) {
        /*
         * lectura del texto
         * System.console().readline().
         */
        String nombre;
        System.out.println("Por favor, dime cual es tu nombre: ");
        nombre = System.console().readLine(); 
        System.out.println("hola "+ nombre +", bienvenido!!!!");
    }
}

