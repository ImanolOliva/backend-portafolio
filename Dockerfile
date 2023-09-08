FROM amazoncorretto:17
MAINTAINER imanol
COPY target/portafolo-0.0.1-SNAPSHOT.jar back-app.jar
ENTRYPOINT ["java","-jar","/back-app.jar"]

