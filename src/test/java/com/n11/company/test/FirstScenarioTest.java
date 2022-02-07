package com.n11.company.test;

import com.n11.company.base.BaseTest;
import com.n11.company.page.FirstScenarioPage;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;


public class FirstScenarioTest extends BaseTest {

    FirstScenarioPage firstScenarioPage;


    @Before
    public void before() {
        firstScenarioPage = new FirstScenarioPage(getDriver());
    }


    @Test
    public void firstScenarioTest() throws IOException {
        firstScenarioPage.selectStores();
    }

}
