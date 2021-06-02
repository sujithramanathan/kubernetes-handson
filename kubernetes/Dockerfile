FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} kube-test-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/kube-test-1.0-SNAPSHOT.jar"]
