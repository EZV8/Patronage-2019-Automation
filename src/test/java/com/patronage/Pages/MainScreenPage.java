package com.patronage.Pages;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MainScreenPage extends BasePage {

    @AndroidFindBy(id = "weekView")
    public MobileElement weekView;

    @AndroidFindBy(id = "next_button")
    public MobileElement nextDayButton;

    @AndroidFindBy(id = "previous_button")
    public MobileElement previousDayButton;

    @AndroidFindBy(id = "dateView")
    public MobileElement todayDateBar;

    @AndroidFindBy(accessibility = "More options")
    public MobileElement optionsButton;

    @AndroidFindBy(id = "toolbar")
    public MobileElement toolBar;

    public MainScreenPage(MobileDriver driver) {
        super(driver);
    }
}