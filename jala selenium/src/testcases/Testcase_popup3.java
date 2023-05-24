package testcases;



import java.io.IOException;

import org.testng.annotations.Test;

import graphql.Assert;
import pageobject.PopUpPage;
@Test
public class Testcase_popup3 extends Base {
	
	@Test
	public void validateAllLinkspopup()throws InterruptedException, IOException{
		PopUpPage m2=new PopUpPage(driver);
		driver.get(url);
		//logger.info("url is opened");
		m2.setUname(usn);
//	logger.info(" enter username");
		m2.setPass(pwd);
//	logger.info(" enter password");
		m2.btnclk();
		Thread.sleep(8000);
		
		m2.More();
		m2.popUpMenu();
		Thread.sleep(3000);
		m2.logoutlink();
		if(driver.getTitle().equals("Login"))
		{
			System.out.println("pass");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("fail");
			ScreenCapture(driver,"validateAllLinkspopup");
			Assert.assertTrue(false);
		}

}
}