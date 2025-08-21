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

public class NewPage extends Webdriverutility {
      WebDriver driver ;
	public NewPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='New']")
	private WebElement newlink;
	
	@FindBy(xpath = "//*[contains(text(),'Flower Shop, Bailey Schmidt')]/ancestor::div[@id='product-item--template--18038423945258__main-7522024554538']")
	private WebElement FlowerShopBaileySchmidtEle;
	
	@FindBy(xpath = "//p[text()='Taco Truck Date by Bailey Schmidt']")
	private WebElement TacoTruckDatebyBaileySchmidtEle;
	
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getNewlink() {
		return newlink;
	}

	public WebElement getFlowerShopBaileySchmidtEle() {
		return FlowerShopBaileySchmidtEle;
	}

	
	public WebElement getTacoTruckDatebyBaileySchmidtEle() {
		return TacoTruckDatebyBaileySchmidtEle;
	}
	
	public void AddPuzzles () {
		waitForPageToLoad(driver);
    	driver.manage().window().maximize();
    	getNewlink().click();
    	 getFlowerShopBaileySchmidtEle().click();
    	 getTacoTruckDatebyBaileySchmidtEle().click();
		

	}
	
	
	
}




