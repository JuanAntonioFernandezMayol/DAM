package Programacion.Empleado;

public class GestionEmpleados {
    public static void main(String[] args) {
        EmpleadoContrato empleado1 = new EmpleadoContrato("pepe", "432456587Y", 2000, 13);
        empleado1.calcularSalario();
        EmpleadoPorHora empleado2 = new EmpleadoPorHora("pepe", "432456587Y", 20, 13);
        empleado2.calcularSalario();
        EmpleadoTiempoCompleto empleado3 = new EmpleadoTiempoCompleto("pepe", "432456587Y", 35000, "Mid-Programing");
        empleado3.calcularSalario();

    }
}
