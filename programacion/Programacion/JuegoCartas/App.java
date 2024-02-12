package Programacion.JuegoCartas;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Juego> juegos = crearColeccionJuegos();

        // Buscar juego por nombre
        Juego juegoEncontrado = buscarJuegoPorNombre("7 Wonders", juegos);
        if (juegoEncontrado != null) {
            System.out.println("Juego encontrado: " + juegoEncontrado.getNombre());
        } else {
            System.out.println("Juego no encontrado");
        }

        // Buscar juegos por categoría
        List<Juego> juegosEstrategia = buscarJuegosPorCategoria(CategoriaTipo.ESTRATEGIA, juegos);
        System.out.println("Juegos de estrategia:");
        pintarColeccionJuegos(juegosEstrategia);

        // Pintar colección de juegos
        pintarColeccionJuegos(juegos);
    }

    public static List<Juego> crearColeccionJuegos() {
        List<Juego> juegos = new ArrayList<>();
        juegos.add(new Juego("7 Wonders", 8.5, 2010, CategoriaTipo.ESTRATEGIA, CategoriaTipo.CARTAS));
        juegos.add(new Juego("Carcassonne", 8.0, 2000, CategoriaTipo.FAMILIAR, CategoriaTipo.DADOS));
        juegos.add(new Juego("Codenames", 7.8, 2015, CategoriaTipo.CARTAS, CategoriaTipo.FAMILIAR));
        juegos.add(new Juego("Ticket to Ride", 7.5, 2004, CategoriaTipo.ESTRATEGIA));
        juegos.add(new Juego("Pandemic", 7.0, 2008, CategoriaTipo.COOPERATIVO));
        return juegos;
    }

    public static Juego buscarJuegoPorNombre(String nombre, List<Juego> juegos) {
        for (Juego juego : juegos) {
            if (juego.getNombre().equals(nombre)) {
                return juego;
            }
        }
        return null;
    }

    public static List<Juego> buscarJuegosPorCategoria(CategoriaTipo categoria, List<Juego> juegos) {
        List<Juego> juegosEncontrados = new ArrayList<>();
        for (Juego juego : juegos) {
            if (juego.tieneCategoria(categoria)) {
                juegosEncontrados.add(juego);
            }
        }
        return juegosEncontrados;
    }

    public static void pintarColeccionJuegos(List<Juego> juegos) {
        for (Juego juego : juegos) {
            juego.pintarInformacion();
            System.out.println();
        }
    }
}
