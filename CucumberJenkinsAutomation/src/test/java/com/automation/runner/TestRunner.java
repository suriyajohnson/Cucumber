package com.automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"com.automation.steps", "com.automation.hooks"},
    plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests {}
