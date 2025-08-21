package com.generic.ObjectRepository.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jiggy.generic.DriverUtility.Webdriverutility;


public class RegisterPage extends Webdriverutility {
	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id =  "first_name")
	private WebElement FirstnameEdt;
	
	@FindBy(id ="last_name")
	private WebElement LastnameEdt;
	
	@FindBy(id ="email")
	private WebElement EmailEdt;
	
	@FindBy(id = "password")
	private WebElement PasswordEdt;
	
	@FindBy(xpath = "//span[text()='Create']")
	private WebElement CreateBtn;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstnameEdt() {
		return FirstnameEdt;
	}

	public WebElement getLastnameEdt() {
		return LastnameEdt;
	}

	public WebElement getEmailEdt() {
		return EmailEdt;
	}

	public WebElement getPasswordEdt() {
		return PasswordEdt;
	}
	
	public WebElement getCreateBtn() {
		return CreateBtn;
	}
	
	
	
	public void CreateAccount() {
		waitForPageToLoad(driver);
    	driver.manage().window().maximize();
    	getFirstnameEdt().sendKeys("USERNAME");
    	 getLastnameEdt().sendKeys("LASTNAME");
    	 getEmailEdt().sendKeys("EMAIL");
    	 getPasswordEdt().sendKeys("PASSWORD");
    	 getCreateBtn().click();
		
        
	}

}
