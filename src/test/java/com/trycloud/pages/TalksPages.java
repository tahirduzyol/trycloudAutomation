package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TalksPages extends TopMenu {

    @FindBy(xpath = "//*[@id=\"conversation_82y3zut6\"]/div[2]/div[1]/span[1]")
    public WebElement talkupdatebutton;

    @FindBy(xpath = "//div/form/input[@type='text']")
    public WebElement usersearchintalk;

    @FindBy(xpath = "(//li/a/div/div/span[@class='acli__content__line-one__title'])[1]")
    public WebElement firstuserintalks;

    @FindBy(xpath = "//div[@role='textbox']")
    public WebElement messageinputintalk;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitbuttonintalk;
    @FindBy(xpath = "//div[@class='rich-text--wrapper']")
    public WebElement submittedmsgintalk;

    @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
    public WebElement talkModule;








}
