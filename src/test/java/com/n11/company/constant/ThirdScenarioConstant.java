package com.n11.company.constant;

import org.openqa.selenium.By;

public class ThirdScenarioConstant {

    public static final By SEARCH_BOX = By.id("searchData");
    public static final By SEARCH_BUTTON = By.className("searchBtn");
    public static final String SEARCH_INPUT = "telefon";
    public static final By SEARCH_CONTROL = By.cssSelector("div[class='resultText ']>h1");
    public static final By PHONE_BRAND_LIST = By.xpath("//*[@class='brand-checkbox' and @data-is='m']");
    public static final By OPTION_BUTTON = By.id("sortingType");
    public static final By REVIEWS_BUTTON = By.cssSelector("option[value='REVIEWS']");
    public static final By FREE_SHIPPING_BUTTON = By.id("freeShippingOption");
    public static final By FREE_SHIPPING_ACTIVE_BUTTON = By.cssSelector("div[class='listOption ticky  active ']");


}
