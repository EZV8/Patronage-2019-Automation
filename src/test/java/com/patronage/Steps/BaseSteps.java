package com.patronage.Steps;

import com.patronage.DriverFactory;
import com.patronage.Pages.BasePage;
import cucumber.api.java.en.Given;

public class BaseSteps extends DriverFactory {

    BasePage basePage = new BasePage(driver);

    @Given("^I open application$")
    public void iOpenApplication() { }
}
