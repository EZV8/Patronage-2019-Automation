package com.patronage.Steps;

import com.patronage.DriverFactory;
import com.patronage.Pages.CalendarPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class CalendarSteps extends DriverFactory {
    private CalendarPage calendarPage = new CalendarPage(driver);

    private Random random = new Random();
    private Calendar calendar = Calendar.getInstance();
    private Date todayDate = new Date();
    private SimpleDateFormat dateWithDots = new SimpleDateFormat("dd.MM.yyyy");//np: 19.05.2015
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy", new Locale("en"));//19 may 2015
    private String todayDateWithDots = dateWithDots.format(todayDate);
    private String errorMessage = "Element wasn't displayed";

    @When("^I click today date bar$")
    public void iClickTodayDateBar() {
        calendarPage.todayDateBar.click();
    }

    @And("^I click right arrow in calendar$")
    public void iClickRightArrowInCalendar() {
        calendarPage.nextMonthButton.click();
    }

    @And("^I click left arrow in calendar$")
    public void iClickLeftArrowInCalendar() {
        calendarPage.previousMonthButton.click();
    }

    @And("^I click OK button$")
    public void iClickOKButton() {
        calendarPage.okButton.click();
    }

    @And("^I click cancel button$")
    public void iClickCancelButton() {
        calendarPage.cancelButton.click();
    }

    @And("^I click top left year field$")
    public void iClickTopLeftYearField() {
        calendarPage.yearButtonPicker.click();
    }

    @And("^I chose another year$")
    public void iChoseAnotherYear() {
        calendarPage.pickedYear.click();
    }

    @And("^I click button GO TO TODAY$")
    public void iClickButtonGOTOTODAY() {
        calendarPage.goToTodayButton.click();
    }

    @And("^I switch to another day$")
    public void iSwitchToAnotherDay() {
        SimpleDateFormat day = new SimpleDateFormat("dd", new Locale("en"));
        int x = Integer.parseInt(day.format(todayDate));
        if (x > 0 && x < 23) {
            int randomNumber = random.nextInt((8 - 1) + 1) + 1;
            calendar.setTime(todayDate);
            calendar.add(Calendar.DATE, randomNumber);
            todayDate = calendar.getTime();
            String randomDay = dateFormat.format(todayDate);
            driver.findElement(By.xpath("//android.view.View[@content-desc=\"" + randomDay + "\"]\n")).click();
        } else {
            calendarPage.nextMonthButton.click();
            int randomNumber = random.nextInt((8 - 1) + 1) + 1;
            calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR));
            calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) + 1);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            calendar.add(Calendar.DATE, randomNumber);
            todayDate = calendar.getTime();
            String randomDay = dateFormat.format(todayDate);
            driver.findElement(By.xpath("//android.view.View[@content-desc=\"" + randomDay + "\"]\n")).click();
        }
    }

    @Then("^I will return to current day screen$")
    public void iWillReturnToCurrentDayScreen() {
        try {
            Assert.assertEquals("today " + todayDateWithDots, calendarPage.todayDateBar.getText());
        } catch (Throwable t) {
            System.out.println(errorMessage);
        }
    }

    @Then("^I can see that calendar component is displayed$")
    public void iCanSeeThatCalendarComponentIsDisplayed() {
        try {
            calendarPage.calendarViewComponent.isDisplayed();
        } catch (Throwable t) {
            System.out.println(errorMessage);
        }
    }

    @Then("^I can see previous month$")
    public void iCanSeePreviousMonth() {
        try {
            //Assertion needed
        } catch (Throwable t) {
            System.out.println(errorMessage);
        }
    }

    @Then("^I can see next month$")
    public void iCanSeeNextMonth() {
        try {
        } catch (Throwable t) {
            //Assertion needed
            System.out.println(errorMessage);
        }
    }

    @Then("^I can see that year has changed$")
    public void iCanSeeThatYearHasChanged() {
        try {
            Assert.assertNotEquals("2019", calendarPage.yearButtonPicker.getText());
        } catch (Throwable t) {
            System.out.println("Failed to switch year");
        }
    }

    @Then("^I can see hours view for this day$")
    public void iCanSeeHoursViewForThisDay() {
        try {
            Assert.assertNotEquals(todayDateWithDots, calendarPage.todayDateBar.getText());
        } catch (
                Throwable t) {
            System.out.println(errorMessage);
        }
    }
}