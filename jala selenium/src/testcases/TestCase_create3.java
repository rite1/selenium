package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import graphql.Assert;
import pageobject.PageObject;

public class TestCase_create3 extends Base{
	
	@Test(priority=3)
	public void ValidatingWithInvalidEmail()throws InterruptedException, IOException
	{
		
		PageObject t1=new PageObject(driver);
		driver.get(url);
		t1.setUname(usn);
		t1.setPass(pwd);
		t1.btnclk();
		Thread.sleep(3000);
		t1.Regist();
		t1.fname("guddan");
		t1.lname("prasad");
		t1.mail("prasadgmail.com");
		t1.add("up");
		t1.mno("9876543210");
		t1.Dob();
		t1.gender();
		String s=Integer.toString(1);
		t1.country(s);
		Thread.sleep(5000);
		String s1=Integer.toString(10);
		t1.city(s1);
		Thread.sleep(5000);
		t1.skill("AWS");
		t1.save();
		Thread.sleep(5000);
		String m=t1.msg3();
		
		
		if(m.equals("Please Enter Valid Email Address"))
		{
			System.out.println("passed");
			Assert.assertTrue(true);
		}
		else
		{
			
			System.out.println("fail");
			ScreenCapture(driver,"ValidatingWithInvalidEmail");
			Assert.assertTrue(false);
		}
		
		Thread.sleep(3000);
		
	}
}
