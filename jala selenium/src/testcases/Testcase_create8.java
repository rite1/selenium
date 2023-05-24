package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import graphql.Assert;

import pageobject.PageObject;

public class Testcase_create8 extends Base {
	
	@Test
	public void validateAllLinksicreatepage() throws InterruptedException, IOException
	{
		PageObject m1=new PageObject(driver);
		//LoginPage l1=new LoginPage(driver);
		driver.get(url);
		m1.setUname(usn);
		m1.setPass(pwd);
		m1.btnclk();
		Thread.sleep(8000);
		m1.Regist();
		//m1.searchempl();
		m1.logoutlink();
		
		if(driver.getTitle().equals("Login"))
		{
			System.out.println("pass");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("fail");
			ScreenCapture(driver,"validateAllLinksicreatepage");
			Assert.assertTrue(false);
		}
		
	}

}
