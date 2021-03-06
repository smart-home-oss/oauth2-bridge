FROM adoptopenjdk:11-jre-hotspot

COPY target/app.jar app.jar

ENV APP_OPTIONS "-Xms32m -Xmx64m"

ENTRYPOINT exec java $APP_OPTIONS -jar /app.jar