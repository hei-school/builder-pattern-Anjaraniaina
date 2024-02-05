# Builder Pattern
This is an implementation of the builder design pattern for learning purpose.

## Requirements
* [maven](https://maven.apache.org/guides/getting-started/)
* [java](https://www.oracle.com/java/technologies/downloads/)

## Setup & Run
From the root directory run:  
```mvn clean install```  
If you want to run tests:  
```mvn test```

## Lint & Formatting
Linting is done with java checkstyle. The checkstyle configuration file is [here](./config/checkstyle/google_checks.xml).  
Checkstyle is run automatically when building with Maven. You can also validate:  
```mvn validate```

## Continuous Integration
At each push and pull-request, the ci will be run by Github Actions.  
For instance, it runs tests then build. Check actions [here](https://github.com/hei-school/builder-pattern-Anjaraniaina/actions).