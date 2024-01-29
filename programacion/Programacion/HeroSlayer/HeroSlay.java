import java.util.ArrayList;
import java.util.List;

/**
 * HeroSlay
 */
public class HeroSlay {
    public static void main(String[] args) {
        List<Carta> mazo = new ArrayList<>();
        List<Personaje> personajes = new ArrayList<>();
        Carta Carta1 = new Carta("Pepe", TipoCarta.ATAQUE, 3);
        Carta1.pintarInformacion();
        Carta Carta2 = new Carta("Luis", TipoCarta.CURA, 2);
        Carta2.pintarInformacion();
        Carta Carta3 = new Carta("Jose", TipoCarta.ATURDIR, 1);
        Carta3.pintarInformacion();
        Personaje Heroe = new Personaje("Heroe", 10);
        Personaje Villano = new Personaje("Villano", 10);
        mazo.add(Carta1);
        mazo.add(Carta2);
        mazo.add(Carta3);
        personajes.add(Heroe);
        personajes.add(Villano);

        Heroe.añadirCartaAlMazo(Carta1);
        Heroe.añadirCartaAlMazo(Carta2);
        Heroe.añadirCartaAlMazo(Carta3);
        Villano.añadirCartaAlMazo(Carta1);
        Villano.añadirCartaAlMazo(Carta2);
        Villano.añadirCartaAlMazo(Carta3);

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
        Carta cartaJugador1 = jugador1.jugarCarta();
        jugador2.recibirEfecto(cartaJugador1);

        if (cartaJugador1.getTipoCarta() != TipoCarta.ATURDIR) {
            Carta cartaJugador2 = jugador2.jugarCarta();
            jugador1.recibirEfecto(cartaJugador2);
        }
        System.out.println("---- Resultado de la ronda ----");
        System.out.println("Vida del Heroe: " + jugador1.getVidaPersonaje());
        System.out.println("Vida del Villano: " + jugador2.getVidaPersonaje());
        System.out.println("--------------");
    }
}
