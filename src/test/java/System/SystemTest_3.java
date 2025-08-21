package System;
import org.testng.annotations.Test;

import com.generic.ObjectRepository.Utility.AdvertisementPage;
import com.generic.ObjectRepository.Utility.CartPage;
import com.generic.ObjectRepository.Utility.CheckoutPage;
import com.generic.ObjectRepository.Utility.HomePage;
import com.generic.ObjectRepository.Utility.LogInPage;
import com.generic.ObjectRepository.Utility.ProductDescriptionPage;
import com.generic.ObjectRepository.Utility.ShopPage;
import com.jiggy.basetest.BaseClass;

import junit.framework.Assert;

public class SystemTest_3 extends BaseClass  {
	@Test
	public void loginTest() throws InterruptedException {
		String actualproductname ="JIGGY Junior, VELOCI-ROCK by Arrolynn Weiderhold";
		HomePage hp = new HomePage(driver);
		hp.getShoplink().click();
	
		ShopPage sp=new ShopPage(driver);
		sp.getJuniorlink().click();
		 ProductDescriptionPage pdp =new  ProductDescriptionPage(driver);
		 pdp. getproduct3().click();
		 CartPage cp=new CartPage(driver);
		 cp.getAddCartBtn().click();
		 AdvertisementPage adp = new AdvertisementPage(driver);
			adp.getAdvertismentcloseBtn().click();
		 String productname=cp.getproduct();
			
			Assert.assertEquals(productname, actualproductname);
			System.out.println("p:"+productname);
			
		 CheckoutPage cop=new CheckoutPage(driver);
		 Thread.sleep(3000);
		 cp.getCheckOutBttn().click();

	}}

