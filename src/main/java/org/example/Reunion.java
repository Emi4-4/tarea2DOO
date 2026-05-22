package org.example;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Reunion {
    private Date fecha;
    private Instant horaPrevista;
    private Duration duracionPrevista;
    private Empleado organizador;
    private Instant horaInicio;
    private Instant horaFin;
    private tipoReunion tipoReunion;
    private List<Asistencia> asistencias;
    //private List<Invitacion> invitaciones;
    private List<Nota> notas;
    private List<Invitable> invitados;


    public Reunion(Date fecha, Instant horaPrevista, Duration duracionPrevista, Empleado organizador, tipoReunion tipoReu) {
        this.fecha=fecha;
        this.horaPrevista=horaPrevista;
        this.duracionPrevista=duracionPrevista;
        this.organizador = organizador;
        this.tipoReunion=tipoReu;
        this.invitados = new ArrayList<>();
        this.notas = new ArrayList<>();
        this.asistencias = new ArrayList<>();
    }

    public void setInvitado(Invitable invitado) {
        if (invitado != null) {
            this.invitados.add(invitado);
        }
    }

    public void iniciar(){
        this.horaInicio=Instant.now();
    }

    public void enviarInvitaciones() {
        for (Invitable invitado : invitados) {
            invitado.invitar(this);
        }
    }
    public void finalizar(){
        this.horaFin=Instant.now();
    }

    public float calcularTiempoReal(){
        if (this.horaInicio != null && this.horaFin != null) {
            Duration duracion = Duration.between(this.horaInicio, this.horaFin);
            return (float) duracion.toSeconds();
        }else{
            return 0.0f;
        }
    }
    public void registrarAsistencia(Invitable invitado, Instant horaLlegada) {
        Asistencia nuevaAsistencia = new Asistencia((Empleado) invitado, horaLlegada, true);
        // Determinar si es tarde (10 minutos después de hora prevista como ejemplo)
        // desarrollar tema de los atrasos
        this.asistencias.add(nuevaAsistencia);
    }
    public int obtenerTotalAsistencia(){
        int total = 0;
        for (Asistencia asistencia : asistencias) {
            if (asistencia.asistio()) {
                total++;
            }
        }
        return total;

    }
    public float obtenerPorcentajeAsistencia(){
        int totalAsistencia = obtenerTotalAsistencia();
        int totalInvitados = this.invitados.size(); // Suponiendo que participantes incluye a todos los invitados
        if (totalInvitados == 0) {
            return 0;
        }
        return (totalAsistencia / (float) totalInvitados) * 100;
    }

    public void setParticipantes(Empleado empleado){
        Asistencia asiste;
        // falta desarrollar
    }

    public Date getFecha() { return fecha; }
    public Instant getHoraPrevista() { return horaPrevista; }
    public Instant getHoraInicio() { return horaInicio; }
    public Instant getHoraFin() { return horaFin; }
    public Empleado getOrganizador() { return organizador; }
    public tipoReunion getTipoReunion() { return tipoReunion; }
    public List<Invitable> getListaInvitados() { return new ArrayList<>(invitados); }
    public List<Asistencia> getAsistencias() { return new ArrayList<>(asistencias); }
    public List<Nota> getNotas() { return new ArrayList<>(notas); }

    @Override
    public String toString() {
        return "Reunion: " + fecha + ", " + horaPrevista +
                ", organizador=" + organizador.getNombreCompleto() +
                ", tipo=" + tipoReunion + ".";
    }
}
