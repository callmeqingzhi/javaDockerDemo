FROM ibmjava:jre
RUN mkdir /opt/app
COPY demo.jar /opt/app
CMD ["java", "-jar", "/opt/app/demo.jar"]

