package com.patronage.Pages;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage {

    @AndroidFindBy(id = "emailText")
    public MobileElement emailBox;

    @AndroidFindBy(id = "PasswdText")
    public MobileElement passwordBox;

    @AndroidFindBy(id = "signButton")
    public MobileElement signButton;

    public LoginPage(MobileDriver driver) {
        super(driver);
    }
}