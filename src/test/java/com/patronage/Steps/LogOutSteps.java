package com.patronage.Steps;

import com.patronage.DriverFactory;
import com.patronage.Pages.LogOutPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogOutSteps extends DriverFactory {

    private LogOutPage logOutPage = new LogOutPage(driver);

    @When("^I click sign out button$")
    public void iClickSignOutButton() {
        logOutPage.logOutButton.click();
    }

    @Then("^I can see message about successful logout$")
    public void iCanSeeMessageAboutSuccessfulLogout() {
        logOutPage.warningMessage.isDisplayed();
    }
}

