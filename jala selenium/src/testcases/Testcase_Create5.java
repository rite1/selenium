package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import graphql.Assert;
import pageobject.PageObject;

public class Testcase_Create5 extends Base{
	@Test
public void verifyCancel() throws InterruptedException, IOException
{
	PageObject t4=new PageObject(driver);
	driver.get(url);
	t4.setUname(usn);
	t4.setPass(pwd);
	t4.btnclk();
	Thread.sleep(3000);
	t4.Regist();
	t4.fname("guddan");
	t4.lname("prasad");
	t4.mail("prasad@gmail.com");
	t4.add("up");
	t4.mno("9876543210");
	t4.Dob();
	t4.gender();
	String s=Integer.toString(1);
	t4.country(s);
	Thread.sleep(5000);
	String s1=Integer.toString(10);
	t4.city(s1);
	Thread.sleep(5000);
	t4.skill("AWS");
	t4.cancel();
	if(driver.getTitle().equals("Create Employee"))
	{
		Assert.assertTrue(true);
	}
	else
	{
		ScreenCapture(driver,"verifyCancel");
		Assert.assertTrue(false);
	}
}
}
