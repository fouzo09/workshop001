FROM openjdk:17-jdk-slim-buster

WORKDIR /app

COPY target/worshop001-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8085

CMD ["java", "-jar", "app.jar"]
