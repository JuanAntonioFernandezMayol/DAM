package Programacion.Empleado;

public class EmpleadoPorHora extends Persona implements Empleado {
    private int tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHora(String nombre, String documentoIdentidad, int tarifaPorHora, int horasTrabajadas) {
        super(nombre, documentoIdentidad);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public void calcularSalario() {
        tarifaPorHora = tarifaPorHora * horasTrabajadas;
        System.out.println(tarifaPorHora);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(tarifaPorHora);
    }

}
