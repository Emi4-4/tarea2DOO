package org.example;
/**
 * Excepción lanzada cuando se intenta realizar una operación no permitida,
 * como añadir participantes, en una reunión que ya ha sido dada por finalizada.
 * @author Valentina
 * @version 1.0
 */
public class ReunionHaFinalizadoExcepcion extends RuntimeException {
    /**
     * Construye la excepción especificando el motivo detallado del error.
     * * @param message Mensaje que describe la causa de la excepción.
     */
    public ReunionHaFinalizadoExcepcion(String message) {
        super(message);
    }
}
