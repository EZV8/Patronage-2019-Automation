package com.patronage.Steps;

import com.patronage.DriverFactory;
import com.patronage.Pages.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GlobalSteps extends DriverFactory {
    private BasePage basePage = new BasePage(driver);

    @Given("^I open application$")
    public void iOpenApplication() {
        //What should we write here?
    }

    @When("^I scroll to the left$")
    public void iScrollToTheLeft() {
        int startX = 800;
        int startY = 1000;
        int endX = 100;
        int endY = 1000;
        basePage.scroll(startX, startY, endX, endY);
    }

    @When("^I scroll to the right$")
    public void iScrollToTheRight() {
        int startX = 100;
        int startY = 1000;
        int endX = 800;
        int endY = 1000;
        basePage.scroll(startX, startY, endX, endY);
    }

    @And("^I close application$")
    public void iCloseApplication() {
        driver.closeApp();
    }

    @And("^I return to application again$")
    public void iReturnToApplicationAgain() {
        driver.launchApp();
    }
}