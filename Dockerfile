FROM maven:3.6.3-openjdk-8 AS build

WORKDIR /code

COPY pom.xml /code/pom.xml
#RUN ["mvn", "dependency:resolve"]
#RUN ["mvn", "verify"]

# Adding source, compile and package into a fat jar
COPY ["src/main", "/code/src/main"]
RUN ["mvn", "package"]

FROM openjdk:8-jre-alpine

ARG JAR_FILE=/code/target/*.jar

COPY --from=build ${JAR_FILE} app.jar

##COPY --from=build /code/target/*.jar /


CMD ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-jar", "/app.jar"]
