package com.patronage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;


public class DriverFactory {
    protected static AppiumDriver driver;
    protected static final Logger logger = LoggerFactory.getLogger(DriverFactory.class);

    public DriverFactory() { }

    public void runAndroidDriver(String noReset) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName","Android");
        capabilities.setCapability("app", getAndroidAppPath());
        //NEED TO CHANGE APPLICATION IN RESOURCES FROM TIME TO TIME TO GET THE LATEST
        capabilities.setCapability("appPackage", "com.intive.confr");
        capabilities.setCapability("appActivity", "com.intive.confr.main.login.view.LoginActivity");
        capabilities.setCapability("noReset", noReset);

        URL localAppium = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(localAppium, capabilities);
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
    }

    private String getAndroidAppPath() {

        String appName = "ConfR-v1.0-build-1-debug.apk";
        String currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        String path = currentPath
                + File.separator
                + "src"
                + File.separator
                + "test"
                + File.separator
                + "resources"
                + File.separator
                +"Applications"
                +File.separator;
        path += appName;

        return path;
    }

    public void destroyDriver() {
        driver.quit();
    }
}
