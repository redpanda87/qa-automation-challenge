
# QA Automation Challenge

This is project was written in Java, using Serenity BDD and cucumber

## Requirements
* Java 1.8
* Maven
* InteliJ o Similar IDE
* Install cucumber plugins




## Understanding the code

The project is composed of the following parts

* API Tests -> Contains the API tests, the test was created using rest-assured and Junit
* Pages -> Contains all the page model elements and their corresponding methods
* Steps -> Contains the reusable step methods
* StepsDefinitions -> It is the implementation of the cucumber scenarios
* Resources -> Here you can find the feature folder which contains the .feature files (cucumber)





## How to execute the tests?

#### API Tests (Swagger)
* Open the project ->src/test/java/challenge/APITests
* Execute the Junit Test using the IDE

#### Automation Tests(Site)
* Using maven execute the following command: mvn clean verify serenity: aggregate
* It is important to add the option serenity aggregate because that command creates the report


## How to see the tests report ?
* After execute the maven command go to target/site/index.html
* Here you can see a detail report of each test, and its results(passed or failed) and even a screenshot for every step.

## How to execute the test in parallel ?

* Serenity provides a way to execute several test in parallel in the pom.xml file you can see this
* <parallel.tests>4</parallel.tests> it will run 4 parallel threads per processor core

## How to run test in different browsers/OS ?

* On resources folder you can find all the supported webdrivers for OS (Linux,Mac,Windows)
* In case you want to execute a different browser , you just need to change the serenity.conf file

## How to run different environments(Urls)?

* Go to serenity.conf file on the resources folder, the go to the environments section, there you can change or add more URL ENV


