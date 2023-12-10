FROM openjdk:17-alpine
PRODUCT guest
ADD boot/target/product-service.jar product-service.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "product-service.jar"]