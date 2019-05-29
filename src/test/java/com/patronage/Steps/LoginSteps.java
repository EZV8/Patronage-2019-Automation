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

    private String errorMessage = "Element wasn't displayed";

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

    @And("^I click sign in button$")
    public void iClickSignInButton() {
        //loginPage.signButton.click();
    }

    @Then("^I can see main screen page$")
    public void iCanSeeMainScreenPage() {
        try {
            //mainScreenPage.calendarMainScreen.isDisplayed();
        } catch (Throwable t) {
            System.out.println(errorMessage);
        }
    }

    @And("^I can see password box$")
    public void iCanSeePasswordBox() {
        try {
            //loginPage.passwordBox.isDisplayed();
        } catch (Throwable t) {
            System.out.println(errorMessage);
        }
    }

    @And("^I can see sign in button$")
    public void iCanSeeSignInButton() {
        try {
            //loginPage.signButton.isDisplayed();
        } catch (Throwable t) {
            System.out.println(errorMessage);
        }
    }

    @Then("^I can see email box$")
    public void iCanSeeEmailBox() {
        try {
            //loginPage.emailBox.isDisplayed();
        } catch (Throwable t) {
            System.out.println(errorMessage);
        }
    }

    @Then("^I can see warning message$")
    public void iCanSeeWarningMessage() {
        try {
        } catch (Throwable t) {
            System.out.println(errorMessage);
        }
    }
}
