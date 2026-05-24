package org.example;
/**
 * Representa a un empleado de la empresa con sus datos personales y de contacto,
 * y define su comportamiento al ser invitado a reuniones.
 * @author Emiliano
 * @author Valentina
 * @version 1.0
 */
public class Empleado implements Invitable {
    private String id;
    private String apellidos;
    private String nombre;
    private String correo;
    private Departamento departamento;

    /**
     * Inicializa un nuevo empleado con sus datos de identificación y contacto base.
     * * @param id        El identificador único del empleado.
     * @param apellidos Los apellidos del empleado.
     * @param nombre    El nombre del empleado.
     * @param correo    La dirección de correo electrónico .
     */
    public Empleado(String id, String apellidos, String nombre, String correo) {
        this.id = id;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.correo = correo;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Departamento getDepartamento() { return departamento; }
    public void setDepartamento(Departamento departamento) { this.departamento = departamento; }

    /**
     * Realiza la simulación del envío de una invitación al correo del empleado
     * para la reunión especificada.
     * * @param reunion La reunión a la cual se está invitando al empleado.
     */
    @Override
    public void invitar(Reunion reunion){
        System.out.println("Enviando correo de invitación a: " + nombre + " " + apellidos + " (" + correo + ")");
    }

    /**
     * Obtiene el nombre y los apellidos del empleado concatenados de forma legible.
     * * @return El nombre completo del empleado en formato de texto.
     */

    public String getNombreCompleto() {
        return this.nombre + " " + this.apellidos;
    }

    @Override
    public String toString() {
        return "Empleado [ID=" + id + ", Nombre=" + nombre + " " + apellidos + ", Correo=" + correo + "]";
    }
}
