package Programacion.Empleado;

public class EmpleadoContrato extends Persona implements Empleado {
    private int salarioMensual;
    private int duracionContrato;

    public EmpleadoContrato(String nombre, String documentoIdentidad, int salarioMensual, int duracionContrato) {
        super(nombre, documentoIdentidad);
        this.salarioMensual = salarioMensual;
        this.duracionContrato = duracionContrato;
    }

    @Override
    public void calcularSalario() {
        if (duracionContrato > 12) {
            salarioMensual = salarioMensual * 12;
            System.out.println(salarioMensual);
        } else {
            duracionContrato = duracionContrato * salarioMensual;
            System.out.println(duracionContrato);
        }

    }

    @Override
    public void mostrarInformacion() {

    }
}
