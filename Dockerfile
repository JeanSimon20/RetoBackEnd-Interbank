FROM openjdk:17
COPY ./target/Reto_JeanSimon-0.0.1-SNAPSHOT.jar /appuser.jar
CMD ["java", "-jar", "/appuser.jar"]
EXPOSE 8182