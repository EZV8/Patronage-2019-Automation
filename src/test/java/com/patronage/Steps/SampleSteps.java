package com.patronage.Steps;

import com.patronage.DriverFactory;
import com.patronage.Pages.SamplePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class SampleSteps extends DriverFactory {
    private SamplePage samplePage = new SamplePage(driver);

    @When("^I scroll to the left$")//Start point on the right side and scroll to the left.
    public void iScrollToTheLeft() {
        new TouchAction<>(driver).press(PointOption.point(800, 1000))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(100, 1000)).release().perform();
    }

    @Then("^I am on the next page$")//Page on the right
    public void iAmOnTheNextPage() {

    }

    @When("^I scroll to the right$")//Start point on the left side and scroll to the right
    public void iScrollToTheRight() {
        new TouchAction<>(driver).press(PointOption.point(100, 1000))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(800, 1000)).release().perform();
    }

    @Then("^I am on previous day$")//Page on the left
    public void iAmOnPreviousDay() {

    }

    @When("^I scroll down$")
    public void iScrollDown() {

    }

    @Then("^I am going to the top of screen$")
    public void iAmGoingToTheTopOfScreen() {

    }

    @When("^I scroll up$")
    public void iScrollUp() {

    }

    @Then("^I am going to the bottom of screen$")
    public void iAmGoingToTheBottomOfScreen() {

    }

    @When("^I zoom in$")
    public void iZoomIn() {

    }

    @Then("^I can see better$")
    public void iCanSeeBetter() {

    }

    @When("^I zoom out$")//Do sprawdzenia czy to dziala
    public void iZoomOut() {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.getWidth());
        int startY = (int) (size.getHeight());
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

    @Then("^I can see more$")
    public void iCanSeeMore() {
    }
}