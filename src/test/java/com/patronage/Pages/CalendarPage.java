package com.patronage.Pages;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CalendarPage extends BasePage {

    @AndroidFindBy(id = "dateView")
    public MobileElement todayDateBar;

    @AndroidFindBy(id = "weekView")
    public MobileElement calendarMainScreen;

    @AndroidFindBy(id = "month_view")
    public MobileElement calendarViewComponent;

    @AndroidFindBy(id = "next")
    public MobileElement nextMonthButton;

    @AndroidFindBy(id = "prev")
    public MobileElement previousMonthButton;

    @AndroidFindBy(id = "button1")
    public MobileElement okButton;

    @AndroidFindBy(id = "button2")
    public MobileElement cancelButton;

    @AndroidFindBy(id = "date_picker_header_year")
    public MobileElement yearButtonPicker;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.ScrollView/android.widget.ViewAnimator/android.widget.ListView/android.widget.TextView[6]\n")
    public MobileElement pickedYear;//Test tego elementu do przemyslenia. Mozna uzyc tej funkcji do randomowania pozniej.

    @AndroidFindBy(id = "actionGoToToday")
    public MobileElement goToTodayButton;

    public CalendarPage(MobileDriver driver) {
        super(driver);
    }
}