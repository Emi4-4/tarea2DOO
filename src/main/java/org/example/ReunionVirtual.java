package org.example;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;
/**
 * Representa una reunión de carácter remoto que se lleva a cabo
 * a través de una plataforma en línea mediante un enlace de acceso.
 * @author Emiliano
 * @version 1.0
 */
public class ReunionVirtual extends Reunion{
    private String enlace;
    /**
     * Inicializa una reunión virtual con sus datos de agenda y el enlace de la videollamada.
     * * @param fecha            Fecha programada para el evento.
     * @param horaPrevista     Instante de tiempo planificado para el inicio.
     * @param duracionPrevista Tiempo estimado de duración del bloque.
     * @param organizador      Empleado que convoca y lidera la reunión.
     * @param tipoReu          Clasificación temática del tipo de reunión.
     * @param enlace           Dirección URL o link para conectarse a la sesión virtual.
     */
    public ReunionVirtual(Date fecha, Instant horaPrevista, Duration duracionPrevista, Empleado organizador, tipoReunion tipoReu, String enlace) {
        super(fecha, horaPrevista, duracionPrevista, organizador, tipoReu);
        this.enlace = enlace;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return super.toString() + " [Virtual] Enlace: " + enlace;
    }
}
