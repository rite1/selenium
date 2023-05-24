package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobject.IFramesPage;
import pageobject.LinkPage;
@Test
public class Testcase_frame1 extends Base{
	
	public void validateiframe()throws InterruptedException, IOException{
		IFramesPage m2=new IFramesPage(driver);
		driver.get(url);
		
		m2.setUname(usn);
		m2.setPass(pwd);
		m2.btnclk();
		
		Thread.sleep(8000);
		m2.More();
		m2.iframeMenu();
		Thread.sleep(4000);
		m2.frame();
		
}

}
