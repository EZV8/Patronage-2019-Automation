package com.patronage.Steps;

import com.patronage.DriverFactory;
import com.patronage.Pages.BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;

public class GlobalSteps extends DriverFactory {
    BasePage globalPage = new BasePage(driver);

    @Given("^I open application$")
    public void iOpenApplication() {
        //What should we write here?
    }

    @When("^I scroll to the left$")
    public void iScrollToTheLeft() {
        try {
            new TouchAction<>(driver).press(PointOption.point(800, 1000))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(100, 1000)).release().perform();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("^I scroll to the right$")
    public void iScrollToTheRight() {
        try {
            new TouchAction<>(driver).press(PointOption.point(100, 1000))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(800, 1000)).release().perform();
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}