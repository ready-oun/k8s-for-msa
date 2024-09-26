FROM openjdk:17-jdk-alpine AS builder

COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src src

RUN rm src/main/resources/
RUN mv src/main/resources/bootstrap-docker.yaml src/main/resources/
RUN chmod +x ./gradlew
RUN dos2unix ./gradlew
RUN ./gradlew bootJar

FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY --from=builder build/libs/*.jar /app/app.jar

EXPOSE 8090

ENTRYPOINT ["java", "-jar", "app.jar"]