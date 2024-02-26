package Programacion.Animales;

public class app {
    public static void main(String[] args) {
        Leon leon1 = new Leon("leon", 10, 100);
        System.out.println(leon1.toString());

        Carne pollo = new Carne("pechuga", 5);
        Vegetal lechuga = new Vegetal("lechuga", 20);
        leon1.alimentar(pollo);

        Koala koala1 = new Koala("Koala", 10, 199);
        System.out.println(koala1.toString());
        koala1.alimentar(lechuga);

        Oso oso1 = new Oso("oso", 20, 600);
        System.out.println(oso1.toString());
        oso1.alimentar(pollo);
        oso1.alimentar(lechuga);

    }
}
