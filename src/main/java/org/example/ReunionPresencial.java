package org.example;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;
/**
 * Representa una reunión de carácter físico que se lleva a cabo
 * dentro de una sala específica de la empresa.
 * @author Emiliano
 * @version 1.0
 */
public class ReunionPresencial extends Reunion{
    private String sala;
    /**
     * Inicializa una reunión presencial con sus datos de agenda y la sala asignada.
     * * @param fecha            Fecha programada para el evento.
     * @param horaPrevista     Instante de tiempo planificado para el inicio.
     * @param duracionPrevista Tiempo estimado de duración del bloque.
     * @param organizador      Empleado que convoca y lidera la reunión.
     * @param tipoReu          Clasificación temática del tipo de reunión.
     * @param sala             Identificador o nombre de la sala física donde se realizará.
     */
    public ReunionPresencial(Date fecha, Instant horaPrevista, Duration duracionPrevista, Empleado organizador, tipoReunion tipoReu, String sala) {
        super(fecha, horaPrevista, duracionPrevista, organizador, tipoReu);
        this.sala = sala;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return super.toString() + " [Presencial] Sala: " + sala;
    }
}
