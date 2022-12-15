FROM openjdk:20-ea-17-jdk
RUN useradd -ms /bin/bash jean
USER jean
WORKDIR /home/jean
COPY ./target/Reto_JeanSimon-0.0.1-SNAPSHOT.jar /appuser.jar
ENV TZ=America/Lima
CMD ["java", "-jar", "/appuser.jar"]
EXPOSE 8182