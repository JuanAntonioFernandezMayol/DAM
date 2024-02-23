package Programacion.Vehiculo;

public class Coche extends Vehiculo {
    private int puertas;

    public Coche(int puertas, int ruedas, String matricula) {
        super(ruedas, matricula);
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return getMatricula() + "\n" + getRuedas() + "\n" + puertas;
    }

}
