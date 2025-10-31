# Step 1: Base image
FROM openjdk:21-jdk-slim

# Step 2: JAR file को container में copy करो
COPY target/app-0.0.1-SNAPSHOT.jar app.jar

# Step 3: Application run करने का command
ENTRYPOINT ["java", "-jar", "app.jar"]
