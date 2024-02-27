package Programacion.Empleado;

public class EmpleadoTiempoCompleto extends Persona implements Empleado {
    private int salario_anual;
    private String cargo;

    public EmpleadoTiempoCompleto(String nombre, String documentoIdentidad, int salario_anual, String cargo) {
        super(nombre, documentoIdentidad);
        this.salario_anual = salario_anual;
        this.cargo = cargo;
    }

    @Override
    public void calcularSalario() {
        System.out.println(salario_anual);
    }

    @Override
    public void mostrarInformacion() {

    };
}
