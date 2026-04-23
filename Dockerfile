FROM maven:3.9.4-eclipse-temurin-17

WORKDIR /app


COPY infrastructure/target/infrastructure-0.0.1-SNAPSHOT.jar /app/infrastructure.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "infrastructure.jar"]