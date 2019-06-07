FROM openjdk:8-jre-alpine
COPY ./target/petclinic.jar .
ENTRYPOINT ["java","-jar","petclinic.jar"]