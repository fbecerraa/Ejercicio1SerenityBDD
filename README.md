 # README

Proyecto basado en la documentación oficial de Serenity BDD Documentación de Serenity BDD

1. **Prerequisitos**

   Este proyecto tiene los siguientes prerequisitos:

   - Máquina local con el sistema operativo Windows 11
   - IntelliJ IDEA 2024.2.2 (Community Edition)
     - Plugins en IntelliJ IDEA:
       - Cucumber +
       - Cucumber for Java
       - Gherkin
       - SonarLint
   - Maven versión 3.9.1 (Configurado en variables de entorno de sistema y en IntelliJ IDEA en `File > Settings > Build, Execution, Deployment > Build Tools > Maven > Maven home path` y especificar la ruta de instalación de Maven)
   - JDK versión 11 (Configurado en variables de entorno de sistema), en IntelliJ IDEA en `File > Project Structure > Project` seleccionar el SDK 11.

2. **Configuraciones Previas**

   Descargar los plugins en IntelliJ IDEA en `Settings > Plugins`:

   - Cucumber +
   - Cucumber for Java
   - Gherkin
   - Maven
   - SonarLint

   Descarga e importa el proyecto de GitHub Ejercicio1SerenityBDD a IntelliJ IDEA.

   Debido a que es un proyecto con Maven, las dependencias se encuentran agregadas al archivo `pom.xml`. En IntelliJ IDEA seleccionar `Projects > Get from VCS`, luego agregar la URL del proyecto de GitHub y clonar, elegir la opción proyecto Maven.

3. **Instrucciones para Ejecutar el Proyecto**

   La ejecución del proyecto se puede realizar desde la terminal de IntelliJ IDEA con el comando `mvn clean verify`. Los tests se encuentran en el archivo feature `compracarrito.feature` ubicado en `src/test/resources/features/`.

   Al ejecutar el proyecto se puede ver el resultado de la ejecución en la terminal. Además, Serenity genera dos tipos de reportes con resultados detallados de la ejecución.

4. **Serenity Reports**

   - **Full Report**: Ubicación del proyecto => `/serenity-cucumber-starter/target/site/serenity/index.html`
   - **Single Page HTML Summary**: Ubicación del proyecto => `/serenity-cucumber-starter/target/site/serenity/serenity-summary.html`

   **Full Report**: es un reporte completo, dispone de varias páginas para consultar a detalle la ejecución de una prueba, incluyendo el detalle de cada paso y capturas de pantalla de los resultados. Para ser enviado por email se debe enviar toda la carpeta `serenity`.

    **Single Page HTML Summary**: es un reporte simplificado, en este caso se puede enviar únicamente el archivo `serenity-summary.html`.
