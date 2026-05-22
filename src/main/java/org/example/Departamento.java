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

    @Override
    public String getNombreCompleto() {
        return "";
    }

    @Override
    public String getCorreo() {
        return "";
    }
}
