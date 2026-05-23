package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class InformeReunion {
    public static void GenerarInforme (Reunion Reunion){
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("informe_reunion.txt"));

            writer.println("Informe de la reunion");
            writer.println();

            writer.println("Fecha: " + Reunion.getFecha());
            writer.println("Hora prevista: " + Reunion.getHoraPrevista());
            writer.println("Organizador: " + Reunion.getOrganizador().getNombreCompleto());
            writer.println("Tipo de reunion: " + Reunion.getTipoReunion());
            writer.println();

            writer.println("Cantidad de invitados: " + Reunion.getListaInvitados().size());
            writer.println("Total de asistentes: " + Reunion.obtenerTotalAsistencia());
            writer.println("Porcentaje de asistencia: " + Reunion.obtenerPorcentajeAsistencia() + "%");
            writer.println("Duracion de la reunion: " + Reunion.calcularTiempoReal() + " segundos");
            writer.println();

            writer.println("Invitados");
            writer.println();

            for (Invitable invitado : Reunion.getListaInvitados()){
                writer.println("- " + invitado.toString());
            }
            writer.println();

            writer.println("Notas");
            writer.println();

            for (Nota nota : Reunion.getNotas()){
                writer.println("- " + nota.toString());
            }
            writer.println();

            writer.close();

            System.out.print("Informe generado correctamente");


        } catch (IOException e){
            System.out.print("Error al generar el informe");
            e.printStackTrace();
        }
    }
}
