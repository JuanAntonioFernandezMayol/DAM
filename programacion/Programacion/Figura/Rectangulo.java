package Programacion.Figura;

public class Rectangulo extends Figura {
    private Double base;
    private Double altura;

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    Double calcularArea() {
        System.out.println(base * altura);
        return base * altura;
    }

    @Override
    Double calcularPerimetro() {
        System.out.println((altura * 2) + (base * 2));
        return (altura * 2) + (base * 2);
    }
}
