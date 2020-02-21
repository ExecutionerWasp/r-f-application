FROM openjdk:11-jdk
ADD target/server.integration-1.0-SNAPSHOT.jar .
RUN java -jar target/server.integration-1.0-SNAPSHOT.jar
CMD ["java", "-jar", "server.integration-1.0-SNAPSHOT"]
