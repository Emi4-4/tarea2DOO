package org.example;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
/**
 * Implementación concreta de la clase Reunion utilizada para instanciar
 * y almacenar los datos específicos de una reunión programada.
 * @author Lenin
 * @version 1.0
 */
public class ReunionDatos extends Reunion {
    /**
     * Construye una instancia con los datos obligatorios iniciales pasándolos a la superclase.
     * * @param fecha            Fecha programada para el evento.
     * @param horaPrevista     Instante de tiempo planificado para el inicio.
     * @param duracionPrevista Tiempo estimado de duración del bloque.
     * @param organizador      Empleado que convoca y lidera la reunión.
     * @param tipoReu          Clasificación temática del tipo de reunión.
     */
    public ReunionDatos(Date fecha,
                        Instant horaPrevista,
                        Duration duracionPrevista,
                        Empleado organizador,
                        tipoReunion tipoReu){
        super(fecha, horaPrevista, duracionPrevista, organizador, tipoReu);
    }
}
