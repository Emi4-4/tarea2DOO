package org.example;

/**
 * Representa a un asistente externo a la empresa, registrando sus datos
 * de contacto y la organización a la que pertenece.
 * @author Valentina
 * @version 1.0
 */
public class InvitadoExterno implements Invitable {
    private String nombre;
    private String apellidos;
    private String correo;
    private String empresa; // Opcional

    /**
     * Inicializa un invitado externo con sus datos personales básicos de contacto.
     * * @param nombre    El nombre del invitado.
     * @param apellidos Los apellidos del invitado.
     * @param correo    La dirección de correo electrónico.
     */
    public InvitadoExterno(String nombre, String apellidos, String correo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
    }
    /**
     * Inicializa un invitado externo incluyendo el nombre de la empresa de procedencia.
     * * @param nombre    El nombre del invitado.
     * @param apellidos Los apellidos del invitado.
     * @param correo    La dirección de correo electrónico.
     * @param empresa   La empresa o institución que representa.
     */
    public InvitadoExterno(String nombre, String apellidos, String correo, String empresa) {
        this(nombre, apellidos, correo);
        this.empresa = empresa;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public String getCorreo() { return correo; }
    public String getEmpresa() { return empresa; }

    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }
    /**
     * Simula el envío de una notificación por correo electrónico especial
     * para redes o plataformas externas a la empresa.
     * * @param reunion La reunión a la que es convocado.
     */
    @Override
    public void invitar(Reunion reunion) {
        System.out.println("Enviando invitación por email a invitado externo: " + getNombreCompleto() +
                " (" + correo + ") para reunión: " + reunion.getTipoReunion());
    }

    @Override
    public String toString() {
        return "InvitadoExterno{nombre='" + getNombreCompleto() + "', correo='" + correo +
                (empresa != null ? "', empresa='" + empresa + "'" : "") + "}";
    }
}
