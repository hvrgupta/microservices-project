# Start with base image containing java runtime
FROM openjdk:21-jdk-slim
# maintainer who maintains the image
MAINTAINER harsh-gupta
# Add the application jar to the image
COPY target/account-microservice-0.0.1-SNAPSHOT.jar account-microservice-0.0.1-SNAPSHOT.jar
# execute the application
ENTRYPOINT ["java","-jar","account-microservice-0.0.1-SNAPSHOT.jar"]

