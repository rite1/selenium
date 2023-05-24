package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import graphql.Assert;
import pageobject.TooltipsPage;
import pageobject.sliderPage;

@Test
public class Testcase_tooltips2 extends Base{

	public void validateAllLinksTooltipspage()throws InterruptedException, IOException{
		TooltipsPage m2=new TooltipsPage(driver);
		driver.get(url);
		m2.setUname(usn);
		m2.setPass(pwd);
		m2.btnclk();
		Thread.sleep(5000);
		m2.More();
		m2.tooltipmenu();
		Thread.sleep(3000);
		m2.logoutlink();
		if(driver.getTitle().equals("Login"))
		{
			System.out.println("pass");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("fail");
			ScreenCapture(driver,"validateAllLinksTooltipspage");
			Assert.assertTrue(false);
		}
		
		
		}
}
