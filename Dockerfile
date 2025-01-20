# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the application JAR file
COPY target/spring-demo.jar /app/spring-demo.jar

# Expose the application port
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "spring-demo.jar"]

#
#docker run -d -p 9090:8080 --name spring-demo spring-demo:1.0
#docker tag spring-demo:1.0 puneeth0/spring-demo:1.0
#docker push puneeth0/spring-demo:1.0