## TALLER 5
## ESCUELA COLOMBIANA DE INGENIERÍA
## INTRODUCCIÓN A PROYECTOS WEB
###Integrantes:
### Yesid Carrillo
### Ronaldo Henao

Usamos el siguiente comando para crear el arquetipo:

``mvn archetype:generate -DgroupId=edu.eci.cvds -DartifactId=WebApplication -DarchetypeArtifactId=maven-archetype-webapp-Dpackage=edu.eci.cvds.servlet -DinteractiveMode=false ``

una vez hechas las configuraciones en el pom cargamos el servidor con:

``mvn package`` 

``mvn tomcat7:run``