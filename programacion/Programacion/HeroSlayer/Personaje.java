import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Personaje {
    private String nombrePersonaje;
    private Integer vidaPersonaje;
    private List<Carta> mazo;
    private boolean aturdido;

    public Personaje(String nombrePersonaje, Integer vidaPersonaje) {
        this.nombrePersonaje = nombrePersonaje;
        this.vidaPersonaje = vidaPersonaje;
        this.mazo = new ArrayList<>();
        this.aturdido = false;
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
            if (!aturdido) {
                if (carta.getTipoCarta() == TipoCarta.ATAQUE) {
                    vidaPersonaje -= carta.getAtaqueCarta();
                    if (vidaPersonaje < 0)
                        vidaPersonaje = 0;
                } else if (carta.getTipoCarta() == TipoCarta.CURA) {
                    vidaPersonaje += carta.getAtaqueCarta();
                }
                if (carta.getTipoCarta() == TipoCarta.ATURDIR) {
                    aturdido = true;
                }
            } else {
                System.out.println(nombrePersonaje + " está aturdido y no puede jugar cartas en esta ronda.");
                aturdido = false; // Desactivamos el aturdimiento para la próxima ronda
            }
        }
    }

    public Carta elegirCartaAleatoria() {
        Random random = new Random();
        if (!mazo.isEmpty()) {
            return mazo.get(random.nextInt(mazo.size()));
        } else {
            System.out.println(nombrePersonaje + " no tiene cartas en el mazo.");
            return null;
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

    public List<Carta> getMazo() {
        return mazo;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public boolean isAturdido() {
        return aturdido;
    }
}
