package System;

import org.testng.annotations.Test;

import com.generic.ObjectRepository.Utility.AdvertisementPage;
import com.generic.ObjectRepository.Utility.CartPage;
import com.generic.ObjectRepository.Utility.CheckoutPage;
import com.generic.ObjectRepository.Utility.HomePage;
import com.generic.ObjectRepository.Utility.LogInPage;
import com.generic.ObjectRepository.Utility.Paynow;
import com.generic.ObjectRepository.Utility.ProductDescriptionPage;
import com.generic.ObjectRepository.Utility.ShopPage;
import com.jiggy.basetest.BaseClass;

import junit.framework.Assert;

public class SystemTest extends BaseClass  {
	@Test
	public void loginTest() throws InterruptedException {
		String actualproductname="Escape, Marina Castaldo";
		HomePage hp = new HomePage(driver);
		hp.getShoplink().click();
	
		ShopPage sp=new ShopPage(driver);
		sp.getclassiclink().click();
		 ProductDescriptionPage pdp =new  ProductDescriptionPage(driver);
		 pdp. getproduct().click();
		 CartPage cp=new CartPage(driver);
		 cp.getAddCartBtn().click();
		 Thread.sleep(2000);
		String productname=cp.getproduct();
		Assert.assertEquals(productname, actualproductname);
		System.out.println("p:"+productname);
		 
		 AdvertisementPage adp = new AdvertisementPage(driver);
			adp.getAdvertismentcloseBtn().click();
			 Thread.sleep(3000);
			CheckoutPage cop=new CheckoutPage(driver);
			 cp.getCheckOutBttn().click();
			//Paynow pn=new Paynow(driver);
			//pn.Address("rohinirajkishore.n@gmail.com","United State","sara","Thompson","1234 palm street","clearwater","Orlando","Florida","33601","(407)555-2398");

	}}
