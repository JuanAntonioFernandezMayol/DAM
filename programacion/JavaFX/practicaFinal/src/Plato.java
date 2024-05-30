import java.sql.Connection;
import java.util.List;

public class Plato {
    private int id;
    private String nombre;
    private String tipo;
    private double precio;
    private int restauranteId;

    public Plato(int id, String nombre, String tipo, double precio, int restauranteId) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.restauranteId = restauranteId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getRestauranteId() {
        return restauranteId;
    }

    public void setRestauranteId(int restauranteId) {
        this.restauranteId = restauranteId;
    }
}
