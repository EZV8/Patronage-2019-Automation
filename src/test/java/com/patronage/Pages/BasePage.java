package com.patronage.Pages;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    private static MobileDriver driver;

    public BasePage(MobileDriver driver) {
        BasePage.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
