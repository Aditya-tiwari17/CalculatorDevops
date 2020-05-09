FROM java:8
WORKDIR /
ADD Calculator-1.0-SNAPSHOT.jar Calculator-1.0-SNAPSHOT.jar
CMD java -jar Calculator-1.0-SNAPSHOT.jar