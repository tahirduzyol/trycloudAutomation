package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class TopMenu {    //CONCRATCLASS
    public TopMenu() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id='nextcloud']")
    public WebElement cloudrefreshicon;


    @FindBy(xpath = "//div[@class='header-right']")
    public List<WebElement> allrightopmodules;
    @FindBy(xpath = "//div[@class='header-left']")
    public List<WebElement> alllefttopmodules;

    @FindBy(xpath = "//*[@id='appmenu']")
    public List<WebElement> appmenuicons;

    @FindBy(xpath = " //header/div/ul/li[@data-id='dashboard']")
    public WebElement dashboardlink;

    @FindBy(xpath = " //header/div/ul/li[@data-id='files']")
    public WebElement filesLink;

    @FindBy(xpath = " //header/div/ul/li[@data-id='photos']")
    public WebElement photosLink;

    @FindBy(xpath = " //header/div/ul/li[@data-id='activity']")
    public WebElement activityLink;

    @FindBy(xpath = " //header/div/ul/li[@data-id='spreed']")
    public WebElement talkLink;

    @FindBy(xpath = " //header/div/ul/li[@data-id='mail']")
    public WebElement mailLink;

    @FindBy(xpath = " //header/div/ul/li[@data-id='contacts']")
    public WebElement contactsLink;

    @FindBy(xpath = " //header/div/ul/li[@data-id='circles']")
    public WebElement circlesLink;

    @FindBy(xpath = " //header/div/ul/li[@data-id='calendar']")
    public WebElement calendarLink;

    @FindBy(xpath = " //header/div/ul/li[@data-id='deck']")
    public WebElement deckLink;

    @FindBy(xpath = "//form/input[@type='search']")
    public WebElement searchinput;


    @FindBy(xpath = " //span[@aria-label='Magnify icon']")
    public WebElement magnifierIcon;
    //*[@id='header-menu-unified-search']/div[2]/ul/li[1]/a/span/h3


    @FindBy(xpath = "//div[@class='vue-recycle-scroller__item-view']")
    public List<WebElement> allpeopleinContactList;


    @FindBy(xpath = "//*[@id='header-menu-unified-search']/div[2]/ul/li[1]/a/span/h3")
    public WebElement displayeditem;


    @FindBy(xpath = "//div[@class='notifications']")
    public WebElement notificationIcon;

    @FindBy(css = "#contactsmenu")
    public WebElement contactmenuIcon;

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement avatar;





  /*
    dashboardLink
    filesLink
    photosLink
    activityLink
    talkLink
    mailLink
    contactsLink
    circlesLink
    calendarLink
    deckLink
List<WebElement> allModules;
     */

}
