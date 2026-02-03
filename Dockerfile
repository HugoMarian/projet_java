FROM dockerfile/java:oracle-java21

VOLUME /tmp
ADD Application.jar /opt/Application/
EXPOSE 8080
WORKDIR /opt/Application/
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xms512m", "-Xmx1g", "-jar", "Application.jar"]