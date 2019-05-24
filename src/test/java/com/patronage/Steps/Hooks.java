package com.patronage.Steps;

import com.patronage.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

//Class provided by team leader
public class Hooks extends DriverFactory {

    public Hooks() {
    }

    @Before
    public void beforeScenario(Scenario scenario) throws MalformedURLException {
        String scenarioName = scenario.getName();
        logger.info("=========== Start ===========");
        logger.info("======== " + scenarioName + " =========");
        runAndroidDriver("true");
    }

    @After
    public void afterScenario(Scenario scenario) throws IOException {
        String status = (scenario.isFailed() ? "FAILED" : "SUCCESS");
        logger.info("=======================================SCENARIO FINISHED WITH " + status + " STATUS");
        if (scenario.isFailed() && driver != null) {

            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
            FileUtils.copyFile(scrFile, new File(currentPath + "/screenshots/" + scenario.getName()
                    + "-" + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()) + ".png"));
        }
        destroyDriver();
        logger.info("============================================CLEANUP AFTER SCENARIO FINISHED");
    }
}