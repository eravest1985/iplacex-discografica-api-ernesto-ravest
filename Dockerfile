FROM gradle:9.7.1-jdk21 AS build

WORKDIR /home/gradle/project

COPY --chown=gradle:gradle . .

RUN gradle clean build -x test


FROM eclipse-temurin:21-jdk-jammy

WORKDIR /app

COPY --from=build /home/gradle/project/build/libs/discografia-1.war app.war

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.war"]