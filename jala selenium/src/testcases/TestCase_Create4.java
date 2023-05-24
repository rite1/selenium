package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import graphql.Assert;
import pageobject.PageObject;

public class TestCase_Create4 extends Base {
	@Test(priority=2)
	public void invalidmo() throws InterruptedException, IOException
	{
	PageObject t3=new PageObject(driver);
	driver.get(url);
	t3.setUname(usn);
	t3.setPass(pwd);
	t3.btnclk();
	Thread.sleep(3000);
	t3.Regist();
	t3.fname("guddan");
	t3.mail("prasad@gmail.com");
	t3.add("up");
	t3.mno("9876");
	t3.Dob();
	t3.gender();
	String s=Integer.toString(1);
	t3.country(s);
	Thread.sleep(5000);
	String s1=Integer.toString(10);
	t3.city(s1);
	Thread.sleep(5000);
	t3.skill("AWS");
	t3.save();
	String m=t3.msg3();
	Thread.sleep(5000);
	
	if(m.equals("Valid Mobile number Should Be Given"))
	{
		System.out.println("passed");
		Assert.assertTrue(true);
	}
	else
	{
		ScreenCapture(driver,"invalidmo");
		System.out.println("fail");
		Assert.assertTrue(false);
	}
	
	Thread.sleep(3000);
}
}
