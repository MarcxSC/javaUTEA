package NumerosAleatorios;

public class Piedrapapelotijera {
    public static void main(String[] args) {
        System.out.println("genera al azar piedra, papel o tijera");
        
        int mano = (int) (Math.random()*3);
        System.out.println(mano);
        switch (mano) {
            case 0:
                System.out.println("piedra");
                break;
            case 1:
            System.out.println("papel");
            break;
    
            case 2:
                System.out.println("tijera");
                break;
        

        }
    }
}
