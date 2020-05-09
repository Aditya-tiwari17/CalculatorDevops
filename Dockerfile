FROM openjdk:8
ADD target/SimpleCalculator-0.0.1-SNAPSHOT.jar SimpleCalculator-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/SimpleCalculator-0.0.1-SNAPSHOT.jar"]
