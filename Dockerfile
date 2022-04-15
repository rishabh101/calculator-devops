FROM openjdk:8
COPY /var/lib/jenkins/.m2/repository/org/example/CalculatorProject/1.0-SNAPSHOT/CalculatorProject-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "calculatorDevOps-1.0-SNAPSHOT-jar-with-dependencies.jar"]
