package org.example;
/**
 * Excepción lanzada cuando se intenta iniciar una reunión que ya se
 * encuentra en desarrollo o que ya ha registrado su tiempo de inicio.
 * @author Lenin
 * @version 1.0
 */
public class ReunionYaIniciada extends Exception {

    /**
     * Construye la excepción especificando el motivo detallado del error.
     * @param message Mensaje que describe la causa de la excepción.
     */
    public ReunionYaIniciada(String message) {
        super(message);
    }
}
