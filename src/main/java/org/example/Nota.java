package org.example;
/**
 * Representa una anotación o apunte tomado durante el desarrollo de una reunión.
 * @author Emiliano
 * @version 1.0
 */
public class Nota{
    private String contenido;
    /**
     * Crea una nueva nota con el texto descriptivo proporcionado.
     * * @param contenido El texto o cuerpo de la anotación.
     */
    public Nota(String contenido){
        this.contenido = contenido;
    }

    public String getContenido(){
        return contenido;
    }

    public void setContenido(String contenido){
        this.contenido = contenido;
    }
    @Override
    public String  toString(){
        return contenido;
    }
}