package testcases;


import java.io.IOException;

import org.testng.annotations.Test;

import graphql.Assert;
import pageobject.sliderPage;
@Test
public class TestCase_slider2 extends Base{
	
	
	
		
		
		public void validateAllLinkssliderpage()throws InterruptedException, IOException{
		sliderPage m2=new sliderPage(driver);
		driver.get(url);
		m2.setUname(usn);
		m2.setPass(pwd);
		m2.btnclk();
		Thread.sleep(5000);
		m2.More();
		m2.slider();
		Thread.sleep(3000);
		m2.logoutlink();;
		if(driver.getTitle().equals("Login"))
		{
			System.out.println("pass");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("fail");
			ScreenCapture(driver,"validateAllLinkssliderpage");
			Assert.assertTrue(false);
		}
		
		
		}

}
