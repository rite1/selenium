package testcases;

import org.testng.annotations.Test;

import graphql.Assert;
import pageobject.PopUpPage;
import pageobject.sliderPage;
@Test
public class Testcase_popup1 extends Base {

	
	public void validatePop()throws InterruptedException{
		PopUpPage m2=new PopUpPage(driver);
		driver.get(url);
		
		m2.setUname(usn);
		m2.setPass(pwd);
		m2.btnclk();
		Thread.sleep(5000);
		m2.More();
		m2.popUpMenu();
		Thread.sleep(5000);
		
		m2.popUpButton();
		
}
}