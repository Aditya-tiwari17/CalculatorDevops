FROM openjdk:8
ADD target/Calculator-1.0-SNAPSHOT.jar Calculator-1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/Calculator-1.0-SNAPSHOT.jar"]
