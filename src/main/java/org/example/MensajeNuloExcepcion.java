package org.example;
/**
 * Excepción lanzada cuando se intenta registrar una nota o mensaje
 * cuyo contenido es nulo o vacío dentro del sistema.
 * @author Valentina
 * @version 1.0
 */
public class MensajeNuloExcepcion extends Exception {
    /**
     * Construye la excepción especificando el motivo detallado del error.
     * * @param message Mensaje que describe la causa de la excepción.
     */
    public MensajeNuloExcepcion(String message) {
        super(message);
    }
}
