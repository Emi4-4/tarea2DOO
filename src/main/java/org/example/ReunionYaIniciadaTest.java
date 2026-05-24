package org.example;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertThrows;
/**
 * Clase de pruebas unitarias encargada de verificar el comportamiento de control
 * de estados de la reunión y la correcta emisión de excepciones ante re-inicios.
 * @author Lenin
 * @version 1.0
 */
public class ReunionYaIniciadaTest {
    /**
     * Valida que al intentar invocar el método iniciar() por segunda vez sobre
     * una misma reunión, el sistema lance de manera controlada una excepción ReunionYaIniciada.
     * @throws ReunionYaIniciada Si ocurre un error inesperado en la primera inicialización.
     */
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