import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * HeroSlay
 */
public class HeroSlay {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // List<Carta> mazo = new ArrayList<>();
        List<Personaje> personajes = new ArrayList<>();
        Carta Carta1 = new Carta("Pepe", TipoCarta.ATAQUE, 3);
        Carta Carta2 = new Carta("Luis", TipoCarta.CURA, 2);
        Carta Carta3 = new Carta("Jose", TipoCarta.ATURDIR, 1);

        Personaje Heroe = new Personaje("Heroe", 10);
        Personaje Villano = new Personaje("Villano", 10);

        personajes.add(Heroe);
        personajes.add(Villano);

        Heroe.anadirCartaAlMazo(Carta1);
        Heroe.anadirCartaAlMazo(Carta2);
        Heroe.anadirCartaAlMazo(Carta3);
        Villano.anadirCartaAlMazo(Carta1);
        Villano.anadirCartaAlMazo(Carta2);
        Villano.anadirCartaAlMazo(Carta3);

        while (Heroe.getVidaPersonaje() > 0 && Villano.getVidaPersonaje() > 0) {
            jugarRonda(Heroe, Villano);
        }
        System.out.println("\n=== Resultado Final ===");
        if (Heroe.getVidaPersonaje() <= 0) {
            System.out.println("¡Felicidades! Villano gana!.");
        } else {
            System.out.println("¡Felicidades! Heroe gana!.");
        }
    }

    private static void jugarRonda(Personaje jugador1, Personaje jugador2) {
        System.out.println("\n---- Comienza una nueva ronda ----");

        mostrarInformacionJugador(jugador1);

        Carta cartaJugador1 = elegirCarta(jugador1);
        System.out.println(jugador1.getNombrePersonaje() + " juega la carta: ");
        cartaJugador1.pintarInformacion();
        jugador2.recibirEfecto(cartaJugador1);

        if (!jugador2.isAturdido() && cartaJugador1.getTipoCarta() != TipoCarta.ATURDIR) {
            mostrarInformacionJugador(jugador2);

            Carta cartaJugador2 = elegirCarta(jugador2);
            System.out.println(jugador2.getNombrePersonaje() + " juega la carta: ");
            cartaJugador2.pintarInformacion();
            jugador1.recibirEfecto(cartaJugador2);
        }

        mostrarResultadoRonda(jugador1, jugador2);
    }

    private static void mostrarInformacionJugador(Personaje jugador) {
        System.out.println("\nInformación para " + jugador.getNombrePersonaje() + ":");
        mostrarCartasAleatorias(jugador);
    }

    private static void mostrarResultadoRonda(Personaje jugador1, Personaje jugador2) {
        System.out.println("\n---- Resultado de la ronda ----");
        System.out.println("Vida del " + jugador1.getNombrePersonaje() + ": " + jugador1.getVidaPersonaje());
        System.out.println("Vida del " + jugador2.getNombrePersonaje() + ": " + jugador2.getVidaPersonaje());
        System.out.println("--------------");
    }

    private static void mostrarCartasAleatorias(Personaje jugador) {
        System.out.println("Cartas en el mazo de " + jugador.getNombrePersonaje() + ":");
        List<Carta> cartas = jugador.getMazo();
        Collections.shuffle(cartas);

        for (int i = 0; i < 2 && i < cartas.size(); i++) {
            System.out.println((i + 1) + ". " + cartas.get(i).getNombreCarta());
            cartas.get(i).pintarInformacion();
        }
    }

    private static Carta elegirCarta(Personaje jugador) {
        System.out.println("\nElige una carta (1 o 2): ");
        int opcion;
        do {
            System.out.print("-->  ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > 2);

        List<Carta> cartas = jugador.getMazo();
        Collections.shuffle(cartas); // Barajar las cartas antes de elegir

        return cartas.get(opcion - 1);
    }
}
