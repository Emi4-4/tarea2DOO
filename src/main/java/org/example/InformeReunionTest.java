package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Clase de pruebas unitarias encargada de validar la correcta generación,
 * escritura y contenido del archivo de texto del informe de reuniones.
 * @author Lenin
 * @version 1.0
 */
public class InformeReunionTest{
    private final String ARCHIVO = "informe_reunion.txt";
    /**
     * Limpia el entorno de pruebas eliminando el archivo generado
     * después de la ejecución de cada test.
     * * @throws Exception Si ocurre un error al intentar borrar el archivo.
     */
    @AfterEach
    void cleanup() throws Exception {
        Files.deleteIfExists(Paths.get(ARCHIVO));
    }

    /**
     * Verifica que el método GenerarInforme cree exitosamente el archivo físico
     * y que contenga las etiquetas, nombres de participantes y métricas correctas.
     */
    @Test
    void generarinforme(){
        //Datos base para una reunion
        Reunion reunion = new ReunionDatos(
                new Date(),
                Instant.now(),
                Duration.ofMinutes(30),
                new Empleado("1", "Apellido", "Nombre", "pruebacorreo1@gmail.com"), tipoReunion.TECNICA);
        Empleado invitado = new Empleado("2", "Apellido2", "Nombre inv", "correoinv@gmail.com");
        reunion.setInvitado(invitado);

        InformeReunion.GenerarInforme(reunion);
        //Verifica la creacion del archivo txt
        assertTrue(Files.exists(Paths.get(ARCHIVO)));

        //Lee el archivo
        String lectura = assertDoesNotThrow(()->
        Files.readString(Paths.get(ARCHIVO)));

        //Verificacion
        assertTrue(lectura.contains("Informe de la reunion"));
        assertTrue(lectura.contains("Nombre Apellido"));
        assertTrue(lectura.contains("Cantidad de invitados: 1"));

        }
    }
