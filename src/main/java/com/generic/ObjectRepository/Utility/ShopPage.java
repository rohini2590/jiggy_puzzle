package com.generic.ObjectRepository.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jiggy.generic.DriverUtility.Webdriverutility;

public class ShopPage extends Webdriverutility {
	
	      WebDriver driver ;
		public ShopPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "(//div[@class='column__image'])[1]")
		private WebElement classiclink;
		
		@FindBy(xpath = "(//div[@class='column__image'])[2]")
		private WebElement studiolink;
		
		@FindBy(xpath = "(//div[@class='column__image'])[3]")
		private WebElement juniorlink;
		
		@FindBy(xpath = "(//div[@class='column__image'])[4]")
		private WebElement personalisedlink;
		
		@FindBy(xpath = "//span[contains(text(),'Puzzle Frames')]/ancestor::div[@class='dropdown__family']")
		private WebElement puzzleframeslink;
		
		  
		    public WebDriver getDriver() {
			return driver;
		}
		public WebElement getclassiclink() {
			return classiclink;
		}
		
	
			
		public WebElement getStudiolink() {
			return studiolink;
		}
		public WebElement getJuniorlink() {
			return juniorlink;
		}
		public WebElement getPersonalisedlink() {
			return personalisedlink;
		}
		public WebElement getpuzzleframeslink() {
			return  puzzleframeslink;
		}
			public void ShopPage() {
		    	waitForPageToLoad(driver);
		    	driver.manage().window().maximize();
		    	
		    	
		    }
}
