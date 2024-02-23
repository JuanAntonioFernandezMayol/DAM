package Programacion.Vehiculo;

public abstract class Vehiculo {
    private int ruedas;
    private String matricula;

    public Vehiculo(int ruedas, String matricula) {
        this.ruedas = ruedas;
        this.matricula = matricula;
    }

    public int getRuedas() {
        return ruedas;
    }

    public String getMatricula() {
        return matricula;
    }

}
