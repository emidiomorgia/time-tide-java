# Stage 1: Build stage
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app

# Copia solo il file POM per scaricare le dipendenze
COPY pom.xml .
RUN mvn dependency:go-offline

# Copia i file sorgenti e compila l'applicazione
COPY src src
RUN mvn package -DskipTests

# Stage 2: Run stage
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copia solo il file JAR compilato dallo stage di build
COPY --from=build /app/target/time-tide-java-bff-0.0.1-SNAPSHOT.jar /app/app.jar

# Esponi la porta 8080
EXPOSE 8080

# Comando per avviare l'applicazione quando il container viene avviato
CMD ["java", "-jar", "app.jar"]