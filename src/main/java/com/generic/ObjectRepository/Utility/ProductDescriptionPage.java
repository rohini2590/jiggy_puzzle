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

public class  ProductDescriptionPage extends Webdriverutility {
      WebDriver driver ;
	public  ProductDescriptionPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public ProductDescriptionPage() {
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//p[contains(text(),'Cheetah Sunset by Sabina Fenn')]")
	private WebElement CheetahSunsetbySabinaFennEle;
	
	@FindBy(xpath = "(//div[@class='product-item__bg'])[1]")
	private WebElement product;
	
	@FindBy(xpath = "//span[text()='Add to cart']/ancestor::div[@class='product__block product__block--buttons block-padding color-scheme-1']//child::div[@class='product__submit__item']")
	private WebElement Addtocartbutton;
	public WebDriver getDriver() {
		return driver;
	}
	
	
	
	@FindBy( xpath ="//p[contains(text(),'Holiday, Arty Guava')]")
	private WebElement product2;
	

	@FindBy( xpath ="//p[contains(text(),'JIGGY Junior, VELOCI-ROCK by Arrolynn Weiderhold')]")
	private WebElement product3;

	
	@FindBy( xpath ="//p[contains(text(),'JIGGY Personalized Puzzle')]")
	private WebElement product4;
	
	@FindBy( xpath ="//p[contains(text(),'Plant Lady, Maggie Stephenson')]")
	private WebElement product5;

	public WebElement getCheetahSunsetbySabinaFennEle() {
		return CheetahSunsetbySabinaFennEle;
	}

	public WebElement getAddtocartbutton() {
		return Addtocartbutton;
	}
	public WebElement getproduct() {
		return product;
	}
	
	public WebElement getproduct2() {
		return product2;
	}
	
	public WebElement getproduct3() {
		return product3;
	}

	public WebElement getproduct4() {
		return product4;
	}

	public WebElement getproduct5() {
		return product5;
	}

	public void addToCart() {
	
	 getAddtocartbutton().click();

}
	
	
}
