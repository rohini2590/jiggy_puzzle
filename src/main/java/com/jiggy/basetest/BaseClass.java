package com.jiggy.basetest;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.generic.ObjectRepository.Utility.CustomerSpecificHomePage;
import com.generic.ObjectRepository.Utility.HomePage;
import com.generic.ObjectRepository.Utility.LogInPage;
import com.jiggy.generic.DatabaseUtility.DatabaseUtility;
import com.jiggy.generic.DriverUtility.UtilityClassObject;
import com.jiggy.generic.DriverUtility.Webdriverutility;
import com.jiggy.generic.FileUtility.ExcelUtility;
import com.jiggy.generic.FileUtility.FileUtility;
import com.jiggy.generic.JavaUtility.JavaUtility;
@Listeners(com.jiggy.generic.LisenerUtility.ListImpClass.class)
public class BaseClass {
	public   FileUtility Flib = new FileUtility();
	 public   ExcelUtility Elib = new ExcelUtility();
	 public   JavaUtility Jalib = new JavaUtility();
	 public	  Webdriverutility wlib = new Webdriverutility();
	 public   DatabaseUtility Dlib = new DatabaseUtility();
	 public WebDriver driver = null;
	 public static WebDriver sdriver = null;
	 
	  @BeforeSuite
	 public void configBS() {
		 System.out.println("=======connect to DB, Report Config=========");
		 Dlib.getconn();
	 }
	  
	@BeforeClass
	public void configBC() throws IOException {
		System.out.println("========Launch the browser============");
		String BROWSER = Flib.getDataFromPropertiesFile("browser");
		String URL = Flib.getDataFromPropertiesFile("url");
		String EMAIl = Flib.getDataFromPropertiesFile("email");
		String PASSWORD = Flib.getDataFromPropertiesFile("password");
		if(BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(BROWSER.equals("firefox")){
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("edge")){
			driver = new EdgeDriver();
		}else {
			driver = new ChromeDriver();
		}
		driver.get(URL);
		driver.manage().window().maximize();
		wlib.waitForPageToLoad(driver);
		sdriver = driver;
		UtilityClassObject.setDriver(driver);
		
	 }
	
	@BeforeMethod
	public void configBM() throws IOException {
		/*System.out.println("===========Login=============");
		String USERNAME = Flib.getDataFromPropertiesFile("username");
		String PASSWORD = Flib.getDataFromPropertiesFile("password");
		LogInPage lp = new LogInPage(driver);
		lp.loginToApp(USERNAME, PASSWORD);*/
		
	}
	
	@AfterMethod
	public void configAM() throws Exception {
	System.out.println("===============logout==============");
	CustomerSpecificHomePage chp = new CustomerSpecificHomePage(driver);
	//chp.logOut();

	
	}
	
	@AfterClass
	public void configAC() {
		System.out.println("==============close the browser===============");
		//driver.quit();
	}
	
	@AfterSuite
	public void configAS() {
		System.out.println("===================close DB, Report backup==============");
		Dlib.closeDbconnection();

		
	}



}
