package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import graphql.Assert;
import pageobject.IFramesPage;
import pageobject.ImagePage;
import pageobject.LinkPage;


public class Testcase_link3 extends Base{

	@Test
	public void validateAllLinkslinkpage() throws InterruptedException, IOException
	{
		LinkPage m1=new LinkPage(driver);
		//LoginPage l1=new LoginPage(driver);
		driver.get(url);
		m1.setUname(usn);
		m1.setPass(pwd);
		m1.btnclk();
		Thread.sleep(8000);
		m1.More();
		m1.linkMenu();
		m1.logoutlink();
		
		if(driver.getTitle().equals("Login"))
		{
			System.out.println("pass");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("fail");
			ScreenCapture(driver,"validateAllLinkslinkpage");
			Assert.assertTrue(false);
		}
		
	}
}
