package com.patronage;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//Provided by team leader
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        format = {"json:target/reports/cucumber.json"}
)
public class TestRunner {
}