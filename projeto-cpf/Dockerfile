FROM eclipse-temurin:17-jdk-alpine

WORKDIR ./projeto-cpf
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","./app.jar"]
#ARG JAR_FILE
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
