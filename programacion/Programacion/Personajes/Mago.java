package Programacion.Personajes;

public class Mago extends Personaje {
    private int energia;

    public Mago(String nombre, int vida, int fuerza, int energia) {
        super(nombre, vida, fuerza);
        this.energia = energia;
    }

    @Override
    public void atacar(Personaje personaje) {
        if (energia > 4) {
            personaje.recibirAtaque(getFuerza() * 2);
            this.energia = this.energia - 4;
        } else {
            System.out.println("Tu energia es menor a 4");
        }
    }

    @Override
    public void recibirAtaque(int daño) {
        this.setVida(this.getVida() - daño);
    }

}
