package Programacion.Personajes;

public class app {
    public static void main(String[] args) {
        Guerrero guerrero1 = new Guerrero("guerrero", 10, 10, 5);
        Mago mago1 = new Mago("mago", 11, 8, 8);

        guerrero1.atacar(mago1);
        System.out.println(mago1.toString());
        System.out.println(guerrero1.estaVivo());

        mago1.atacar(guerrero1);
        System.out.println(guerrero1.toString());
        System.out.println(mago1.estaVivo());
    }
}
