package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.MenuPage;

@Test
public class Testcase_menu5 extends Base{
	
	public void validatingTestSubmenu() throws InterruptedException, IOException
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
		m1.Submenu();
		String test=m1.subTesting();
		if(test.equals("You Have Selected Selenium Menu Option."))
		{
			Assert.assertTrue(true);
		}
		else
		{
			ScreenCapture(driver,"validatingTestSubmenu");
			Assert.assertTrue(false);
		}
		String test1=m1.submanual();
		if(test1.equals("You Have Selected Manual Testing Menu Option."))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		String test2=m1.subdatabase();
		if(test2.equals("You Have Selected DB Testing Menu Option."))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		String test3=m1.subunit();
		if(test3.equals("You Have Selected Unit Testing Menu Option."))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}

}
