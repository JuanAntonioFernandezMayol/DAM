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
        // TODO Auto-generated method stub

    }

    @Override
    public void mostrarInformacion() {
        // TODO Auto-generated method stub

    }
}
