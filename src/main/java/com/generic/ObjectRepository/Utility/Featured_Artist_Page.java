package com.generic.ObjectRepository.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jiggy.generic.DriverUtility.Webdriverutility;

public class Featured_Artist_Page extends Webdriverutility{
	
	      WebDriver driver ;
		public Featured_Artist_Page(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//span[text()='shop all featured artists']")
		private WebElement shopallfeaturedartistlink;
		public WebDriver getDriver() {
			return driver;
		}

		public WebElement getShopallfeaturedartistlink() {
			return shopallfeaturedartistlink;
		}
		
		public void ShopPage() {
	    	waitForPageToLoad(driver);
	    	driver.manage().window().maximize();
	    	getShopallfeaturedartistlink().click();
	    	
	    }

}
