package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Clase utilitaria encargada de exportar y consolidar las estadísticas,
 * notas y participantes de una reunión en un archivo de texto externo.
 * @author Lenin
 * @version 1.0
 */
public class InformeReunion {
    /**
     * Genera un archivo de texto llamado "informe_reunion.txt" con el resumen completo
     * de la reunión, incluyendo asistencia, duración, notas y lista de invitados.
     * * @param Reunion La reunión de la cual se extraerán los datos para el reporte.
     */
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
