package testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.PageObject;

public class Testcase_create2 extends Base{

	 @Test(priority=0)
	public void validating_WithoutDetails() throws InterruptedException, IOException 
	{
		driver.get(url);
		PageObject t1=new PageObject(driver);
		t1.setUname(usn);
		t1.setPass(pwd);
		t1.btnclk();
		Thread.sleep(3000);
		t1.Regist();
		
		t1.save();
		String p=t1.msg2();
		if(p.equals("Please fill all the required field first"))
		{
			System.out.println("passed");
		}
		else
		{
			ScreenCapture(driver,"validating_WithoutDetails");
			System.out.println("fail");
		}
		
		Thread.sleep(3000);
		
		
		

	}

}
