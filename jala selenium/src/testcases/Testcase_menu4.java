package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.MenuPage;

public class Testcase_menu4 extends Base{

	@Test
	public void validatingdatabase() throws InterruptedException, IOException
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
		
		String test=m1.database();
		if(test.equals("You Have Selected Data base Menu Option."))
		{
			Assert.assertTrue(true);
		}
		else
		{
			ScreenCapture(driver,"validatingdatabase");
			Assert.assertTrue(false);
		}
	}
}
