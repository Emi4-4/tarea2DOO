package org.example;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class ReunionDatos extends Reunion {
    public ReunionDatos(Date fecha,
                        Instant horaPrevista,
                        Duration duracionPrevista,
                        Empleado organizador,
                        tipoReunion tipoReu){
        super(fecha, horaPrevista, duracionPrevista, organizador, tipoReu);
    }
}
