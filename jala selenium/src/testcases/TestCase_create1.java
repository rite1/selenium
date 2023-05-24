 package testcases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.PageObject;

public class TestCase_create1 extends Base {
	@Test
	public void Reg() throws InterruptedException, IOException
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
		t1.mail("prasad@gmail.com");
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
		String msg=t1.msg1();
		Thread.sleep(5000);
		if(msg.equals("Employee details saved successfully"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			ScreenCapture(driver,"Reg");
			Assert.assertTrue(false);
		}
		
		
	}	

}
