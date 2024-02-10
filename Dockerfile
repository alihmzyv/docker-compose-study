FROM eclipse-temurin:17
COPY build/libs/docker-compose-study-0.0.1-SNAPSHOT.jar /app/docker-compose-study-0.0.1-SNAPSHOT.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "docker-compose-study-0.0.1-SNAPSHOT.jar"]