package org.example;


public class InvitadoExterno implements Invitable {
    private String nombre;
    private String apellidos;
    private String correo;
    private String empresa; // Opcional

    public InvitadoExterno(String nombre, String apellidos, String correo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
    }

    public InvitadoExterno(String nombre, String apellidos, String correo, String empresa) {
        this(nombre, apellidos, correo);
        this.empresa = empresa;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public String getCorreo() { return correo; }
    public String getEmpresa() { return empresa; }

    @Override
    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }

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
