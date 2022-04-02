package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeckPage extends TopMenu{

    @FindBy(xpath = "//div/a[@class='app-navigation-toggle']")
    public WebElement threesmalllines ;

    @FindBy(xpath = " //li/a/span[@title='Add board']")
    public WebElement addboards;





}
