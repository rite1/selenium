package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.MenuPage;
@Test
public class Testcase_Menu7 extends Base{
	public void validatingTestSubmenu1() throws InterruptedException, IOException
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
		m1.subdotnet();
		String test=m1.chash();
		if(test.equals("You Have Selected C# Menu Option."))
		{
			Assert.assertTrue(true);
		}
		else
		{
			ScreenCapture(driver,"validatingTestSubmenu1");
			Assert.assertTrue(false);
		}
		String test1=m1.aspdotnet();
		if(test1.equals("You Have Selected ASP.NET Menu Option."))
		{
			Assert.assertTrue(true);
		}
		else
		{
			ScreenCapture(driver,"validatingTestSubmenu1");
			Assert.assertTrue(false);
		}
		String test2=m1.adodotnet();
		if(test2.equals("You Have Selected ADO.NET Menu Option."))
		{
			Assert.assertTrue(true);
		}
		else
		{
			ScreenCapture(driver,"validatingTestSubmenu1");
			Assert.assertTrue(false);
		}
		String test3=m1.mvc();
		if(test3.equals("You Have Selected MVC Menu Option."))
		{
			
			Assert.assertTrue(true);
		}
		else
		{
			ScreenCapture(driver,"validatingTestSubmenu1");
			Assert.assertTrue(false);
		}
		
	}

}
