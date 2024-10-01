---------------------------------------------------------------
|                            README                           |
---------------------------------------------------------------

Proyecto basado en la documentación oficial de Serenity BDD https://serenity-bdd.github.io/docs/tutorials/screenplay

1. Prerequisitos.

Este proyecto tiene los siguientes prerequisitos:

 - Maquina local con el sistema operativo Windows 11
 - IntelliJ IDEA 2024.2.2 (Community Edition)
    - Plugins en IntelliJ IDEA
      - Cucumber +
      - Cucumber for java
      - Gherkin
      - SonarLint
- Maven version 3.9.1 (Configurado en variables de entorno de sistema) y en IntelliJ IDEA en File/Settings/Build, Execution, Deployment/Buil Tools/Maven/Maven home path y especificar la ruta de instalación de Maven.
- JDK versión 11 (Configurado en variables de entorno de sistema)

2. Configuraciones previas.

Descargar los plugins en IntelliJ IDEA en settings/plugins:
 
      - Cucumber +
      - Cucumber for java
      - Gherkin
      - Maven
      - SonarLint

Descarga e importar el proyecto de github https://github.com/fbecerraa/Ejercicio1SerenityBDD.git a IntelliJ IDEA.
Debido a que es un proyecto con Maven, las dependencias se encuentran agregadas al archivo pom.xml.

En intelliJ IDEA seleccionar Projects, Get from VCS luego agregar la url del proyecto de github y Clonar, elegir la opción proyecto Maven.

3. Instrucciones para ejecutar el proyecto.

La ejecución del proyecto se puede realizar desde el archivo CucumberTestSuite ubicado en src/test/java/starter/ o desde la terminal de intelliJ IDEA con el comando mvn clean verify. Los test se encuentran en el archivo feature compracarrito.feature ubicado en src/test/resources/features/.

Al ejecutar el proyecto se puede ver el resultado de la ejecución en la terminal. Además Serenity genera dos tipos de reportes con resultados detallados de la ejecución que se pueden encontrar en:

SERENITY REPORTS

   - Full Report: Ubicación del proyecto =>/serenity-cucumber-starter/target/site/serenity/index.html
   - Single Page HTML Summary: Ubicación del proyecto =>/serenity-cucumber-starter/target/site/serenity/serenity-summary.html 

- Full Report: es un reporte completo, dispone de varias páginas para consultar a detalle la ejecución de una prueba, incluyendo el detalle de cada paso y capturas de pantalla de los resultados, para ser enviado por email se debe enviar toda la carpeta serenity. 
- Single Page HTML Summary: es un reporte simplificado, en este caso se puede enviar únicamente el archivo serenity-summary.html 
