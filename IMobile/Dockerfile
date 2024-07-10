FROM openjdk:17-jdk-alpine
# Use a base image suitable for your application
FROM ubuntu:latest

# Create a non-root user
RUN useradd -m -s /bin/bash myuser

# Set the working directory (optional)
WORKDIR /app

# Copy your application files (example)
COPY . /app

# Set ownership of the application directory to the non-root user
RUN chown -R myuser:myuser /app

# Switch to the non-root user
USER myuser

EXPOSE 8080
ADD target/imobile.jar imobile.jar
ENTRYPOINT [ "java", "-jar","/imobile.jar" ]