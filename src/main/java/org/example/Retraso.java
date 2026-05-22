package org.example;

import java.time.Instant;

public class Retraso extends  Asistencia {
    private Instant hora;
    public Retraso(Empleado empleado,Instant hora) {
        super(empleado);
        this.hora = hora;
    }
    public Instant getHora() {
        return hora;
    }

    public void setHora(Instant hora) {
        this.hora = hora;
    }
    @Override
    public String toString() {
        return "[Retraso] El empleado " + super.getEmpleado().getNombre() + " " +
                super.getEmpleado().getApellidos() + " llegó tarde a las: " + hora;
    }
}
