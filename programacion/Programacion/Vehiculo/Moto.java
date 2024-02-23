package Programacion.Vehiculo;

public class Moto extends Vehiculo {
    public Moto(int ruedas, String matricula) {
        super(ruedas, matricula);
    }

    @Override
    public String toString() {
        return getMatricula() + "\n" + getRuedas();
    }
}
