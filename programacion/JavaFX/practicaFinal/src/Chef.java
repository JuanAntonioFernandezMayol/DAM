public class Chef {
    private int id;
    private String nombre;
    private String especialidad;
    private int restauranteId;

    public Chef(int id, String nombre, String especialidad, int restauranteId) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getRestauranteId() {
        return restauranteId;
    }

    public void setRestauranteId(int restauranteId) {
        this.restauranteId = restauranteId;
    }
}
