package Programacion.Animales;

public class Oso extends Animales implements Carnivoro, Herbivoro {

    public Oso(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }

    @Override
    public void alimentar(Carne carne) {
        System.out.println("Comen: " + carne.getNombre() + " " + carne.getCantidad() + "KG");
    }

    @Override
    public void alimentar(Vegetal vegetal) {
        System.out.println("Comen: " + vegetal.getNombre() + " " + vegetal.getCantidad() + "KG");
    }
}
