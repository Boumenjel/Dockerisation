FROM openjdk:8
EXPOSE 8084
ADD target/jenkinsapp-0.0.1-SNAPSHOT.jar /jenkinsapp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/jenkinsapp-0.0.1-SNAPSHOT.jar"]