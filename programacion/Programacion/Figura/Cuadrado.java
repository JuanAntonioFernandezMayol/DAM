package Programacion.Figura;

public class Cuadrado extends Figura {
    private Double lado;

    public Cuadrado(Double lado) {
        this.lado = lado;
    }

    @Override
    Double calcularArea() {
        System.out.println(lado * lado);
        return lado * lado;
    }

    @Override
    Double calcularPerimetro() {
        System.out.println(lado * 4);
        return lado * 4;
    }
}
