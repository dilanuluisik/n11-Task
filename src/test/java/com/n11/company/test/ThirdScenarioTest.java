package com.n11.company.test;

import com.n11.company.base.BaseTest;
import com.n11.company.page.ThirdScenarioPage;
import org.junit.Before;
import org.junit.Test;

public class ThirdScenarioTest extends BaseTest {

    ThirdScenarioPage thirdScenarioPage;

    @Before
    public void before() {

        thirdScenarioPage = new ThirdScenarioPage(getDriver());
    }

    @Test
    public void thirdScenarioTest() {

        thirdScenarioPage.searchProduct().selectProperties();
    }
}
