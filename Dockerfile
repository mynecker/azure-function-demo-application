FROM openjdk:14-alpine
COPY build/libs/azure-function-demo-application-*-all.jar azure-function-demo-application.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "azure-function-demo-application.jar"]