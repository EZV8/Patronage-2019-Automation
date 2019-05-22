package com.patronage.Steps;

import com.patronage.DriverFactory;
import com.patronage.Pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends DriverFactory {
    private LoginPage loginPage = new LoginPage(driver);

    @Given("^I open application$")
    public void iOpenApplication() {
        //What should we write here?
    }

    @When("^I sign in using \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iSignInUsingAnd(String email, String password) {
        loginPage.emailBox.sendKeys(email);
        loginPage.passwordBox.sendKeys(password);
    }

    @Then("^I'm on main screen$")
    public void iMOnMainScreen() {
    }

    @Then("^I can see warning message$")
    public void iCanSeeWarningMessage() {
    }

    @When("^I sign in using only email \"([^\"]*)\"$")
    public void iSignInUsingOnlyEmail(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}