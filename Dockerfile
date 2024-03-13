FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests


FROM openjdk:21-jdk-slim
COPY --from=build /target/demo4-0.0.1-SNAPSHOT.jar group.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","group.jar"]
