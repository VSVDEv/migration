# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.3/maven-plugin/reference/html/#build-image)



## Mongo db

`docker-compose up -d`

## Run

`mvn test` -run tests

`mvn -DskipTests clean install` - install

`mvn -DskipTests clean package` - package

`mvn -DskipTests clean spring-boot:build-image` - image

`docker run -it -p 8080:8080 mongo:mongo init` - run image

`docker run -it --net=host -p 127.0.0.1:8080:8080 docker.io/library/init:0.0.1-SNAPSHOT`

### Micronaut

`mvn -DskipTests -Dpackaging=docker package` - package

`mvn -DskipTests -Dpackaging=native-image package` - package
