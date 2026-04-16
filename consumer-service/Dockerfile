# consumer-service/Dockerfile
FROM eclipse-temurin:17-jdk-jammy
ARG JAR_FILE=target/*.jar
WORKDIR /app
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
