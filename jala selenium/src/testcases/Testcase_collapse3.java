package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import graphql.Assert;

import pageobject.Collapsiblecontentpage;

public class Testcase_collapse3 extends Base{

	
	@Test
	public void validateAllLinkscollapsepage() throws InterruptedException, IOException
	{
		Collapsiblecontentpage m1=new Collapsiblecontentpage(driver);
		//LoginPage l1=new LoginPage(driver);
		driver.get(url);
		m1.setUname(usn);
		m1.setPass(pwd);
		m1.btnclk();
		Thread.sleep(8000);
		m1.More();
		m1.collapse();
		m1.logoutlink();
		
		if(driver.getTitle().equals("Login"))
		{
			System.out.println("pass");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("fail");
			ScreenCapture(driver,"validateAllLinkscollapsepage");
			Assert.assertTrue(false);
		}
		
	}
}
