# Use a base image with JDK
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . .

# Package the application using Maven or Gradle
RUN ./gradlew build

# Expose the port the application will run on
EXPOSE 8080

# Define the command to run the application
CMD ["java", "-jar", "build/libs/factorial-cache-app.jar"]
