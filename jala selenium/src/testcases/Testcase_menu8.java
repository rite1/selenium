package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.MenuPage;
@Test
public class Testcase_menu8 extends Base{

	
	
	public void validatingTestSubmenu2() throws InterruptedException, IOException
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
		m1.Submenudatabase();
		
		String test=m1.sql();
		if(test.equals("You Have Selected SQL Menu Option."))
		{
			Assert.assertTrue(true);
		}
		else
		{
			ScreenCapture(driver,"validatingTestSubmenu2");
			Assert.assertTrue(false);
		}
		String test1=m1.mySql();
		if(test1.equals("You Have Selected My Sql Menu Option."))
		{
			Assert.assertTrue(true);
		}
		else
		{
			ScreenCapture(driver,"validatingTestSubmenu2");
			Assert.assertTrue(false);
		}
		String test2=m1.oracle();
		if(test2.equals("You Have Selected Oracle Menu Option."))
		{
			Assert.assertTrue(true);
		}
		else
		{
			ScreenCapture(driver,"validatingTestSubmenu2");
			Assert.assertTrue(false);
		}
		String test3=m1.h2();
		if(test3.equals("You Have Selected H2 Menu Option."))
		{
			Assert.assertTrue(true);
		}
		else
		{
			ScreenCapture(driver,"validatingTestSubmenu2");
			Assert.assertTrue(false);
		}
		
	}
}
