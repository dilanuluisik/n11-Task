package com.n11.company.page;

import com.n11.company.base.BasePage;
import org.openqa.selenium.WebDriver;


import java.io.IOException;

import static com.n11.company.constant.FirstScenarioConstant.*;

public class FirstScenarioPage extends BasePage {

    public FirstScenarioPage(WebDriver driver) {
        super(driver);
    }

    //TODO: csv , excel , text olayını çözmek gerek.

    public void selectStores() throws IOException {
        clickElement(POPUP_BUTTON);
        hoverElement(STORES_HEADER_BUTTON);
        clickElement(LOOKING_STORES_BUTTON);
        clickElement(ALL_STORES_BUTTON);
        selectSecondSBrandCompany();
        clickElement(OPTION_BUTTON);
        clickElement(REVIEWS_BUTTON);
        totalReviews();

    }

}
