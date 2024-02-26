package Programacion.Animales;

public class Leon extends Animales implements Carnivoro {

    public Leon(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }

    @Override
    public void alimentar(Carne carne) {
        System.out.println("Comen: " + carne.getNombre() + " " + carne.getCantidad() + "KG");
    }
}
