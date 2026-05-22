package org.example;

import java.time.Instant;

public class Asistencia {
    private Empleado empleado;
    private Instant horaLlegada;
    private boolean asiste;

    public Asistencia(Empleado empleado, Instant llegada, boolean asistio){
        this.empleado=empleado;
        this.asiste=asistio;
        this.horaLlegada=llegada;
    }

    public boolean asistio() {
        return asiste;
    }

    public void setAsiste(boolean asiste) {
        this.asiste = asiste;
    }

    public Empleado getEmpleado() {
        return this.empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Instant getHoraLlegada() {
        return this.horaLlegada;
    }

    public void setHoraLlegada(Instant horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    @Override
    public String toString() {
        return "Asistencia [" + (empleado != null ? empleado.getNombreCompleto() : "Sin nombre") +
                ", Llegada=" + horaLlegada + ", Asistió=" + asiste + "]";
    }
}
