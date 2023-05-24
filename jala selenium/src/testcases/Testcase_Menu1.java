package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.LoginPage;
import pageobject.MenuPage;

public class Testcase_Menu1 extends Base{
	@Test
	public void validatingTesting() throws InterruptedException, IOException
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
		
		String test=m1.Testing();
		if(test.equals("You Have Selected Testing Menu Option."))
		{
			Assert.assertTrue(true);
		}
		else
		{
			ScreenCapture(driver,"validatingTesting");
			Assert.assertTrue(false);
		}
	}

}
