# Cucumber Jenkins Automation

Java 21 + Selenium + Cucumber BDD + TestNG + Maven sample login tests.

## Requirements
Java 21, Maven 3.9+, Google Chrome, internet access (for demo website and Selenium Manager).

## Run
`mvn clean test`

Headless (useful for Jenkins):
`mvn clean test -Dheadless=true`

Smoke tests only:
`mvn clean test -Dcucumber.filter.tags=@smoke`

## Reports
`target/cucumber-report.html`, `target/cucumber.json`, `target/surefire-reports/`.

## Eclipse
File > Import > Maven > Existing Maven Projects; select this directory; right-click project > Maven > Update Project. Run `TestRunner.java` as TestNG Test, or run Maven build with goals `clean test`.
