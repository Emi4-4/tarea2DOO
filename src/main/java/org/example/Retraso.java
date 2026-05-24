package org.example;

import java.time.Instant;
/**
 * Representa un tipo específico de asistencia donde el empleado asiste a la reunión
 * pero llega en un instante posterior a la hora programada.
 * @author Emiliano
 * @version 1.0
 */
public class Retraso extends  Asistencia {
    private Instant hora;
    /**
     * Inicializa un registro de retraso vinculando al empleado con su hora real de llegada.
     * * @param empleado El empleado que llegó tarde.
     * @param hora     El instante exacto de la llegada en retraso.
     */
    public Retraso(Empleado empleado,Instant hora) {
        super(empleado,hora,true);
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
        return "[Retraso] El empleado " + getEmpleado().getNombreCompleto() + " llegó tarde a las: " + hora;
    }
}
