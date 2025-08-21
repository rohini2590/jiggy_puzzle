package System;

import org.testng.annotations.Test;

import com.generic.ObjectRepository.Utility.AdvertisementPage;
import com.generic.ObjectRepository.Utility.CartPage;
import com.generic.ObjectRepository.Utility.HomePage;
import com.generic.ObjectRepository.Utility.ProductDescriptionPage;
import com.generic.ObjectRepository.Utility.ShopPage;
import com.jiggy.basetest.BaseClass;

import junit.framework.Assert;

public class System_1 extends BaseClass{
	@Test
	public void System() throws InterruptedException {
		String actualproductname ="Plant Lady, Maggie Stephenson";
		HomePage hp = new HomePage(driver);
		//hp.hoverShop();
		
		//hp.getShoplink().click();
		//AdvertisementPage adp = new AdvertisementPage(driver);
		//adp.getAdvertismentcloseBtn().click();
		//hp.hoverShop();
		//Thread.sleep(2000);
		//ShopPage sp=new ShopPage(driver);
		//sp.getpuzzleframeslink().click();
hp.getShoplink().click();
AdvertisementPage adp = new AdvertisementPage(driver);
		adp.getAdvertismentcloseBtn().click();
ShopPage sp=new ShopPage(driver);
sp.getclassiclink().click();
 ProductDescriptionPage pdp =new  ProductDescriptionPage(driver);
 pdp. getproduct5().click();
 CartPage cp=new CartPage(driver);
 cp.getAddCartBtn().click();
 Thread.sleep(2000);
	String productname=cp.getproduct();

	Assert.assertEquals(productname, actualproductname);
	System.out.println("p:"+productname);
 //CheckoutPage cop=new CheckoutPage(driver);
 Thread.sleep(3000);
 cp.getCheckOutBttn().click();
//AdvertisementPage adp = new AdvertisementPage(driver);
	//adp.getAdvertismentcloseBtn().click();
	}
}