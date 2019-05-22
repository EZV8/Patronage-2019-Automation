package com.patronage.Steps;

import com.patronage.DriverFactory;
import com.patronage.Pages.MainScreenPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

public class MainScreenSteps extends DriverFactory {
    private MainScreenPage mainScreenPage = new MainScreenPage(driver);

    @When("^I scroll view$")
    public void iScrollView() {
        Dimension size = mainScreenPage.weekView.getSize();
        int startY = (int) (size.height * 0.3);
        int startX = size.width / 2;
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(startX, startY));
        action.moveTo(PointOption.point(startX, 10));
        action.release().perform();
        action.press(PointOption.point(startX, startY));
        action.moveTo(PointOption.point(startX, size.height - 100));
        action.release().perform();
    }

    @Then("^I can see that date has changed$")
    public void iCanSeeThatDateHasChanged() {
        //Nothing to do here at least for now... Assertion needed
    }

    @When("^I click next day button$")
    public void iClickNextDayButton() {
        mainScreenPage.nextDayButton.click();
    }

    @Then("^I can see next day$")
    public void iCanSeeNextDay() {
        //Nothing to do here at least for now... Assertion needed
    }

    @When("^I click previous day button$")
    public void iClickPreviousDayButton() {
        mainScreenPage.previousDayButton.click();
    }

    @Then("^I can see previous day$")
    public void iCanSeePreviousDay() {
        //Nothing to do here at least for now... Assertion needed
    }

    @When("^I zoom out screen$")
    public void iZoomOutScreen() {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.getWidth());
        int startY = (int) (size.getHeight());
        System.out.println(startY + "" + startX);//Po co to komu?
        TouchAction action = new TouchAction(driver);
        TouchAction action2 = new TouchAction(driver);
        MultiTouchAction multiTouchAction = new MultiTouchAction(driver);
        action.press(PointOption.point(100, startY - 100));
        action2.press(PointOption.point(100, 500));
        action2.moveTo(PointOption.point(100, 900));
        action.moveTo(PointOption.point(100, startY / 2));
        action.release();
        action2.release();
        multiTouchAction.add(action).add(action2).perform();
    }

    @Then("^I am able to see full hours view list$")
    public void iAmAbleToSeeFullHoursViewList() {
        //Nothing to do here at least for now... Assertion needed
    }
}