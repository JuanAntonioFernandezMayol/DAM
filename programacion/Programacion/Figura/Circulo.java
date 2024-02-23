package Programacion.Figura;

public class Circulo extends Figura {
    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    Double calcularPerimetro() {
        System.out.println(Math.PI * (radio * 2));
        return Math.PI * (radio * 2);

    }

    @Override
    Double calcularArea() {
        System.out.println(Math.PI * (radio * radio));
        return Math.PI * (radio * radio);
    }
}
