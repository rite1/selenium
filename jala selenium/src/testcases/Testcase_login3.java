package testcases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import graphql.Assert;
import pageobject.LoginPage;

public class Testcase_login3 extends Base{
	@Test
	public void WithoutPassword() throws InterruptedException, IOException
	{
		LoginPage l1=new LoginPage(driver);
		driver.get(url);
		l1.setUname(usn);
		l1.setPass("");
		l1.btnclk();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(10000);
		String sa=l1.msg();
		
		System.out.print(sa);
		
		if(sa.equals("Error!"))
		{
			
			Assert.assertTrue(true);
			
		}
		else
		{
			ScreenCapture(driver,"WithoutPassword");
			Assert.assertTrue(false);
		}
	}
}
