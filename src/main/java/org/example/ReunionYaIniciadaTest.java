package org.example;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReunionYaIniciadaTest {

    @Test
    public void noDebeIniciarDosVeces() throws ReunionYaIniciada {

        Empleado organizador = new Empleado(
                "pruebaID",
                "pruebaApellido",
                "pruebaNombre",
                "pruebaCorreo");

        Reunion reunion = new ReunionPresencial(
                new Date(),
                Instant.now(),
                Duration.ofMinutes(30),
                organizador,
                tipoReunion.TECNICA,
                "Sala 1");

        reunion.iniciar();

        assertThrows(
                ReunionYaIniciada.class,
                () -> reunion.iniciar()
        );
    }
}