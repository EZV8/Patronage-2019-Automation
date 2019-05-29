package com.patronage.Steps;

import com.patronage.DriverFactory;
import com.patronage.Pages.MainScreenPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainScreenSteps extends DriverFactory {
    private MainScreenPage mainScreenPage = new MainScreenPage(driver);

    private String displayedDate = mainScreenPage.todayDateBar.getText();
    private String errorMessage = "Date didn't change";
    private Date dateToday = new Date();
    private SimpleDateFormat dateWithDots = new SimpleDateFormat("dd.MM.yyyy");
    private Calendar calendar = Calendar.getInstance();

    @When("^I click next day button$")
    public void iClickNextDayButton() {
        mainScreenPage.nextDayButton.click();
    }

    @When("^I click previous day button$")
    public void iClickPreviousDayButton() {
        mainScreenPage.previousDayButton.click();
    }

    @Then("^I can see that date has changed$")
    public void iCanSeeThatDateHasChanged() {
        try {
            Assert.assertNotEquals("today ", displayedDate);
        } catch (Throwable t) {
            System.out.println(errorMessage);
        }
    }

    @Then("^I can see next day$")
    public void iCanSeeNextDay() {
        try {
            calendar.setTime(dateToday);
            calendar.add(Calendar.DATE, 1);
            dateToday = calendar.getTime();
            String dateTomorrow = dateWithDots.format(dateToday);
            Assert.assertEquals(mainScreenPage.todayDateBar.getText(), dateTomorrow);
        } catch (Throwable t) {
            System.out.println(errorMessage);
        }
    }

    @Then("^I can see previous day$")
    public void iCanSeePreviousDay() {
        try {
            calendar.setTime(dateToday);
            calendar.add(Calendar.DATE, -1);
            dateToday = calendar.getTime();
            String dateYesterday = dateWithDots.format(dateToday);
            Assert.assertEquals(mainScreenPage.todayDateBar.getText(), dateYesterday);
        } catch (Throwable t) {
            System.out.println(errorMessage);
        }
    }
}