package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.SearchPage;

public class TestCase_search8 extends Base{
	@Test
	public void validateAllLinkssearchpage() throws InterruptedException, IOException
	{
		SearchPage k1=new SearchPage(driver);
		driver.get(url);
		  
		k1.setUname(usn);
		k1.setPass(pwd);
		
		k1.btnclk();
		Thread.sleep(5000);
		k1.Empl();
		k1.logoutlink();
		if(driver.getTitle().equals("Login"))
		{
			System.out.println("pass");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("fail");
			ScreenCapture(driver,"validateAllLinkssearchpage");
			Assert.assertTrue(false);
		}

		//k1.table();
	}

}
