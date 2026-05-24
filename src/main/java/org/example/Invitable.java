package org.example;
/**
 * Define el contrato para cualquier entidad que sea capaz de recibir
 * una invitación formal a una reunión dentro del sistema.
 * @author Emiliano
 * @author valentina
 * @version 1.0
 */
public interface Invitable {
    /**
     * Envía o procesa una invitación formal para la reunión especificada.
     * * @param reunion La reunión a la cual se está invitando a la entidad.
     */
    void invitar(Reunion reunion);
}
