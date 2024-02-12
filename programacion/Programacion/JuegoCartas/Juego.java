package Programacion.JuegoCartas;

import java.util.ArrayList;
import java.util.List;

public class Juego {
    private String nombre;
    private Double valoracion;
    private Integer publicacion;
    private List<CategoriaTipo> categorias;

    public Juego(String nombre, Double valoracion, Integer publicacion, CategoriaTipo... categorias) {
        this.nombre = nombre;
        this.valoracion = valoracion;
        this.publicacion = publicacion;
        this.categorias = new ArrayList<>();
        for (CategoriaTipo categoria : categorias) {
            this.categorias.add(categoria);
        }
    }

    public void addCategoria(CategoriaTipo categoria) {
        categorias.add(categoria);
    }

    public void setCategorias(List<CategoriaTipo> categorias) {
        this.categorias = categorias;
    }

    public void pintarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Valoración: " + valoracion);
        System.out.println("Publicación: " + publicacion);
        System.out.println("Categorías:");
        for (CategoriaTipo categoria : categorias) {
            System.out.println(" - " + categoria);
        }
    }

    public boolean tieneCategoria(CategoriaTipo categoria) {
        return categorias.contains(categoria);
    }

    public String getNombre() {
        return nombre;
    }
}
