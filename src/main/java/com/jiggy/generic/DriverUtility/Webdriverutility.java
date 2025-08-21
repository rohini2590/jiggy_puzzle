package com.jiggy.generic.DriverUtility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriverutility {
public void waitForPageToLoad(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
    public void waitForElementPresent(WebDriver driver,WebElement element) {
		
		WebDriverWait wait = new  WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
    
    public void SwitchToTabOnURL(WebDriver driver, String partialURL) {
		
        Set<String> set = driver.getWindowHandles();
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
        	String WindowID = it.next();
        	driver.switchTo().window(WindowID);
        	@Nullable
			String acturl = driver.getCurrentUrl();
        	if(acturl.contains(partialURL)) {
        		break;
        	}
        }
		
	}

    public void SwitchToTabOnTitle(WebDriver driver, String partialTitle) {
		
        Set<String> set = driver.getWindowHandles();
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
        	String WindowID = it.next();
        	driver.switchTo().window(WindowID);
        	@Nullable
			String acturl = driver.getCurrentUrl();
        	if(acturl.contains(partialTitle)) {
        		break;
        	}
        }
		
	}
    
    public void switchToByIndex(WebDriver driver,int index) {
    	Set<String> wins = driver.getWindowHandles();
    	int ct=0;
    	for(String s:wins) {
    		driver.switchTo().window(s);
    		ct++;
    		if(ct==index)
    			break;
    	}
    }
    
    public void switchtoFrame(WebDriver driver,int index) {
    	driver.switchTo().frame(index);
    }
    public void switchtoFrame(WebDriver driver,String nameID) {
    	driver.switchTo().frame(nameID);
    }
    public void switchtoFrame(WebDriver driver,WebElement element) {
    	driver.switchTo().frame(element);
    }
    
    
    
    public void switchtoAlertAndAccept(WebDriver driver) {
    	driver.switchTo().alert().accept();
    }
    public void switchtoAlertAndCancel(WebDriver driver) {
    	driver.switchTo().alert().dismiss();
    }
    
    
    public void Select(WebElement element,String text) {
    	Select sel = new Select(element);
    	sel.selectByVisibleText(text);
    }
    public void Select(WebElement element,int index) {
    	Select sel = new Select(element);
    	sel.selectByIndex(index);
    }
    
    public void mouseMoveOnElement(WebDriver driver, WebElement element) {
    	
    	Actions action = new Actions(driver);
    	action.moveToElement(element).perform();
    }
    public void doubleClick(WebDriver driver, WebElement element) {
    	
    	Actions action = new Actions(driver);
    	action.doubleClick(element).perform();
    }
    public void rightClick(WebDriver driver, WebElement element) {
    	
    	Actions action = new Actions(driver);
    	action.contextClick(element).perform();
    }
    public void mousedragAndDrop(WebDriver driver, WebElement source, WebElement target) {
    	
    	Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
    }
     public void clickAndHoldAction(WebDriver driver, WebElement element) {
    	
    	Actions action = new Actions(driver);
    	action.clickAndHold(element).perform();
    }
     public void release(WebDriver driver, WebElement element) {
     	
     	Actions action = new Actions(driver);
     	action.release(element).perform();
     }	
     
     public void waitForElement(WebDriver driver, WebElement element) {
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         wait.until(ExpectedConditions.visibilityOf(element));
     }

     public void switchToAlertAndDismiss(WebDriver driver, WebDriver driver2) {
         try {
             Alert alert = driver.switchTo().alert();
             alert.dismiss();
         } catch ( Exception e) {
             System.out.println("No alert present.");
         }
     }
     
     public class WebDriverUtility {
    	    public void mouseOver(WebDriver driver, WebElement element) {
    	        Actions actions = new Actions(driver);
    	        actions.moveToElement(element).perform();
    	    }
    	}
     
     public void JavaScriptExecutorClick(WebDriver driver,WebElement element) {
 		JavascriptExecutor js=(JavascriptExecutor)driver;
 		js.executeScript("arguments[0].click();", element);
 	}
 	public void JavaScriptExecutorValue(WebDriver driver,WebElement element,String text) {
 		JavascriptExecutor js=(JavascriptExecutor)driver;
 		js.executeScript("arguments[0].value="+text+";", element);
 	}
 	public void JavaScriptExecutorScrollIntoView(WebDriver driver,WebElement element) {
 		JavascriptExecutor js=(JavascriptExecutor)driver;
 	 js.executeScript("arguments[0].scrollIntoView(true);", element);
 	}
 	public void JavaScriptExecutorScrollBY(WebDriver driver,WebElement element) {
 		JavascriptExecutor js=(JavascriptExecutor)driver;
     js.executeScript("window.scrollBy(0,1200);");

 	}
 	public void JavaScriptExecutorScrollBYHeight(WebDriver driver,WebElement element) {
 	JavascriptExecutor js = (JavascriptExecutor) driver;
 	js.executeScript("window.scrollTo(0, document.body.scrollHeight/2)");
 	}
 	public void ExplicitWaitForElementPresent(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void ExplicitWaitForElementClickable(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(element));

	}
	public WebElement ExplicitWaitForElementClickableReturn(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		 WebElement ele= wait.until(ExpectedConditions.elementToBeClickable(element));
		 return ele;

	}
	public WebElement ExplicitWaitForElementClickableBY(WebDriver driver,By sortOption) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(sortOption));
		return ele;

	}
	public WebElement ExplicitWaitpresenceOfElementLocated(WebDriver driver,By element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(element));
		return ele;

	}
	public WebElement ExplicitWaitrefreshed(WebDriver driver,WebElement element) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement freshElement = wait.until(ExpectedConditions.refreshed(
                 ExpectedConditions.elementToBeClickable(element)
         ));
         return freshElement;
	}
	
	public void ExplicitWaitForElementByLocator(WebDriver driver,String path) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 WebElement closeBtn = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.xpath(path))
	        );
	        closeBtn.click();
	}
	public void FluentWaitForElementPresent(WebDriver driver,WebElement element) {
		FluentWait<WebDriver> wait =new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.withTimeout(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));	
	}

 }





	


