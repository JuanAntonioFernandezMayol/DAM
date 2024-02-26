package Programacion.Personajes;

public abstract class Personaje {
    private String nombre;
    private int vida;
    private int fuerza;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public Personaje(String nombre, int vida, int fuerza) {
        this.nombre = nombre;
        this.vida = vida;
        this.fuerza = fuerza;
    }

    abstract public void atacar(Personaje personaje);

    abstract public void recibirAtaque(int daño);

    public boolean estaVivo() {
        if (vida > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return nombre + "\n" + vida;
    }
}
