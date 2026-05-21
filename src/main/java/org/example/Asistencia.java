package org.example;

public class Asistencia {
    private Empleado empleado;

    public  Asistencia(Empleado empleado) {
        this.empleado = empleado;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    @Override
    public String toString() {
        return "Asistencia: " + empleado.getNombre() + " " + empleado.getApellidos();
    }
}
