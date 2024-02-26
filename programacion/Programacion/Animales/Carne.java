package Programacion.Animales;

public class Carne {
    private String nombre;
    private int cantidad;

    public Carne(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }
}
