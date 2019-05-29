package com.patronage.Pages;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LogOutPage extends BasePage {

    @AndroidFindBy(id = "logOutButton")
    public MobileElement logOutButton;

    public LogOutPage(MobileDriver driver) {
        super(driver);
    }
}
