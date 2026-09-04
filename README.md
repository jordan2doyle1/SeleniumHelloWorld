# SeleniumHelloWorld

A basic Selenium WebDriver project that launches a Chrome browser, navigates to a page, and closes.

## Prerequisites

- Java 21+
- Maven
- Google Chrome

## Build

```sh
mvn clean package
```

## Run

```sh
mvn exec:java -Dexec.mainClass="org.example.Main"
```

Or run the JAR:

```sh
java -jar target/SeleniumHelloWorld-1.0-SNAPSHOT-jar-with-dependencies.jar
```

## Project Structure

```
src/main/java/org/example/Main.java   # Entry point
pom.xml                               # Maven configuration
```
