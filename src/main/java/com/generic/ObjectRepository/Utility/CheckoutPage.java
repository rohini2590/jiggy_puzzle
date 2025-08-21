package com.generic.ObjectRepository.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	WebDriver driver ;
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 
	       
@FindBy(name = "checkout")
private WebElement CheckOutBtn;

@FindBy(id = "Select0")
private WebElement deliverydropdown;



public WebElement getCheckOutBtn() {
	return CheckOutBtn;
}

}
