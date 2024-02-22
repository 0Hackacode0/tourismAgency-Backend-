FROM openjdk:17-alpine
COPY target/touristAgency-Backend--0.0.1-SNAPSHOT.jar /app/touristAgencyBackend.jar
ENTRYPOINT ["java", "-jar", "/app/touristAgencyBackend.jar"]