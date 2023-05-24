package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.ImagePage;
import pageobject.PopUpPage;

@Test
public class Testcase_image1 extends Base {
		
	
	public void validateimageUpload()throws InterruptedException, IOException{
		ImagePage m2=new ImagePage(driver);
		driver.get(url);
		
		m2.setUname(usn);
		m2.setPass(pwd);
		m2.btnclk();
		Thread.sleep(8000);
		m2.More();
		m2.imageOption();
		Thread.sleep(5000);
		m2.chooseFile("C://Users//Public//Pictures//Sample Pictures//Desert.jpg");
		
		m2.upload();
		Thread.sleep(8000);
		String m=m2.toast();
		System.out.print(m);
		if(m.equals("uploaded Succesfully"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			ScreenCapture(driver,"validateimageUpload");
			Assert.assertTrue(false);
		}
}
}