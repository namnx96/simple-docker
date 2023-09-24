#FROM maven:3.8.2-eclipse-temurin-17
#
#WORKDIR /simple-app
#COPY . .
#RUN mvn clean install
#
#CMD mvn spring-boot:run

FROM eclipse-temurin:17-jdk
MAINTAINER namnx

WORKDIR /simple-app

COPY target/*.jar simple-1.0.0.jar
ENTRYPOINT ["java","-jar","simple-1.0.0.jar"]
