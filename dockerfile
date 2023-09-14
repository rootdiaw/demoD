# Première étape : Compiler le projet Spring Boot

FROM maven as build
COPY src /app/src
COPY pom.xml /app
RUN mvn -f /app/pom.xml clean package -DskipTests

# Deuxième étape : Créer une image en copiant seulement l'artefact JAR généré dans la première étape

FROM openjdk
COPY --from=build /app/target/*.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]