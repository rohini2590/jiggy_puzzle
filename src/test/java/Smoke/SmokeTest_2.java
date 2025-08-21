package Smoke;
import org.testng.annotations.Test;

import com.generic.ObjectRepository.Utility.AdvertisementPage;
import com.generic.ObjectRepository.Utility.HomePage;
import com.generic.ObjectRepository.Utility.ShopPage;
import com.jiggy.basetest.BaseClass;

import junit.framework.Assert;

public class SmokeTest_2 extends BaseClass{
@Test
	public void SmokeTest() {
	String ACTUALNAME="New JIGGY Junior – JIGGY Puzzles";
	HomePage hp = new HomePage(driver);
	hp.getShoplink().click();

	ShopPage sp=new ShopPage(driver);
	sp.getJuniorlink().click();	
	String TITLE=driver.getTitle();
	//System.out.println(TITLE);
	Assert.assertEquals(TITLE,ACTUALNAME);
	AdvertisementPage adp = new AdvertisementPage(driver);
	adp.getAdvertismentcloseBtn().click();
}}