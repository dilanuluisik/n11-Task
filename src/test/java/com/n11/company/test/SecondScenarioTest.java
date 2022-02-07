package com.n11.company.test;

import com.n11.company.base.BaseTest;
import com.n11.company.page.SecondScenarioPage;
import org.junit.Before;
import org.junit.Test;

public class SecondScenarioTest extends BaseTest {

    SecondScenarioPage secondScenarioPage;


    @Before
    public void before() {
        secondScenarioPage = new SecondScenarioPage(getDriver());
    }

    @Test()
    public void secondScenarioTest() {
        secondScenarioPage.searchProduct().selectProduct().cartComprison();
    }
}
