FROM openjdk:latest
ADD target/docker-start.jar docker-start.jar
EXPOSE 8085
ENTRYPOINT["java","-jar","/docker-start.jar"]