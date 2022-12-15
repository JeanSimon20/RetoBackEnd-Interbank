FROM openjdk:8-jre-alpine
COPY ./target/retointerbank-0.0.1-SNAPSHOT.jar /appuser.jar
CMD ["java", "-jar", "/appuser.jar"]
ENV TZ=America/Lima
EXPOSE 8182