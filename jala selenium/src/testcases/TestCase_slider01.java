package testcases;


import java.io.IOException;

import org.testng.annotations.Test;

import graphql.Assert;
import pageobject.sliderPage;
@Test
public class TestCase_slider01 extends Base{
	
	
	
		
		
		public void SliderTest()throws InterruptedException, IOException{
		sliderPage m2=new sliderPage(driver);
		driver.get(url);
		m2.setUname(usn);
		m2.setPass(pwd);
		m2.btnclk();
		Thread.sleep(8000);
		m2.More();
		m2.slider();
		Thread.sleep(5000);
		m2.sliderDrag();
		if(m2.sliderDragVal().equals("3"))
		{
			Assert.assertTrue(false);
		}
		else
		{
			ScreenCapture(driver,"SliderTest");
			Assert.assertTrue(true);
		}
		
		
		}

}
