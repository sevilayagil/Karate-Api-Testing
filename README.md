# Web Service Testing With Karate
Karate ile Web Servis Testi Örneği

This sample project includes api testing with Karate

# Getting Started (Gereksinimler)
Karate requires Java 8 (at least version 1.8.0_112 or greater) (Java jdk 1.8 sürümü ve üzeri) 
https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html 
Intellij
https://www.jetbrains.com/idea/download/#section=windows (Maven, Gradle or Eclipse to be installed.)
Cucumber Plugin
cucumber for java
Karate Github
https://github.com/intuit/karate
Dummy Demo site
http://dummy.restapiexample.com/

# Running in IntelliJ       
If you use IntelliJ IDEA, Cucumber support is built-in, and you can even select a single Scenario within a Feature to run at a time. 
If you are using the free Community Edition, you can easily install the "Gherkin" and "Cucumber for Java" plugins.

# Maven Dependency
'karate-apache' should be add as a dependency on pom.xml so it will be installed automatically
  <dependencies>
    <dependency>
        <groupId>com.intuit.karate</groupId>
        <artifactId>karate-apache</artifactId>
        <version>0.6.0</version>
    </dependency>
    <dependency>
        <groupId>com.intuit.karate</groupId>
        <artifactId>karate-junit4</artifactId>
        <version>0.6.0</version>
    </dependency>
    <dependency>
        <groupId>net.masterthought</groupId>
        <artifactId>cucumber-reporting</artifactId>
        <version>4.3.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.0.0-beta3</version>
        <scope>test</scope>
    </dependency>
</dependencies>

