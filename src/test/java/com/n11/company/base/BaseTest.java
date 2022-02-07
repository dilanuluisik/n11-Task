package com.n11.company.base;

import com.n11.company.utils.Browser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseTest {

    private static RemoteWebDriver driver;
    protected final Logger log = LogManager.getLogger(BaseTest.class);
    protected static Browser browser = new Browser();
    protected final String TEST_URL = "https://www.n11.com/";

    @Before
    public void setUp() {
        log.info("Test is in progress...");
        browser.setBrowser(TEST_URL, "Chrome");
    }

    @After
    public void tearDown() {
        if (driver != null)
          getDriver().quit();
        driver = null;
        log.info("Test is finished...");
    }

    public static RemoteWebDriver getDriver() {
        return driver;
    }

    public static void setDriver(RemoteWebDriver driver) {


        BaseTest.driver = driver;
    }

}