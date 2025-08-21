package com.generic.ObjectRepository.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jiggy.generic.DriverUtility.Webdriverutility;

/**
 * author Rohini
 * contains HomePage Element & business lib like navigateToCampaignPage() and logout()
 * 
 */

public class CustomerSpecificHomePage extends Webdriverutility {
      WebDriver driver ;
	public CustomerSpecificHomePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='New']")
	private WebElement newlink;
	
	@FindBy(xpath = "//span[text()='Shop']")
	private WebElement shoplink;
	
    @FindBy(xpath = "//span[text()='Puzzle Club']")
	private WebElement puzzleclublink;
	
	@FindBy(xpath = "//span[text()='Featured Artists']")
	private WebElement featuredartistlink;
	
	@FindBy(xpath= "//span[text()='Brand Partnerships']")
	private WebElement brandpartnershipslink;
	
	@FindBy(xpath ="//*[name()='svg' and @class='icon icon-search']/ancestor::div[@class='header__desktop__button']/descendant::summary[@title='Search'")
	private WebElement searchlogo;
	
	@FindBy(xpath = "//*[name()='svg' and @class='icon icon-bag']/ancestor::div[@class='header__desktop__buttons header__desktop__buttons--icons']")
	private WebElement Cartlogo;
	
	@FindBy(linkText ="View Addresses")
	private WebElement viewaddresseslink;
	
	@FindBy(linkText = "Log out")
	private WebElement LogOutlink;
	

	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getNewlink() {
		return newlink;
	}
	public WebElement getShoplink() {
		return shoplink;
	}
	public WebElement getPuzzleclublink() {
		return puzzleclublink;
	}
	public WebElement getFeaturedartistlink() {
		return featuredartistlink;
	}
	public WebElement getBrandpartnershipslink() {
		return brandpartnershipslink;
	}
	public WebElement getSearchlogo() {
		return searchlogo;
	}

	public WebElement getviewaddresseslink() {
		return viewaddresseslink ;
	}
	
	public WebElement getLogoutlink() {
		return LogOutlink;
	}
	 
	public void navigateToAllModules() {
		waitForPageToLoad(driver);
    	driver.manage().window().maximize();
    	getNewlink().click();
    	getShoplink().click();
    	getPuzzleclublink().click();
    	getFeaturedartistlink().click();
        getBrandpartnershipslink().click();
    	getSearchlogo().click();
    	
	}
    	
    public void logOut() {
    	waitForPageToLoad(driver);
    	driver.manage().window().maximize();
    	getLogoutlink().click();
    	
}
   public void viewAddress() { 
    getviewaddresseslink().click();

   }
   
}
