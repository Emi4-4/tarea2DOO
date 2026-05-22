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
}
