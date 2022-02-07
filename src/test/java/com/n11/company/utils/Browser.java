package com.n11.company.utils;

import com.n11.company.base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Browser {
    protected final Logger logger = LogManager.getLogger(Browser.class);

    public void setBrowser(String url, String browserType) {

        if (browserType.equals("chrome") || browserType.equals("Chrome")) {

            WebDriverManager.chromedriver().setup();
            DesiredCapabilities capabilities = new DesiredCapabilities();

            ChromeOptions option = new ChromeOptions();

            option.addArguments("com.n11.company.base.test-type");
            option.addArguments("disable-popup-blocking");
            option.addArguments("ignore-certificate-errors");
            option.addArguments("disable-translate");
            option.addArguments("start-maximized");
            option.addArguments("disable-automatic-password-saving");
            option.addArguments("allow-silent-push");
            option.addArguments("disable-infobars");
            option.addArguments("--disable-notifications");
            option.setExperimentalOption("useAutomationExtension", false);
            capabilities.setCapability("browserName", "chrome");
            capabilities.setPlatform(Platform.WINDOWS);
            capabilities.setCapability(ChromeOptions.CAPABILITY, option);

            BaseTest.setDriver(new ChromeDriver(option));
            BaseTest.getDriver().navigate().to(url);
            BaseTest.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        }

        else if (browserType.equals("edge") || browserType.equals("Edge")) {

            WebDriverManager.edgedriver().setup();
            DesiredCapabilities capabilities = new DesiredCapabilities();

            EdgeOptions option = new EdgeOptions();

            capabilities.setCapability("browserName", "edge");
            capabilities.setPlatform(Platform.WINDOWS);
            capabilities.setCapability(ChromeOptions.CAPABILITY, option);

            BaseTest.setDriver(new EdgeDriver(option));
            BaseTest.getDriver().navigate().to(url);
            BaseTest.getDriver().manage().window().maximize();
            BaseTest.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        }
    }
}