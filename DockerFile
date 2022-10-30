FROM openjdk:17
ADD ./target/news-api-0.0.1-SNAPSHOT.jar /usr/src/news-api-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
EXPOSE 8080
ENTRYPOINT ["java","-jar", "news-api-0.0.1-SNAPSHOT.jar"]