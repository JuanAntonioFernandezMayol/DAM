package Programacion.Empleado;

public class Persona {
    private String nombre;
    private String documentoIdentidad;

    public Persona(String nombre, String documentoIdentidad) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }
}
