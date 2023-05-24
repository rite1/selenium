package testcases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import graphql.Assert;
import pageobject.LoginPage;

public class Testcase_login5 extends Base{
@Test
	public void WrongEmail() throws InterruptedException, IOException
	{
		LoginPage l1=new LoginPage(driver);
		driver.get(url);
		l1.setUname("Abc@gmail.com");
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
			ScreenCapture(driver,"WrongEmail");
			
			Assert.assertTrue(false);
		}
	}
	
	
}
