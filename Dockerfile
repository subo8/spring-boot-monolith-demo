FROM openjdk:17
COPY /target/mini-project-1-0.0.1-SNAPSHOT.jar mini-project-1-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","mini-project-1-0.0.1-SNAPSHOT.jar"]