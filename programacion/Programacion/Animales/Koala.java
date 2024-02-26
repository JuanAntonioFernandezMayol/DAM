package Programacion.Animales;

public class Koala extends Animales implements Herbivoro {

    public Koala(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }

    @Override
    public void alimentar(Vegetal vegetal) {
        System.out.println("Comen: " + vegetal.getNombre() + " " + vegetal.getCantidad() + "KG");
    }

}
