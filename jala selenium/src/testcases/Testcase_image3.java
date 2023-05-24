package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import graphql.Assert;
import pageobject.IFramesPage;
import pageobject.ImagePage;


public class Testcase_image3 extends Base{

	@Test
	public void validateAllLinksImagepage() throws InterruptedException, IOException
	{
		ImagePage m1=new ImagePage(driver);
		//LoginPage l1=new LoginPage(driver);
		driver.get(url);
		m1.setUname(usn);
		m1.setPass(pwd);
		m1.btnclk();
		Thread.sleep(8000);
		m1.More();
		m1.imageOption();
		m1.logoutlink();
		
		if(driver.getTitle().equals("Login"))
		{
			System.out.println("pass");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("fail");
			ScreenCapture(driver,"validateAllLinksImagepage");
			Assert.assertTrue(false);
		}
		
	}
}
