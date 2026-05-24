Tarea 2 DOO:

Emiliano León Allen Robles

Valentina Alejandra Serón Canales

Lenin Steeve Diaz cabezo


## Modificaciones y Justificaciones del Modelo UML

A continuación se detallan y justifican brevemente los cambios e incorporaciones realizados al modelo UML original para el desarrollo final del sistema:

### 1. Adición de Nuevas Clases y Extensiones
* **`InvitadoExterno`:** Se añadió esta clase que implementa la interfaz `Invitable`.
Justificación: Permite incluir en las reuniones a personas ajenas a la organización (con atributos como `empresa`).

* **`InformeReunion`:** Se incorporó esta clase con una relación de dependencia hacia `Reunion` (método `GenerarInforme(reunion: Reunion)`).
Justificación: Desacopla la lógica de generación y formateo de reportes o actas fuera de la clase principal.

* **Encapsulamiento Completo:** Se añadieron explícitamente todos los métodos de acceso (*getters* y *setters*) y el método `toString()` en clases como `ReunionVirtual`, `ReunionPresencial`, `Nota`, `Asistencia` y `Retraso` para asegurar la correcta consistencia entre el diseño visual y el código Java implementado.
* **Atributos de Composición en `Reunion`:** Se hicieron explícitas las variables de lista (`asistencias: List`, `notas: List`, `invitados: List`, `retrasos: List`) dentro del bloque de atributos de la clase abstracta `Reunion` para reflejar las relaciones de agregación y composición del diagrama.
* **Métodos de Configuración en `Invitacion`:** Se añadieron métodos clave como `setDestinatario(destinatario: Invitable)` para permitir la asignación dinámica de la invitación a cualquier entidad que pueda ser convocada.

* **Método `invitar(reunion: Reunion)` en `Empleado`:**
  * **Explicación:** Se añadió este método en la clase `Empleado`.
  * **Justificación:** Permite que el empleado maneje de forma autónoma su lógica interna al recibir la notificación de una reunión a la que fue convocado.

* **Relación de asociación en `Invitacion`:**
  * **Explicación:** Se añadieron explícitamente los atributos `destinatario: Invitable` y `reunion: Reunion` con sus respectivos *getters*.
  * **Justificación:** Rompe la ambigüedad del diagrama base al definir con precisión bidireccional a quién va dirigida la invitación y a qué reunión pertenece.

* **Atributo `departamento: Departamento` en `Empleado`:**
  * **Explicación:** Se agregó esta variable dentro de los atributos de `Empleado`.
  * **Justificación:** Sincroniza la relación visual de agregación del diagrama directamente como un atributo de código, facilitando saber a qué área pertenece el trabajador.

* **Método `getNombreCompleto(): String` en `Empleado`:**
  * **Explicación:** Se incorporó este método de conveniencia en `Empleado`.
  * **Justificación:** Facilita la obtención del formato "Nombre Apellido" centralizado en un solo punto, optimizando su uso en los métodos de impresión como el `toString()`.

* **Consistencia de Retraso:**
  * **Explicación:** La clase `Retraso` ahora cuenta con los métodos `getHora()`, `setHora()` y `toString()`.
  * **Justificación:** Otorga autonomía a la subclase para registrar y modificar de forma limpia el instante exacto del desfase temporal de un empleado.
 
* **Método `setDestinatario(destinatario: Invitable)` en `Invitacion`:**
  * **Explicación:** Se incorporó este método de configuración en la clase `Invitacion`.
  * **Justificación:** Permite asignar o cambiar de forma dinámica y en tiempo de ejecución a la entidad que recibe la invitación, abstrayendo si se trata de un miembro interno de la empresa (`Empleado`) o un tercero (`InvitadoExterno`) gracias al uso de la interfaz `Invitable`.
 
* **Método `asistio(): boolean` (o atributo `asiste`) en `Asistencia`:**
  * **Explicación:** Se añadió este estado booleano y su método de consulta en la clase `Asistencia`.
  * **Justificación:** Permite verificar de forma rápida y directa si el empleado estuvo presente o no en la reunión, facilitando el filtro de datos al momento de calcular los porcentajes totales de asistencia y ausencias.

* **Nuevos métodos en la clase `Departamento`:**
  * **Explicación:** Se añadieron los métodos `agregarEmpleados(empleado: Empleado)`, `getEmpleados()`, `getNombreDepartamento()`, `toString()` e `invitar(reunion: Reunion)`.
  * **Cómo se aplica (Justificación):** * `agregarEmpleados` y `getEmpleados` se aplican para poblar y manipular directamente la lista interna de trabajadores del área.
    * `invitar(reunion: Reunion)` permite recorrer de forma automatizada (mediante un bucle interno) a todos los empleados de ese departamento para convocarlos a la reunión masivamente en una sola acción.
