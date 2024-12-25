FROM maven AS build_stage
RUN mkdir /app
WORKDIR /app
COPY . /app
RUN mvn clean package

FROM eclipse-temurin:17-jre-alpine
COPY --from=build_stage /app/target/*.jar demosvc.jar
ENTRYPOINT ["java","-jar","/demosvc.jar"]
