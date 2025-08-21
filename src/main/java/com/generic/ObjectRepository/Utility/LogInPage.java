package com.generic.ObjectRepository.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jiggy.generic.DriverUtility.Webdriverutility;
/**
 * author Rohini
 * contains LoginPage Element & business lib like login()
 * 
 */
public class LogInPage extends Webdriverutility {
       WebDriver driver ;
	public LogInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	 }
	
	 


	
	@FindBy(id ="customer_email")
	private WebElement EmailEdt;
	

	@FindBy(id ="customer_password")
	private WebElement passwordEdt;
	
	@FindBy(xpath="//span[text()='Sign In']/ancestor::button[@type='submit']")
	private WebElement signinbtn;
	
	@FindBy(xpath = "//body[@id='jiggy-puzzles-we-make-puzzles-worth-framing']")
	private WebElement closeBtn;
	
	
	
    public WebDriver getDriver() {
		return driver;
	}


	public WebElement getEmailEdt() {
		return EmailEdt;
	}


	public WebElement getPasswordEdt() {
		return passwordEdt;
	}


	public WebElement getSigninbtn() {
		return signinbtn;
	}
	
	


	public WebElement getCloseBtn() {
		return closeBtn;
	}


	


	/**
     * Login to application
     * @param username
     * @param password
     */
    public void loginToApp(String email, String password) {
    	waitForPageToLoad(driver);
    	driver.manage().window().maximize();
    	//getCloseBtn().click();
    	getEmailEdt().sendKeys(email);
    	getPasswordEdt().sendKeys(password);
    	 getSigninbtn().click();
    }


    
	
	

}

