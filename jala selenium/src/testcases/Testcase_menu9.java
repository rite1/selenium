package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import graphql.Assert;
import pageobject.MenuPage;

public class Testcase_menu9 extends Base{
	@Test
	public void validateAllLinksmenupage() throws InterruptedException, IOException
	{
		MenuPage m1=new MenuPage(driver);
		//LoginPage l1=new LoginPage(driver);
		driver.get(url);
		m1.setUname(usn);
		m1.setPass(pwd);
		m1.btnclk();
		Thread.sleep(8000);
		m1.More();
		m1.Menu();
		m1.logoutlink();
		
		if(driver.getTitle().equals("Login"))
		{
			System.out.println("pass");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("fail");
			ScreenCapture(driver,"validateAllLinksmenupage");
			Assert.assertTrue(false);
		}
		
	}

}
