package com.n11.company.page;

import com.n11.company.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static com.n11.company.constant.ThirdScenarioConstant.*;


public class ThirdScenarioPage extends BasePage {

    //TODO: 3.senaryo bitti.

    public ThirdScenarioPage(WebDriver driver) {
        super(driver);
    }

    public ThirdScenarioPage searchProduct() {

        sendKeys(SEARCH_BOX, SEARCH_INPUT);
        clickElement(SEARCH_BUTTON);
        assertionEqual("Wrong Page..", SEARCH_CONTROL, "Telefon,");

        return this;
    }

    public ThirdScenarioPage selectProperties() {

        findList(PHONE_BRAND_LIST).get(1).click();
        clickElement(OPTION_BUTTON);
        clickElement(REVIEWS_BUTTON);
        clickElement(FREE_SHIPPING_BUTTON);
        Assert.assertTrue("Free Shipping can't active..", isDisplayed(FREE_SHIPPING_ACTIVE_BUTTON));
        waitSeconds(4);
        return this;
    }
}
