package testcases;

import org.testng.annotations.Test;

import pageobject.PageObject;

public class Testcase_Create7 extends Base {
	@Test
	public void validExistingEmployee() throws InterruptedException
	{
	PageObject t5=new PageObject(driver);
	driver.get(url);
	t5.setUname(usn);
	t5.setPass(pwd);
	t5.btnclk();
	Thread.sleep(3000);
	t5.Regist();
	t5.fname("guddan");
	t5.lname("prasad");
	t5.mail("sairam9062@gmail.com");
	t5.add("up");
	t5.mno("9876543210");
	t5.Dob();
	t5.gender();
	String s=Integer.toString(1);
	t5.country(s);
	Thread.sleep(3000);
	//String s1=Integer.toString(10);
	//t5.city(s1);
	t5.otherCity("nagpur");
	Thread.sleep(5000);
	t5.skill("AWS");
	t5.save();
	
	}
	
}
