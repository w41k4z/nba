# Use a base image with OpenJDK 11
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY /app/target/nba-0.0.1-SNAPSHOT.jar /app/nba-0.0.1-SNAPSHOT.jar

# Expose the port the app runs on
EXPOSE 8080

# Specify the command to run on container start
CMD ["java", "-jar", "/app/nba-0.0.1-SNAPSHOT.jar"]
 