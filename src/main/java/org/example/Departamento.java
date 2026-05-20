package org.example;

import java.util.ArrayList;
import java.util.List;

public class Departamento implements Invitable{
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String nombreDepartamento) {
        this.nombre=nombreDepartamento;
        this.empleados=new ArrayList<>();
    }

    public int obtenerCantidadEmpleados() {
        return empleados.size();
    }

    public String getNombreDepartamento() {
        return nombre;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public String toString() {
        return "Departamento: " + nombre + ", empleados: " + empleados + ".";
    }

    public void invitar(Reunion reunion) {

    }

}
