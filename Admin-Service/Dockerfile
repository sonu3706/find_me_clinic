FROM java:8-jre
WORKDIR usr/src
ADD ./target/Admin-Service-0.0.1-SNAPSHOT.jar /usr/src/Admin-Service-0.0.1-SNAPSHOT.jar
RUN chmod +x /usr/src/Admin-Service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Xmx200m", "-jar", "/usr/src/Admin-Service-0.0.1-SNAPSHOT.jar"]