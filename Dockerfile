FROM java:8
ADD build/libs/cloud-example-app-0.1.0.jar app.jar
ENV spring_profiles_active docker
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
