# Start with a base image containing Java runtime
FROM openjdk:11-slim as build

# Metadata, information about who maintains this image
MAINTAINER aht.com

# Add the application's jar to the container
COPY target/account-0.0.1-SNAPSHOT.jar account-0.0.1-SNAPSHOT.jar

# Exceute the application
ENTRYPOINT ["java", "-jar", "account-0.0.1-SNAPSHOT.jar"]