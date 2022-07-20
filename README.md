# Build Spring Boot app Docker image with maven plugin [![CI](https://github.com/daggerok/spring-boot-build-image/actions/workflows/ci.yml/badge.svg)](https://github.com/daggerok/spring-boot-build-image/actions/workflows/ci.yml)

```bash
./mvnw clean ; ./mvnw package spring-boot:build-image
docker run                               daggerok/spring-boot-build-image:0.0.1-SNAPSHOT
docker run -e BPL_JAVA_NMT_LEVEL=off     daggerok/spring-boot-build-image:0.0.1-SNAPSHOT Maksimko
docker run -e BPL_JAVA_NMT_ENABLED=false daggerok/spring-boot-build-image:0.0.1-SNAPSHOT one two three
```

## Links
* https://paketo.io/docs/howto/java/#enable-java-native-memory-tracking-nmt
* https://paketo.io/docs/howto/configuration/#build-time-environment-variables
* https://docs.spring.io/spring-boot/docs/current/maven-plugin/reference/htmlsingle/#build-image
