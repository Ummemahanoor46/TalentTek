# TalentTek
TALENTTEK PROJECT: TEST
Java, Cucumber, TestNG, JVM, Git etc

# Project owner
UMME MAHANOOR 

# To fix code
CTL+A
CTL+ALT+L

# Pre condition
IntelliJ IDE - to write code (community edition)
We need java at least 17 or above
we need Maven to compile test (run our test)
we Git account - to store code

# Dependencies
cucumber-testng
cucumber-java
selenium-java
javafaker

# Plugins in IntelliJ
Cucumber for Java
Gherkin

# RUN OPTIONS
Clone the project
To run in parallel use command: mvn verify -Denv=qa -Dbrowser=ch -Dcucumber.filter.tags=@smoke  
or mvn verify -Denv=qa -Dbrowser=ch -D"cucumber.filter.tags=@regression" 

To run in single use flag -Dthreads=single; mvn clean verify -Dthreads=single
To exclude a specific tag use 'not' with tag name i.e. mvn clean verify -Denv=qa -Dbrowser=chrome -Dcucumber.filter.tags="not @ignore"
To post results to JIRA use flag -DPostResultsToJira=true

# FW Goal
FW should be comfortable running into different env such as QA/STAGE/PROD ECT
FW should be able to run in different browsers Firefox, Chrome
If test fail, then capture log and screenshot
Function should be reusable - less duplicate