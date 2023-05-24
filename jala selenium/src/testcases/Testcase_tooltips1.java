package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import graphql.Assert;
import pageobject.TooltipsPage;
import pageobject.sliderPage;

@Test
public class Testcase_tooltips1 extends Base{

	public void validateTooltips()throws InterruptedException, IOException{
		TooltipsPage m2=new TooltipsPage(driver);
		driver.get(url);
		m2.setUname(usn);
		m2.setPass(pwd);
		m2.btnclk();
		Thread.sleep(8000);
		m2.More();
		m2.tooltipmenu();
		Thread.sleep(5000);
		String msg=m2.tooltipclik();
		if(m2.tooltipclik().contains("Thank you for being here!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			ScreenCapture(driver,"validateTooltips");
			Assert.assertTrue(false);
		}
		
		
		}
}
