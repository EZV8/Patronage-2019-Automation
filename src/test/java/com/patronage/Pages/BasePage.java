package com.patronage.Pages;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BasePage {

    public static MobileDriver driver;

    public BasePage(MobileDriver driver) {
        BasePage.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void scroll(int startX, int startY, int endX, int endY) {
        try {
            new TouchAction<>(driver).press(PointOption.point(startX, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(endX, endY)).release().perform();
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}