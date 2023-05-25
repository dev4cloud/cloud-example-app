FROM openjdk:11
ADD build/libs/cloud-example-app-0.2.1.jar app.jar
ENV spring_profiles_active docker
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
