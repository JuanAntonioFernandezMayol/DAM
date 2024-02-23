package Programacion.Figura;

public class app {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(2.2);
        circulo1.calcularArea();
        circulo1.calcularPerimetro();

        Cuadrado cuadrado1 = new Cuadrado(6.1);
        cuadrado1.calcularArea();
        cuadrado1.calcularPerimetro();

        Rectangulo rectangulo1 = new Rectangulo(3.3, 3.3);
        rectangulo1.calcularArea();
        rectangulo1.calcularPerimetro();
    }
}
