package Programacion.Personajes;

public class Guerrero extends Personaje {
    private int resistencia;

    public Guerrero(String nombre, int vida, int fuerza, int resistencia) {
        super(nombre, vida, fuerza);
        this.resistencia = resistencia;
    }

    @Override
    public void atacar(Personaje personaje) {
        // this.getFuerza() - personaje.vida;
        personaje.recibirAtaque(this.getFuerza());
    }

    @Override
    public void recibirAtaque(int daño) {
        if (daño > resistencia) {
            daño = daño - resistencia;
            this.setVida(this.getVida() - daño);
            resistencia = 0;
        } else {
            resistencia = resistencia - daño;
        }
    }
}
