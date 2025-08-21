package com.generic.ObjectRepository.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jiggy.generic.DriverUtility.Webdriverutility;

public class CartPage extends Webdriverutility {
      WebDriver driver ;
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 
	       
@FindBy(xpath = "//button[@class='btn btn--primary btn--solid btn--full cart__checkout']")
private WebElement CheckOutBtn;

@FindBy(name = "checkout")
private WebElement CheckOutBttn;
public WebElement getCheckOutBttn() {
	return CheckOutBttn;
}

@FindBy(name = "add")
private WebElement addCartBtn;



public WebElement getAddCartBtn() {
	return addCartBtn;
}
@FindBy(xpath= "//div[@class='jtbc-button jtbc-cart-button']")
private WebElement addCartPersonalBtn;



public WebElement getaddCartPersonalBtn() {
	return addCartPersonalBtn;
}

@FindBy(name = "add")
private WebElement addCartPuzzleBtn;



public WebElement getAddCartPuzzleBtn() {
	return addCartPuzzleBtn;
}

public WebDriver getDriver() {
	return driver;
}

public WebElement getCheckOutBtn() {
	return CheckOutBtn;
}

public void addCartPuzzle() {
	
	 ExplicitWaitForElementClickable(driver,getAddCartPuzzleBtn());
	
	getAddCartPuzzleBtn().click();
}
public void addCartPersonalPuzzle() {
	
	 //ExplicitWaitForElementClickable(driver,getAddCartPuzzleBtn());
	JavaScriptExecutorScrollBY(driver,getaddCartPersonalBtn());
	getaddCartPersonalBtn().click();
}
	
	public void checkout() {
		waitForPageToLoad(driver);
    	driver.manage().window().maximize();
    	 CheckOutBtn.click();
	}
	

	public String getproduct() {
		String name=driver.findElement(By.xpath("//div[@class='cart__item__content']//h4[@class='cart__item__title']/a")).getText();
		return name;
	}
	
		
}
