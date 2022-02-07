package com.n11.company.page;

import com.n11.company.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.n11.company.constant.SecondScenarioConstant.*;


public class SecondScenarioPage extends BasePage {
    public SecondScenarioPage(WebDriver driver) {
        super(driver);
    }

    //TODO:value değerini integer olarak almak gerek.locator bulamıyorum.

    public SecondScenarioPage searchProduct() {

        sendKeys(SEARCH_BOX, SEARCH_INPUT);
        clickElement(SEARCH_BUTTON);
        assertionEqual("Wrong Page", SEARCH_CONTROL, "\"ayfon\"");
        return this;
    }

    public SecondScenarioPage selectProduct() {

        findList(PRODUCT_LIST).get(0).click();
        clickElement(ADD_TO_CART);
        previousPage();
        scrollTo(0, 5250);
        selectLastProduct(PRODUCT_LIST);
        clickElement(ADD_TO_CART);
        previousPageOnce();
        scrollTo(0, 5400);
        clickElement(PAGINATION_THREE);
        findList(PRODUCT_LIST).get(4).click();
        clickElement(ADD_TO_CART);

        return this;
    }

    public SecondScenarioPage cartComprison() {
        clickElement(GO_TO_CART);
        clickElement(SKIP_POPUP);
        cheapestProduct(PRODUCT_PRICE);
        waitSeconds(2);
        return this;

    }
}
