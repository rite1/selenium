package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import graphql.Assert;
import pageobject.Autocomplete;


public class Testcase_menuauto2 extends Base{
	
	@Test
	public void validateAllLinksMenuPage() throws InterruptedException, IOException
	{
		Autocomplete m1=new Autocomplete(driver);
		//LoginPage l1=new LoginPage(driver);
		driver.get(url);
		m1.setUname(usn);
		m1.setPass(pwd);
		m1.btnclk();
		Thread.sleep(8000);
		m1.More();
		m1.Autocomplete();
		m1.logoutlink();
		
		if(driver.getTitle().equals("Login"))
		{
			System.out.println("pass");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("fail");
			ScreenCapture(driver,"validateAllLinksMenuPage");
			Assert.assertTrue(false);
		}
		
	}

}
