FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY /target/AppointmentService-1.0.0.jar AppointmentService-1.0.0.jar
EXPOSE 8080
CMD ["java", "-jar", "AppointmentService-1.0.0.jar"]

