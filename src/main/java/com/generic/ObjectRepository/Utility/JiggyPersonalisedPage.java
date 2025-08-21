package com.generic.ObjectRepository.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jiggy.generic.DriverUtility.Webdriverutility;

public class JiggyPersonalisedPage extends Webdriverutility {
	
	      WebDriver driver ;
		public JiggyPersonalisedPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "(//div[@class='product-item__bg'])[1]")
		private WebElement personalisedpuzzlelink;
		public WebDriver getDriver() {
			return driver;
		}
		public WebElement getPersonalisedpuzzlelink() {
			return personalisedpuzzlelink;
		}
		
		


}
