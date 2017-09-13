FROM java:8
VOLUME /tmp
RUN mkdir -p /conf
COPY application.properties /conf/application.properties
ADD target/chrisbolton_service-1.0.0.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar","--spring.config.location=file:/conf/application.properties"]