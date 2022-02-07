package com.n11.company.constant;

import org.openqa.selenium.By;

public class FirstScenarioConstant {

    public static final By POPUP_BUTTON = By.id("myLocation-close-info");
    public static final By STORES_HEADER_BUTTON = By.cssSelector("span[title='Mağazalar']");
    public static final By LOOKING_STORES_BUTTON = By.linkText("Mağazaları Gör");
    public static final By ALL_STORES_BUTTON = By.xpath("//h3[text()='Tüm Mağazalar']");
    public static final By ALL_STORES_LIST = By.cssSelector("div[class='tabPanel allSellers']>div>ul>li");
    public static final By LETTERS = By.cssSelector("div[class='letters']>span");
    public static final By OPTION_BUTTON = By.id("sortingType");
    public static final By REVIEWS_BUTTON = By.cssSelector("option[value='REVIEWS']");
    public static final By REVIEWS_INFO = By.cssSelector("span[class='ratingText']");
 //   public static final By ARROW_CLOSE = By.className("_hj-102w7__styles__openStateToggleIcon _hj-3Iftt__styles__surveyIcons");
}
