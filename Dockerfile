FROM eclipse-temurin:21-jre-ubi9-minimal

WORKDIR /app

COPY ./target/demo-cicd-1.0.0.jar .

EXPOSE 8080

CMD java \
    $JAVA_OPTS \
    -jar demo-cicd-1.0.0.jar
