package Smoke;

import org.testng.annotations.Test;

import com.generic.ObjectRepository.Utility.AdvertisementPage;
import com.generic.ObjectRepository.Utility.HomePage;
import com.generic.ObjectRepository.Utility.ShopPage;
import com.jiggy.basetest.BaseClass;

import junit.framework.Assert;

public class SmokeTest_1 extends BaseClass{
@Test
	public void SmokeTest() {
		String ACTUALNAME="New JIGGY Studio – JIGGY Puzzles";
		HomePage hp = new HomePage(driver);
		hp.getShoplink().click();
	
		ShopPage sp=new ShopPage(driver);
		sp. getStudiolink().click();
		String TITLE=driver.getTitle();
		Assert.assertEquals(TITLE,ACTUALNAME);
		AdvertisementPage adp = new AdvertisementPage(driver);
		adp.getAdvertismentcloseBtn().click();
		
		
		
		
	}

}
