import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Personaje {
    public String nombrePersonaje;
    public Integer vidaPersonaje;
    public List<Carta> mazo;

    public Personaje(String nombrePersonaje, Integer vidaPersonaje) {
        this.nombrePersonaje = nombrePersonaje;
        this.vidaPersonaje = vidaPersonaje;
        this.mazo = new ArrayList<>();
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombrePersonaje);
        System.out.println("Vida: " + vidaPersonaje);
    }

    public Carta jugarCarta() {
        Random random = new Random();
        if (!mazo.isEmpty()) {
            return mazo.remove(random.nextInt(mazo.size()));
        } else {
            System.out.println(nombrePersonaje + " no tiene cartas en el mazo.");
            return null;
        }
    }

    public void recibirEfecto(Carta carta) {
        if (carta != null) {
            if (carta.getTipoCarta() == TipoCarta.ATAQUE) {
                vidaPersonaje -= carta.getAtaqueCarta();
                if (vidaPersonaje < 0)
                    vidaPersonaje = 0;
            } else if (carta.getTipoCarta() == TipoCarta.CURA) {
                vidaPersonaje += carta.getAtaqueCarta();
            }
        }
    }

    public void anadirCartaAlMazo(Carta carta) {
        mazo.add(carta);
    }

    public Integer getVidaPersonaje() {
        return vidaPersonaje;
    }

    public void setVidaPersonaje(Integer vidaPersonaje) {
        this.vidaPersonaje = vidaPersonaje;
    }
}
