package testcases;



import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
 


import graphql.Assert;
import pageobject.LoginPage;



public class Testcase_login2 extends Base{
	@Test
	public void WithoutUsername() throws InterruptedException, IOException
	{
		
		driver.get(url);
		LoginPage l1=new LoginPage(driver);
		l1.setUname("");
		l1.setPass(pwd);
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
			ScreenCapture(driver,"WithoutUsername");
			Assert.assertTrue(false);
			
		}
	}

	

	
}
