package testcases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import graphql.Assert;
import pageobject.Collapsiblecontentpage;
@Test
public class Testcase_collapsemul2 extends Base{
	
	
	public void collapsablemultiple()throws InterruptedException, IOException{
	Collapsiblecontentpage m2=new Collapsiblecontentpage(driver);
	driver.get(url);
	m2.setUname(usn);
	m2.setPass(pwd);
	m2.btnclk();
	Thread.sleep(8000);
	m2.More();
	m2.collapse();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	m2.collapsemul();
	if(m2.collapsemul1().contains("Teach"))
	{
		System.out.println("pass");
		Assert.assertTrue(true);
	}
	else
	{
		System.out.println("false");
		ScreenCapture(driver,"collapsablemultiple");
		Assert.assertTrue(false);
	}
	
	
	Thread.sleep(5000);
	if(m2.collapsemul2().contains("TEACH"))
	{
		System.out.println("pass");
		Assert.assertTrue(true);
	}
	else
	{
		System.out.println("false");
		ScreenCapture(driver,"collapsablemultiple");
		Assert.assertTrue(false);
	}
	
	Thread.sleep(5000);
	if(m2.collapsemul3().contains("discipline"))
	{
		System.out.println("pass");
		Assert.assertTrue(true);
	}
	else
	{
		System.out.println("false");
		ScreenCapture(driver,"collapsablemultiple");
		Assert.assertTrue(false);
	}
	
	}
}
