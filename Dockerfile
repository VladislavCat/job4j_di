FROM maven:3.6.3-openjdk-17

RUN mkdir job4j_di

WORKDIR job4j_di

COPY . .

RUN mvn spring-boot:run install

CMD ["java", "-jar", "target/diJar.jar"]