FROM openjdk:8-jre-alpine
COPY build/libs/isoservice-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT ["java","-jar","/isoservice-0.0.1-SNAPSHOT.jar"]