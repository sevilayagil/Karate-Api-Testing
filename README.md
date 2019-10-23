# Web Service Testing With Karate
Karate ile Web Servis Testi Örneği

This sample project includes api testing with Karate

# Getting Started (Gereksinimler) :heavy_check_mark:
Karate requires Java 8 (at least version 1.8.0_112 or greater) (Java jdk 1.8 sürümü ve üzeri) 
https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html 

**Intellij**
https://www.jetbrains.com/idea/download/#section=windows (Maven, Gradle or Eclipse to be installed.)

**Cucumber Plugin**
(cucumber for java)

**Karate Github**
""https://github.com/intuit/karate""

**Dummy Demo site**
http://dummy.restapiexample.com/

# Running in IntelliJ       
If you use IntelliJ IDEA, Cucumber support is built-in, and you can even select a single Scenario within a Feature to run at a time. 
If you are using the free Community Edition, you can easily install the "Gherkin" and "Cucumber for Java" plugins.

# Maven Dependency
'karate-apache' should be add as a dependency on pom.xml so it will be installed automatically
```

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <java.version>1.8</java.version>
    <maven.compiler.version>3.6.0</maven.compiler.version>
    <karate.version>0.9.4</karate.version>
    <gatling.plugin.version>3.0.2</gatling.plugin.version>
</properties>
<dependencies>
<dependency>
    <groupId>com.intuit.karate</groupId>
    <artifactId>karate-gatling</artifactId>
    <version>${karate.version}</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>commons-io</groupId>
    <artifactId>commons-io</artifactId>
    <version>2.5</version>
</dependency>
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <version>1.4.196</version>
    <scope>runtime</scope>
</dependency>
<dependency>
    <groupId>com.github.java-json-tools</groupId>
    <artifactId>json-schema-validator</artifactId>
    <version>2.2.8</version>
</dependency>
<dependency>
    <groupId>com.intuit.karate</groupId>
    <artifactId>karate-apache</artifactId>
    <version>${karate.version}</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>com.intuit.karate</groupId>
    <artifactId>karate-testng</artifactId>
    <version>0.8.0.1</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>com.intuit.karate</groupId>
    <artifactId>karate-core</artifactId>
    <version>${karate.version}</version>
</dependency>
<dependency>
    <groupId>net.masterthought</groupId>
    <artifactId>cucumber-reporting</artifactId>
    <version>3.8.0</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>com.sun.activation</groupId>
    <artifactId>javax.activation</artifactId>
    <version>1.2.0</version>
</dependency>
<dependency>
    <groupId>org.apache.geronimo.specs</groupId>
    <artifactId>geronimo-jms_1.1_spec</artifactId>
    <version>1.1.1</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.json</groupId>
    <artifactId>json</artifactId>
    <version>20180813</version>
</dependency>

<dependency>
    <groupId>com.googlecode.json-simple</groupId>
    <artifactId>json-simple</artifactId>
    <version>1.1.1</version>
</dependency>
<dependency>
    <!-- jsoup HTML parser library @ https://jsoup.org/ -->
    <groupId>org.jsoup</groupId>
    <artifactId>jsoup</artifactId>
    <version>1.11.3</version>
</dependency>
<dependency>
    <groupId>com.intuit.karate</groupId>
    <artifactId>karate-junit4</artifactId>
    <version>0.9.0</version>
    <scope>compile</scope>
</dependency>

</dependencies>

<build>
<testResources>
    <testResource>
        <directory>src/test/java</directory>
        <excludes>
            <exclude>**/*.java</exclude>
        </excludes>
    </testResource>
</testResources>
<plugins>
    <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <configuration>
            <encoding>UTF-8</encoding>
            <compilerArgument>-Werror</compilerArgument>
        </configuration>
    </plugin>
    <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>2.10</version>
        <configuration>
            <includes>
                <include>**/*.java</include>
            </includes>
            <argLine>-Dfile.encoding=UTF-8</argLine>
        </configuration>
    </plugin>
    <plugin>
        <groupId>io.gatling</groupId>
        <artifactId>gatling-maven-plugin</artifactId>
        <version>${gatling.plugin.version}</version>
        <configuration>
            <simulationsFolder>src/test/java/scala</simulationsFolder>
            <includes>
                <include>APISimulation</include>
            </includes>
        </configuration>
    </plugin>
</plugins>
</build>

```

