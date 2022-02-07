package com.n11.company.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.*;
import java.util.concurrent.TimeUnit;

import static com.n11.company.constant.FirstScenarioConstant.*;


public class BasePage {
    private static final Logger log = LogManager.getLogger(BasePage.class);

    protected WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    protected JavascriptExecutor getJSExecutor() {

        return (JavascriptExecutor) driver;
    }

    public void waitSeconds(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            log.error(e.getMessage(), e);
        }
    }

    public WebElement findElement(By by) {


        return driver.findElement(by);
    }

    public void clickElement(By by) {
        waitUntilPresence(by);
        WebElement element;
        element = findElement(by);
        if (!element.isDisplayed()) {
            scrollTo(element.getLocation().getX(), element.getLocation().getY());
        }
        try {
            waitUntilElementClickable(by);
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            Assert.fail("Element is not a clickable");
        }
        element.click();
    }

    public void sendKeys(By by, String text) {
        waitUntilPresence(by);
        WebElement element;
        element = findElement(by);
        if (!element.isDisplayed()) {
            scrollTo(element.getLocation().getX(), element.getLocation().getY());
        }
        waitUntilElementClickable(by);
        element.sendKeys(text);
    }

    public List<WebElement> findList(By by) {
        waitUntilPresence(by);
        return driver.findElements(by);
    }

    public void hoverElement(By by) {
        Actions action = new Actions(driver);
        log.info("Hover to Element...");
        action.moveToElement(findElement(by)).build().perform();
    }

    protected void scrollTo(int x, int y) {
        String jsStmt = String.format("window.scrollTo(%d, %d);", x, y);
        getJSExecutor().executeScript(jsStmt, true);
    }

    public String getText(By by) {
        waitUntilPresence(by);
        return findElement(by).getText();
    }

    public void assertEqual(String message, String expected, String actual) {

        Assert.assertEquals(message, expected, actual);
    }

    public void assertionEqual(String message, By by, String actual) {

        Assert.assertEquals(message, driver.findElement(by).getText(), actual);
    }

    public void waitUntilPresence(By by) {

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public void waitUntilElementClickable(By by) {
        log.info("The element is expected to be clickable...");
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void previousPage() {

        for (int i = 0; i < 2; i++) {
            driver.navigate().back();
        }
    }

    public void previousPageOnce() {

        driver.navigate().back();

    }

    public void selectLastProduct(By by) {

        int listSize = findList(by).size();
        findList(by).get(listSize - 1).click();
    }

    public boolean isDisplayed(By by) {
        findElement(by).isDisplayed();
        return true;
    }

    public void cheapestProduct(By by) {

        List<WebElement> cheapestPr = findList(by);

        for (int i = 0; i < cheapestPr.size(); i++) {

            String cheapestRefactor = cheapestPr.get(i).getText();
            String reFactorReviewText = cheapestRefactor.replace("TL", "" );
            String reFactorReviewText1 = reFactorReviewText.replace(".", "");
            String reFactorReviewText2 = reFactorReviewText1.replace(",", "");
            String reFactorReviewText3 = reFactorReviewText2.replace(" ", "");

            int reviewResult = Integer.parseInt(reFactorReviewText3);

            ArrayList<Integer> al = new ArrayList<Integer>();
            al.add(reviewResult);


            Collections.sort(al);

            System.out.println(al);

        }


    }

    public void selectSecondSBrandCompany() {
        List<WebElement> letterList = findList(LETTERS);
        letterList.get(21).click();
        List<WebElement> allStoresList = findList(ALL_STORES_LIST);
        allStoresList.get(1).click();

    }

    public void totalReviews() {
        List<WebElement> reviewList = findList(REVIEWS_INFO);
        int sum = 0;

        for (int i = 5; i < reviewList.size(); i++) {
            String reviewText = reviewList.get(i).getText();
            String reFactorReviewText = reviewText.replace("(", "");
            String resultReviewText = reFactorReviewText.replace(")", "");

            int reviewResult = Integer.parseInt(resultReviewText);

            sum += reviewResult;


        }
        System.out.println("Total Comment=" + sum);

    }
}


