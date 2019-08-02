package com.patronage.Pages;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LogInPage extends BasePage {

    @AndroidFindBy(id = "i0116")
    public MobileElement emailBox;

    @AndroidFindBy(id = "i0118")
    public MobileElement passwordBox;

    @AndroidFindBy(xpath = "//android.webkit.WebView[@content-desc=\"Sign in to your account\"]/android.view.View/android.view.View[2]/android.view.View[5]\n")
    public MobileElement signButton;

    @AndroidFindBy(id = "idSIButton9")
    public MobileElement nextButton;

    //It is like that cause application didn't work properly and there was no more time to fix it
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Sign in with beth.smith@patronage.onmicrosoft.com work or school account. Pick an account \"]\n")
    public MobileElement bethSmith;

    @AndroidFindBy (id = "i0281")
    public MobileElement loginScreen;

    public LogInPage(MobileDriver driver) {
        super(driver);
    }
}