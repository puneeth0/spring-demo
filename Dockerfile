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
#docker pull puneeth0/spring-demo
#docker run
#docker build -t spring-demo:1.0 .

# minikube start
# minikube docker-env
# minikube start --driver=docker
# minikube status
# kubectl cluster-info
# kubectl get node
# @FOR /f "tokens=*" %i IN ('minikube -p minikube docker-env --shell cmd') DO @%i
# docker images
# docker build -t spring-demo:1.0 .
# kubectl create deployment spring-demo --image=spring-demo:1.0 --port=8080
# kubectl get deployment
# kubectl describe deployment spring-demo
# kubectl get pods
# kubectl logs pod-name
# kubectl get deployments
# kubectl expose deployment spring-demo --type=NodePort
# kubectl get service
# minikube service spring-demo --url
# http://127.0.0.1:65137/potter/characters
# minikube dashboard
# kubectl delete service spring-demo
# kubectl delete deployment spring-demo
# minikube stop
# minikube delete
# eval $(minikube docker-env)