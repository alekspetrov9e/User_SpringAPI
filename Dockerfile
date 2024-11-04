FROM openjdk:17-jdk-slim
LABEL authors="aleks1914"
ARG JAR_FILE=target/*.jar
COPY /target/SpringAPI-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar","/app.jar"]