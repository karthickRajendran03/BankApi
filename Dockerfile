FROM java:8
MAINTAINER javaonfly
COPY /target/spring-security-auth-server-0.0.1-SNAPSHOT.jar spring-security-auth-server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "spring-security-auth-server-0.0.1-SNAPSHOT.jar"]
EXPOSE 8083