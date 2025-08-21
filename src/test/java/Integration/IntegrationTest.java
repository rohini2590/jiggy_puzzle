package Integration;

import org.testng.annotations.Test;

import com.generic.ObjectRepository.Utility.HomePage;
import com.generic.ObjectRepository.Utility.ShopPage;
import com.jiggy.basetest.BaseClass;

import junit.framework.Assert;

public class IntegrationTest extends BaseClass{
@Test
	public void ShopToClassic() {
		String ACTUALNAME="JIGGY Classics – JIGGY Puzzles";
		HomePage hp = new HomePage(driver);
		hp.getShoplink().click();
		ShopPage sp=new ShopPage(driver);
		sp.getclassiclink().click();
		String TITLE=driver.getTitle();
		//System.out.println(TITLE);
		Assert.assertEquals(TITLE,ACTUALNAME);

	}
	
}
