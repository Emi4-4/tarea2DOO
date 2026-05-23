package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class InformeReunionTest{
    private final String ARCHIVO = "informe_reunion.txt";
    @AfterEach
    void cleanup() throws Exception {
        Files.deleteIfExists(Paths.get(ARCHIVO));
    }
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
