package Programacion.Animales;

public class Vegetal {
    private String nombre;
    private int cantidad;

    public Vegetal(String nombre, int cantidad) {
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
