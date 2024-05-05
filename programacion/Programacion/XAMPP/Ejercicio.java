package Programacion.XAMPP;

public class Ejercicio {
    private Integer ID;
    private String Nombre;
    private String Ubicacion;
    private String tipoTienda;
    private Integer Metros;
    private Integer Cerrada;

    public Ejercicio(Integer ID, String nombre, String ubicacion, String tipoTienda, Integer metros, Integer cerrada) {
        this.ID = ID;
        this.Nombre = nombre;
        this.Ubicacion = ubicacion;
        this.tipoTienda = tipoTienda;
        this.Metros = metros;
        this.Cerrada = cerrada;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer iD) {
        ID = iD;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public String getTipoTienda() {
        return tipoTienda;
    }

    public void setTipoTienda(String tipoTienda) {
        tipoTienda = tipoTienda;
    }

    public Integer getMetros() {
        return Metros;
    }

    public void setMetros(Integer metros) {
        Metros = metros;
    }

    public Integer getCerrada() {
        return Cerrada;
    }

    public void setCerrada(Integer cerrada) {
        Cerrada = cerrada;
    }
}
