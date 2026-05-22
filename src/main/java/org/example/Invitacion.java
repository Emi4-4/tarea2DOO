package org.example;

import java.time.Instant;

public class Invitacion {
    private Instant hora;
    private Invitable destinatario;
    private Reunion reunion;

    public Invitacion(Invitable destinatario, Reunion reunion, Instant hora) {
        this.destinatario=destinatario;
        this.hora=hora;
        this.reunion=reunion;
    }

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
