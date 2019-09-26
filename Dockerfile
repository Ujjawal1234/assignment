FROM openjdk:8
ADD target/assignment-0.0.1-SNAPSHOT.jar assignment-0.0.1-SNAPSHOT.jar
EXPOSE 8001
ENTRYPOINT ["java","-jar","assignment-0.0.1-SNAPSHOT.jar"]