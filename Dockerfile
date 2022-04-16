FROM openjdk:8
COPY ./target/CalculatorProject-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "CalculatorProject-1.0-SNAPSHOT.jar"]
