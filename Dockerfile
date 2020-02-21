FROM adoptopenjdk:11-jre-hotspot

COPY target/app.jar app.jar

ENV APP_OPTIONS "-Xms64m -Xmx128m"

ENTRYPOINT exec java $APP_OPTIONS -jar /app.jar