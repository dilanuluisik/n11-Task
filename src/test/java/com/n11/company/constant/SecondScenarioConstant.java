package com.n11.company.constant;

import org.openqa.selenium.By;

public class SecondScenarioConstant {

    public static final By SEARCH_BOX = By.id("searchData");
    public static final By SEARCH_BUTTON = By.className("searchBtn");
    public static final String SEARCH_INPUT = "ayfone";
    public static final By SEARCH_CONTROL = By.className("result-mean-word");
    public static final By PRODUCT_LIST = By.className("plink");
    public static final By PAGINATION_THREE = By.linkText("3");
    public static final By ADD_TO_CART = By.className("product-add-cart");
    public static final By GO_TO_CART = By.linkText("Sepete Git");
    public static final By SKIP_POPUP = By.cssSelector("span[class='btn btnBlack']");
    public static final By PRODUCT_PRICE = By.cssSelector("div[class='priceArea'] > span[class]");

}
