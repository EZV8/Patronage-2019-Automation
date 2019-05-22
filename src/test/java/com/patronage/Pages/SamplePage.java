package com.patronage.Pages;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SamplePage extends BasePage {

    @AndroidFindBy(id = "weekView")
    public MobileElement weekView;//Biale pole z godzinami i kreska przy aktualnym czasie

    public SamplePage(MobileDriver driver) {
        super(driver);
    }
}