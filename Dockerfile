FROM java:8-jdk-alpine

COPY ./target/Spring-JPA-PostgreSQL-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch Spring-JPA-PostgreSQL-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","Spring-JPA-PostgreSQL-0.0.1-SNAPSHOT.jar"]
