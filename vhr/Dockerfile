FROM hub.c.163.com/library/java:latest
VOLUME /tmp
ADD vhrserver/vhr-web/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]