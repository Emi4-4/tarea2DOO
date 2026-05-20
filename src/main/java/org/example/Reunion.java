package org.example;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.List;

public abstract class Reunion {
    private Date fecha;
    private Instant horaPrevista;
    private Duration duracionPrevista;
    private Empleado organizador;
    private Instant horaInicio;
    //private List<Asistencia> asistencia;
    private List<Invitacion> invitaciones;
    private List<Empleado> invitados;
    private List<Nota> notas;
    private List<Invitable> asistentes;
    private tipoReunion tipoReunion;

    public Reunion(Date fecha, Instant horaPrevista, Duration duracionPrevista, Empleado organizador, tipoReunion tipoReu) {
        this.fecha=fecha;
        this.horaPrevista=horaPrevista;
        this.duracionPrevista=duracionPrevista;
    }



}
