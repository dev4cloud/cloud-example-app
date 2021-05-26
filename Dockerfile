FROM java:8
ENV APP_DATABASE=jsph
ENV APP_DATABASE_USER=admin
ENV APP_DATABASE_PASSWORD=53fAIydDyiXIO3SEW1ar
ENV APP_DATABASE_URL=dbaas903.hyperp-dbaas.cloud.ibm.com:29050
ADD build/libs/cloud-example-app-0.1.0.jar app.jar
ENV spring_profiles_active docker
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
