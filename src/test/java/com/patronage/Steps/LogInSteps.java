package com.patronage.Steps;

import com.patronage.DriverFactory;
import com.patronage.Pages.LogInPage;
import com.patronage.Pages.MainScreenPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInSteps extends DriverFactory {
    private LogInPage loginPage = new LogInPage(driver);
    private MainScreenPage mainScreenPage = new MainScreenPage(driver);

    @When("^I sign in using \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iSignInUsingAnd(String email, String password) {
        loginPage.emailBox.sendKeys(email);
        loginPage.passwordBox.sendKeys(password);
    }

    @When("^I sign in using only email \"([^\"]*)\"$")
    public void iSignInUsingOnlyEmail(String email) {
        loginPage.emailBox.sendKeys(email);
    }

    @When("^I sign in using only password \"([^\"]*)\"$")
    public void iSignInUsingOnlyPassword(String password) {
        loginPage.passwordBox.sendKeys(password);
    }

    @When("^I sign in without data$")
    public void iSignInWithoutData() {
        loginPage.signButton.click();
    }

    @And("^I click sign in button$")
    public void iClickSignInButton() {
        loginPage.signButton.click();
    }

    @Then("^I can see main screen page$")
    public void iCanSeeMainScreenPage() {
        mainScreenPage.calendarMainScreen.isDisplayed();
    }

    @And("^I can see password box$")
    public void iCanSeePasswordBox() {
        loginPage.passwordBox.isDisplayed();
    }

    @And("^I can see sign in button$")
    public void iCanSeeSignInButton() {
        loginPage.signButton.isDisplayed();
    }

    @Then("^I can see email box$")
    public void iCanSeeEmailBox() {
        loginPage.emailBox.isDisplayed();
    }

    @Then("^I can see warning message$")
    public void iCanSeeWarningMessage() {
    }
}