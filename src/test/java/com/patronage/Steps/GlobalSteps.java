package com.patronage.Steps;

import com.patronage.DriverFactory;
import com.patronage.Pages.BasePage;

public class GlobalSteps extends DriverFactory {
    BasePage basePage = new BasePage(driver);
}