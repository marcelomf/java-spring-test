FROM eclipse-temurin:17-jdk-alpine

WORKDIR ./projeto-login
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
