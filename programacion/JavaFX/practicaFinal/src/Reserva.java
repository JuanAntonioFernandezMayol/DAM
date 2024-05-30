
public class Reserva {
    private int id;
    private String fecha;
    private String clienteNombre;
    private String clienteTelefono;
    private int restauranteId;

    public Reserva(int id, String fecha, String clienteNombre, String clienteTelefono, int restauranteId) {
        this.id = id;
        this.fecha = fecha;
        this.clienteNombre = clienteNombre;
        this.clienteTelefono = clienteTelefono;
        this.restauranteId = restauranteId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }

    public String getClienteTelefono() {
        return clienteTelefono;
    }

    public void setClienteTelefono(String clienteTelefono) {
        this.clienteTelefono = clienteTelefono;
    }

    public int getRestauranteId() {
        return restauranteId;
    }

    public void setRestauranteId(int restauranteId) {
        this.restauranteId = restauranteId;
    }
}
