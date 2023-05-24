package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobject.LinkPage;
@Test
public class Testcase_link2 extends Base {

	public void validateBrokenLinks()throws InterruptedException, IOException{
		LinkPage m2=new LinkPage(driver);
		driver.get(url);
		
		m2.setUname(usn);
		m2.setPass(pwd);
		m2.btnclk();
		
		Thread.sleep(8000);
		m2.More();
		m2.linkMenu();
		int response=m2.brokenLinks();
		if(response>=400)
		{
			
			System.out.println("broken Link");
			ScreenCapture(driver,"validateBrokenLinks");
		}
		else
		{
			
			System.out.println("Valid Link");
		}
}
}