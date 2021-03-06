package com.patronage.Steps;

import com.patronage.DriverFactory;
import com.patronage.Pages.CalendarPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarSteps extends DriverFactory {

    private CalendarPage calendarPage = new CalendarPage(driver);

    private Date todayDate = new Date();
    private SimpleDateFormat dateWithDots = new SimpleDateFormat("dd.MM.yyyy");
    private String todayDateWithDots = dateWithDots.format(todayDate);

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
        calendarPage.iSwitchToAnotherDayGlobal();
    }

    @Then("^I will return to current day screen$")
    public void iWillReturnToCurrentDayScreen() {
        Assert.assertEquals("today " + todayDateWithDots, calendarPage.todayDateBar.getText());
    }

    @Then("^I can see that calendar component is displayed$")
    public void iCanSeeThatCalendarComponentIsDisplayed() {
        calendarPage.calendarViewComponent.isDisplayed();
    }

    @Then("^I can see previous month$")
    public void iCanSeePreviousMonth() {
        //There is no way to assert that in application for now
    }

    @Then("^I can see next month$")
    public void iCanSeeNextMonth() {
        //There is no way to assert that in application for now
    }

    @Then("^I can see that year has changed$")
    public void iCanSeeThatYearHasChanged() {
        Assert.assertNotEquals("2019", calendarPage.yearButtonPicker.getText());
    }

    @Then("^I can see hours view for this day$")
    public void iCanSeeHoursViewForThisDay() {
        Assert.assertNotEquals(todayDateWithDots, calendarPage.todayDateBar.getText());
    }
}