import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public class AcertarelNumero {

        public static void main() {
            Scanner escaner = new Scanner(System.in);
            Random random = new Random();

            int numeroSecreto = random.nextInt(51); // de 0 al 50

            System.out.println("Adiviona el numero de cero al 50: ");

            int rondas = 0;
            boolean win = false;
            while (rondas < 5 && win == false) {

                System.out.print("Escribe un numero: ");
                int numeroJugador = escaner.nextInt();

                if (numeroJugador == numeroSecreto) {
                    System.out.println("Has ganado");
                    System.out.println("Has ganado en la ronda: " + rondas);
                    System.out.println("El numero era: " + numeroSecreto);
                    win = true;
                } else if (numeroJugador > numeroSecreto) {
                    System.out.println("El numero es más pequeño que el numero secreto");
                } else if (numeroJugador < numeroSecreto) {
                    System.out.println("El numero es más grande que el numero secreto");
                }
                rondas++;
            }
            if (win == false) {
                System.out.println("Has perdido, el numero era:" + numeroSecreto);
            }
            escaner.close();
        }
    }
}
