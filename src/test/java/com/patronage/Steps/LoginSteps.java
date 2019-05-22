package com.patronage.Steps;

import com.patronage.DriverFactory;
import com.patronage.Pages.LoginPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends DriverFactory {
    private LoginPage loginPage = new LoginPage(driver);

    @When("^I sign in using \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iSignInUsingAnd(String email, String password) {
        //loginPage.emailBox.sendKeys(email);
        //loginPage.passwordBox.sendKeys(password);
    }

    @When("^I sign in using only email \"([^\"]*)\"$")
    public void iSignInUsingOnlyEmail(String email) {
        //loginPage.emailBox.sendKeys(email);
    }

    @When("^I sign in using only password \"([^\"]*)\"$")
    public void iSignInUsingOnlyPassword(String password) {
        //loginPage.passwordBox.sendKeys(password);
    }

    @When("^I sign in without data$")
    public void iSignInWithoutData() {
        //loginPage.signButton.click();
    }

    @Then("^I'm on main screen$")
    public void iMOnMainScreen() {
        try {
        } catch (Throwable t) {
        }
    }

    @Then("^I can see warning message$")
    public void iCanSeeWarningMessage() {
        try {
        } catch (Throwable t) {
        }
    }
}
