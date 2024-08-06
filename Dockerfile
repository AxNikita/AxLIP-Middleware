FROM openjdk:22-jdk-slim

WORKDIR /app

COPY target/ax-lip-middleware.jar .

ENTRYPOINT ["java", "-jar", "ax-lip-middleware.jar"]

EXPOSE 9997