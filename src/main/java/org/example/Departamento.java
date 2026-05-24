package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un departamento de la empresa que agrupa empleados y permite invitaciones masivas.
 * @author Valentina
 * @version 1.0
 */

public class Departamento implements Invitable{
    private String nombre;
    private List<Empleado> empleados;

    /**
     * Inicializa un departamento vacío con su nombre correspondiente.
     * * @param nombreDepartamento El nombre que identifica al departamento.
     */
    public Departamento(String nombreDepartamento) {
        this.nombre=nombreDepartamento;
        this.empleados=new ArrayList<>();
    }

    /**
     * Añade un empleado al departamento y actualiza la relación del departamento con el empleado.
     * * @param empleado El empleado que se unirá a este departamento.
     */
    public void agregarEmpleados(Empleado empleado){
        empleados.add(empleado);
        empleado.setDepartamento(this);
    }
    public int obtenerCantidadEmpleados() {
        return empleados.size();
    }

    public String getNombreDepartamento() {
        return nombre;
    }

    public List<Empleado> getEmpleados() {
        return new ArrayList<>(empleados);
    }

    public String toString() {
        return "Departamento: " + nombre + ", empleados: " + empleados + ".";
    }

    @Override
    public void invitar(Reunion reunion) {

    }
}
