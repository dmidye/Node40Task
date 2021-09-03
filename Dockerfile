FROM gradle:5.3.0-jdk-alpine AS build_stage

WORKDIR /app

COPY build.gradle settings.gradle hello-world.yml gradle src /app/

USER root
RUN gradle build || return 0
COPY . .

FROM openjdk:8u121-jre-alpine
WORKDIR /app

COPY --from=build_stage /app/build/libs/hello-world-0.0.1-SNAPSHOT-all.jar /app/
COPY --from=build_stage /app/src/main/yml/hello-world.yml /app/

EXPOSE 8080
ENTRYPOINT exec java -jar hello-world-0.0.1-SNAPSHOT-all.jar server hello-world.yml
