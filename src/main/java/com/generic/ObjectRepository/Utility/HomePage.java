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

public class HomePage extends Webdriverutility {
      WebDriver driver ;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[local-name()='svg' and @class='icon icon-profile-circled']/ancestor::div[@class='header__mobile__button']//*//*[name()='svg']")
	private WebElement MyAccountLogo;
	
	@FindBy(xpath = "//span[text()='New']")
	private WebElement Newlink;
	
	@FindBy(xpath = "//span[text()='Shop']")
	private WebElement Shoplink;
	
	@FindBy(xpath = "//span[text()='Puzzle Club']")
	private WebElement PuzzleClublink;
	
	@FindBy(xpath = "//span[text()='Featured Artist']")
	private WebElement FeaturedArtistlink;
	
	@FindBy(xpath = "//span[text()='Brand Partnerships']")
	private WebElement BranadPartnershipslink;
	
	@FindBy(linkText = "SHOP NOW")
	private WebElement ShopNowBtn;
	
	@FindBy(xpath = "//span[contains(text(),'Puzzle Frames')]/ancestor::div[@class='dropdown__family']")
	private WebElement PuzzleFrameslink;
	
	public WebElement getPuzzleFrameslink() {
		return PuzzleFrameslink;
	}

	
	public WebElement getMyAccountLogo() {
		return MyAccountLogo;
	}


	public WebElement getShopNowBtn() {
		return ShopNowBtn;
	}
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getNewlink() {
		return Newlink;
	}

	public WebElement getShoplink() {
		return Shoplink;
	}

	public WebElement getPuzzleClublink() {
		return PuzzleClublink;
	}

	public WebElement getFeaturedArtistlink() {
		return FeaturedArtistlink;
	}

	public WebElement getBranadPartnershipslink() {
		return BranadPartnershipslink;
	}

	public void AccountLogo() {
		waitForPageToLoad(driver);
    	driver.manage().window().maximize();
    	//MyAccountLogo().click();	
    	getNewlink().click();                              
    	 getShoplink().click();  
    	 getPuzzleClublink().click();
    	 getFeaturedArtistlink().click();
    	 getBranadPartnershipslink().click();
    	 getPuzzleFrameslink().click();
    	 
	}
	public void hoverShop() {
		mouseMoveOnElement(driver,getShoplink());
	}


}


