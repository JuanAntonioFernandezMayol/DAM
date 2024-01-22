import java.util.ArrayList;
import java.util.List;

/**
 * HeroSlay
 */
public class HeroSlay {
    public static void main(String[] args) {
        List<Personaje> mazoPersonajes = new ArrayList<>();
        List<Carta> cartasPersonajes = new ArrayList<>();
        Carta Carta1 = new Carta("Pepe", TipoCarta.ATAQUE, 6);
        Carta1.pintarInformacion();
        Carta Carta2 = new Carta("Luis", TipoCarta.CURA, 4);
        Carta2.pintarInformacion();
        Carta Carta3 = new Carta("Jose", TipoCarta.ATURDIR, 4);
        Carta3.pintarInformacion();
        Carta Carta4 = new Carta("Hola", TipoCarta.ATAQUE, 4);
        Carta4.pintarInformacion();
        cartasPersonajes.add(Carta1);
        cartasPersonajes.add(Carta2);
        cartasPersonajes.add(Carta3);
        cartasPersonajes.add(Carta4);
    }

    private static void Heroe() {
        String nombre = "Superman";
        Integer HP = 10;
    }

    private static void Villano() {
        String nombre = "Villano";
        Integer HP = 10;
    }
}