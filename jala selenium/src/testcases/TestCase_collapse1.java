package testcases;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.Autocomplete;
import pageobject.Collapsiblecontentpage;

@Test
public class TestCase_collapse1 extends Base{
	public void collapseValidate() throws InterruptedException, IOException
	{
	
		Collapsiblecontentpage m1=new Collapsiblecontentpage(driver);
		//LoginPage l1=new LoginPage(driver);
		driver.get(url);
		m1.setUname(usn);
		m1.setPass(pwd);
		m1.btnclk();
		Thread.sleep(8000);
		m1.More();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		m1.collapse();
		Thread.sleep(5000);
		m1.collapse1();
		if(m1.collapse1().contains("tasks"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			ScreenCapture(driver,"collapseValidate");
			Assert.assertTrue(false);
		}
		Thread.sleep(5000);
		
			m1.collapse2();
		if(m1.collapse2().contains("mentally"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			ScreenCapture(driver,"collapseValidate");
			Assert.assertTrue(false);
		}
		Thread.sleep(5000);
		m1.collapse3();
		if(m1.collapse3().contains("mentor"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			ScreenCapture(driver,"collapseValidate");
			Assert.assertTrue(false);
		}
		
	}

}
