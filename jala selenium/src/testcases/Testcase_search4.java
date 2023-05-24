package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.SearchPage;

@Test
public class Testcase_search4 extends Base {
	public void validatingAddEmploye() throws InterruptedException, IOException {
		SearchPage k1=new SearchPage(driver);
		driver.get(url);
		
		k1.setUname(usn);
		k1.setPass(pwd);
		k1.btnclk();
		Thread.sleep(5000);
		k1.Empl();
		k1.addEmpl();
		if(driver.getTitle().equals("Create Employee"))
		{
			System.out.println("link working");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("link not working");
			ScreenCapture(driver,"validatingAddEmploye");
			Assert.assertTrue(false);
		}
		
	}

}
