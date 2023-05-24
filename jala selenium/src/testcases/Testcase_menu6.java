package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.MenuPage;
@Test
public class Testcase_menu6 extends Base {

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
		m1.subjava();
		String test=m1.hiberjava();
		if(test.equals("You Have Selected Hibernate Menu Option."))
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			ScreenCapture(driver,"validatingTestSubmenu1");
			Assert.assertTrue(false);
		}
		String test1=m1.advjava();
		if(test1.equals("You Have Selected Adv Java Menu Option."))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		String test2=m1.corejava();
		if(test2.equals("You Have Selected Core Java Menu Option."))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		String test3=m1.springjava();
		if(test3.equals("You Have Selected Spring Menu Option."))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	
}
