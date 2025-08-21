package com.generic.ObjectRepository.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jiggy.generic.DriverUtility.Webdriverutility;

public class AdvertisementPage extends Webdriverutility {
      WebDriver driver ;
	public AdvertisementPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 
	       
@FindBy(xpath= "//button[@aria-label='Close dialog']")
private WebElement AdvertismentcloseBtn;
public WebDriver getDriver() {
	return driver;
}



public WebElement getAdvertismentcloseBtn() {
	return AdvertismentcloseBtn;
}

}


