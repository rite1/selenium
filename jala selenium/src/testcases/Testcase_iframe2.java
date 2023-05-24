package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import graphql.Assert;

import pageobject.IFramesPage;

public class Testcase_iframe2 extends Base{

	@Test
	public void validateAllLinksiframepage() throws InterruptedException, IOException
	{
		IFramesPage m1=new IFramesPage(driver);
		//LoginPage l1=new LoginPage(driver);
		driver.get(url);
		m1.setUname(usn);
		m1.setPass(pwd);
		m1.btnclk();
		Thread.sleep(8000);
		m1.More();
		m1.iframeMenu();
		m1.logoutlink();
		
		if(driver.getTitle().equals("Login"))
		{
			System.out.println("pass");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("fail");
			ScreenCapture(driver,"validateAllLinksiframepage");
			Assert.assertTrue(false);
		}
		
	}
}
