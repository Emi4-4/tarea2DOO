package org.example;

import java.time.Instant;
/**
 * Representa el registro de una invitación enviada a un destinatario específico
 * para asistir a una reunión en un instante determinado.
 * @author Valentina
 * @version 1.0
 */
public class Invitacion {
    private Instant hora;
    private Invitable destinatario;
    private Reunion reunion;

    /**
     * Inicializa una nueva invitación vinculando al destinatario con la reunión respectiva.
     * * @param destinatario La entidad (empleado o departamento) que recibe la invitación.
     * @param reunion      La reunión a la que se le convoca.
     * @param hora         El instante exacto en que se emite la invitación.
     */
    public Invitacion(Invitable destinatario, Reunion reunion, Instant hora) {
        this.destinatario=destinatario;
        this.hora=hora;
        this.reunion=reunion;
    }
    /**
     * Ejecuta la acción de invitar, delegando el comportamiento al destinatario correspondiente.
     */
    public void invitar() {
        destinatario.invitar(reunion);
    }

    public void setDestinatario(Invitable destinatario){
        this.destinatario=destinatario;
    }
    public Invitable getDestinatario(){ return destinatario;}
    public Reunion getReunion(){return reunion;}
    public Instant getHora(){ return hora;}

    public String toString(){
        return "Invitación: "+ destinatario + ", a reunión " + reunion + " a la hora " + hora;
    }
}
