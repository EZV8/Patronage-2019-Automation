package com.patronage.Pages;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class CalendarPage extends BasePage {

    private Random randomInteger = new Random();
    private int randomNumber = randomInteger.nextInt((8 - 1) + 1) + 1;
    private Calendar calendar = Calendar.getInstance();
    private Date todayDate = new Date();
    private SimpleDateFormat stringDateFormat = new SimpleDateFormat("dd MMMM yyyy", new Locale("en"));
    private SimpleDateFormat dayOfMonth = new SimpleDateFormat("dd", new Locale("en"));
    private int dayOfMonthAsInteger = Integer.parseInt(dayOfMonth.format(todayDate));

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

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ListView\")" +
            ".childSelector(new UiSelector().className(\"android.widget.TextView\").index(5))")
    public MobileElement pickedYear;

    @AndroidFindBy(id = "actionGoToToday")
    public MobileElement goToTodayButton;

    public void iSwitchToAnotherDayGlobal() {
        if (dayOfMonthAsInteger < 23) {
            calendar.setTime(todayDate);
            calendar.add(Calendar.DATE, randomNumber);
            Date randomDateFromCalendar = calendar.getTime();
            String randomDay = stringDateFormat.format(randomDateFromCalendar);
            driver.findElement(By.xpath("//android.view.View[@content-desc=\"" + randomDay + "\"]\n")).click();
        } else {
            nextMonthButton.click();
            calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR));
            calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) + 1);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            calendar.add(Calendar.DATE, randomNumber);
            Date randomDateFromCalendar = calendar.getTime();
            String randomDay = stringDateFormat.format(randomDateFromCalendar);
            driver.findElement(By.xpath("//android.view.View[@content-desc=\"" + randomDay + "\"]\n")).click();
        }
    }

    public CalendarPage(MobileDriver driver) {
        super(driver);
    }
}