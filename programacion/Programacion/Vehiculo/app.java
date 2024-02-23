package Programacion.Vehiculo;

public class app {
    public static void main(String[] args) {
        Coche coche1 = new Coche(4, 4, "1475ESP");
        System.out.println(coche1.toString());

        Moto moto1 = new Moto(2, "3355ESP");
        System.out.println(moto1.toString());
    }
}
