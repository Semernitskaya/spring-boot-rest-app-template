FROM adoptopenjdk/openjdk11:latest
VOLUME /tmp
ARG JAR_FILE=controllers/target/template-0.1.jar
COPY ${JAR_FILE} app.jar
LABEL "description"="spring-boot-rest-app-template"
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]