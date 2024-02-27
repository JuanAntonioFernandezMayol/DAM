package Programacion.Animales;

public abstract class Animales {
    private String nombre;
    private int edad;
    private int peso;

    public Animales(String nombre, int edad, int peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Peso: " + peso + "KG";
    }
}
