FROM alpine/git as clone
WORKDIR /app
RUN git clone 'https://github.com/SM43/spring-app.git'

FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY --from=clone /app/spring-app /app
RUN mvn install

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/target/Spring-JPA-PostgreSQL-0.0.1-SNAPSHOT.jar /app
CMD ["java -jar Spring-JPA-PostgreSQL-0.0.1-SNAPSHOT.jar"]
