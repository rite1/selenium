package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.Autocomplete;
import pageobject.MenuPage;
@Test
public class Testcase_menuauto1 extends Base{
			
	public void validatingTestSubmenu() throws InterruptedException
	{
		Autocomplete m1=new Autocomplete(driver);
		//LoginPage l1=new LoginPage(driver);
		driver.get(url);
		m1.setUname(usn);
		m1.setPass(pwd);
		m1.btnclk();
		Thread.sleep(8000);
		m1.More();
		m1.Autocomplete();
		m1.singlevalue();
		m1.singletext("all is well");
		Thread.sleep(8000);
		m1.multiplevalue();
		m1.multipletext("johnny johnny yes papa");
		
		
		
		
	}		
			
			
			
		
	

}
