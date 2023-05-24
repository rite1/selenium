package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.ImagePage;
@Test
public class Testcase_image2 extends Base{

	public void validateimageUploadWithoutImage()throws InterruptedException, IOException{
		ImagePage m2=new ImagePage(driver);
		driver.get(url);
		
		m2.setUname(usn);
		m2.setPass(pwd);
		m2.btnclk();
		Thread.sleep(8000);
		m2.More();
		m2.imageOption();
		Thread.sleep(5000);
		//m2.chooseFile();
		
		m2.upload();
		Thread.sleep(8000);
		String m=m2.toast();
		System.out.print(m);
		if(m.equals("Error!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			ScreenCapture(driver,"validateimageUploadWithoutImage");
			Assert.assertTrue(false);
		}
}
	
	
}
