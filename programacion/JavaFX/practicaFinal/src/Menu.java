public class Menu {
    private int id;
    private String nombre;
    private int plato1Id;
    private int plato2Id;
    private double precioRebajado;
    private int restauranteId;

    public Menu(int id, String nombre, int plato1Id, int plato2Id, double precioRebajado, int restauranteId) {
        this.id = id;
        this.nombre = nombre;
        this.plato1Id = plato1Id;
        this.plato2Id = plato2Id;
        this.precioRebajado = precioRebajado;
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

    public int getPlato1Id() {
        return plato1Id;
    }

    public void setPlato1Id(int plato1Id) {
        this.plato1Id = plato1Id;
    }

    public int getPlato2Id() {
        return plato2Id;
    }

    public void setPlato2Id(int plato2Id) {
        this.plato2Id = plato2Id;
    }

    public double getPrecioRebajado() {
        return precioRebajado;
    }

    public void setPrecioRebajado(double precioRebajado) {
        this.precioRebajado = precioRebajado;
    }

    public int getRestauranteId() {
        return restauranteId;
    }

    public void setRestauranteId(int restauranteId) {
        this.restauranteId = restauranteId;
    }
}