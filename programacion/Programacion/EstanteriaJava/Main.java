package Programacion.EstanteriaJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estanteria estanteria = new Estanteria();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            mostrarMenu();
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarLibro(estanteria, scanner);
                    break;
                case 2:
                    eliminarLibro(estanteria, scanner);
                    break;
                case 3:
                    mostrarTop10(estanteria);
                    break;
                case 4:
                    mostrarEstanteria(estanteria);
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n------ Menú ------");
        System.out.println("1. Agregar libro");
        System.out.println("2. Eliminar libro");
        System.out.println("3. Mostrar Top 10");
        System.out.println("4. Mostrar estantería");
        System.out.println("0. Salir");
    }

    private static void agregarLibro(Estanteria estanteria, Scanner scanner) {
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.next();
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.next();
        System.out.print("Ingrese la calificación del libro: ");
        double calificacion = scanner.nextDouble();

        Llibre nuevoLibro = new Llibre(titulo, autor, calificacion);
        estanteria.afegirLlibre(nuevoLibro);
    }

    private static void eliminarLibro(Estanteria estanteria, Scanner scanner) {
        System.out.print("Ingrese la ID del libro a eliminar: ");
        int id = scanner.nextInt();
        estanteria.eliminarLlibre(id);
    }

    private static void mostrarTop10(Estanteria estanteria) {
        estanteria.top10();
    }

    private static void mostrarEstanteria(Estanteria estanteria) {
        estanteria.mostrarEstanteria();
    }
}

class Llibre {
    private static int contadorIds = 1;
    private int id;
    private String titol;
    private String autor;
    private double qualificacio;

    public Llibre(String titol, String autor, double qualificacio) {
        this.id = contadorIds++;
        this.titol = titol;
        this.autor = autor;
        this.qualificacio = qualificacio;
    }

    public int getId() {
        return id;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getQualificacio() {
        return qualificacio;
    }

    public void setQualificacio(double qualificacio) {
        this.qualificacio = qualificacio;
    }
}

class Estanteria {
    private List<Llibre> llibres;

    public Estanteria() {
        this.llibres = new ArrayList<>();
    }

    public void afegirLlibre(Llibre llibre) {
        if (llibres.size() < 10 && !llibres.contains(llibre)) {
            llibres.add(llibre);
            System.out.println("Libro agregado: " + llibre);
        } else {
            System.out.println("No se puede agregar el libro: " + llibre);
        }
    }

    public void eliminarLlibre(int id) {
        llibres.removeIf(llibre -> llibre.getId() == id);
    }

    public void top10() {
        List<Llibre> copiaLlibres = new ArrayList<>(llibres);
        copiaLlibres.sort(Comparator.comparingDouble(Llibre::getQualificacio).reversed());

        System.out.println("Top 10 libros:");
        for (int i = 0; i < Math.min(10, copiaLlibres.size()); i++) {
            System.out.println(copiaLlibres.get(i));
        }
    }

    public void mostrarEstanteria() {
        System.out.println("Contenido de la estantería:");
        for (Llibre llibre : llibres) {
            System.out.println(llibre);
        }
    }
}
