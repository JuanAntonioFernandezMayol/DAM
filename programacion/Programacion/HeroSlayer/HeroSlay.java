import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * HeroSlay
 */
public class HeroSlay {
    public static void main(String[] args) {
        Random random = new Random();
        List<Carta> mazo = new ArrayList<>();
        List<Personaje> personajes = new ArrayList<>();
        Carta Carta1 = new Carta("Pepe", TipoCarta.ATAQUE, 6);
        Carta1.pintarInformacion();
        Carta Carta2 = new Carta("Luis", TipoCarta.CURA, 4);
        Carta2.pintarInformacion();
        Carta Carta3 = new Carta("Jose", TipoCarta.ATURDIR, 4);
        Carta3.pintarInformacion();
        Carta Carta4 = new Carta("Hola", TipoCarta.ATAQUE, 4);
        Carta4.pintarInformacion();
        Personaje Heroe = new Personaje("Heroe", 10);
        Personaje Villano = new Personaje("Villano", 10);
        mazo.add(Carta1);
        mazo.add(Carta2);
        mazo.add(Carta3);
        mazo.add(Carta4);
        personajes.add(Heroe);
        personajes.add(Villano);

        while(Heroe.getVidaPersonaje() > 0 && Villano.getVidaPersonaje()> 0){
            System.out.println("Ronda en progreso...");
            System.out.println("Vida del Heroe: " + Heroe.getVidaPersonaje());
            System.out.println("Vida del Villano: " + Villano.getVidaPersonaje());
        }   

            System.out.println("\n=== Resultado Final ===");
            if (Heroe.vidaPersonaje > Villano.vidaPersonaje) {
                System.out.println("¡Felicidades! Has ganado el duelo.");
            } else {
                System.out.println("La máquina ha ganado el duelo.");
            }

            System.out.println("");
        }
        // private static void generarRonda(){
        //     int i = 0;
        //     while (i < )
        // }
    }