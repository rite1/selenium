package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.SearchPage;

public class TestCase_search7 extends Base{
	@Test
	public void validateNavigationBar() throws InterruptedException, IOException
	{
		SearchPage k1=new SearchPage(driver);
		driver.get(url);
		  
		k1.setUname(usn);
		k1.setPass(pwd);
		
		k1.btnclk();
		Thread.sleep(5000);
		k1.Empl();
		String detail=k1.enterIndexnumber("18");
		if(detail.contains("vinoth"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			ScreenCapture(driver,"validateNavigationBar");
			Assert.assertTrue(false);
		}
		//k1.table();
	}

}
