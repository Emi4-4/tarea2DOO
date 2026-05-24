package org.example;

import java.time.Instant;
/**
 * Representa la asistencia de un empleado a una reunión,
 * registrando su hora de llegada y su estado de presencia.
 * @author Emiliano
 * @author Valentina
 * @version 1.0
 */
public class Asistencia {
    private Empleado empleado;
    private Instant horaLlegada;
    private boolean asiste;

    /**
     * Construye un registro de asistencia completo.
     * * @param empleado El empleado asociado a la asistencia.
     * @param llegada  La fecha y hora exacta de llegada.
     * @param asistio  true si el empleado estuvo presente, false si se ausentó.
     */
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
    public boolean getAsiste() { return asiste;}

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
