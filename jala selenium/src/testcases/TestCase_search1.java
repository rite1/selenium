package testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import graphql.Assert;
import pageobject.SearchPage;

public class TestCase_search1 extends Base {
	@Test
	public void Searchname() throws InterruptedException, IOException
	{
		SearchPage k1=new SearchPage(driver);
		driver.get(url);
		
		k1.setUname(usn);
		k1.setPass(pwd);
		
		
		
		
		k1.btnclk();
		Thread.sleep(5000);
		k1.Empl();
		String dummyname="saahil";
		String sn=k1.search(dummyname);
	//	System.out.print(sn);
		if(sn.equals(dummyname))
		{
			Assert.assertTrue(true);
		}
		else
		{
			ScreenCapture(driver,"Searchname");
			Assert.assertTrue(false);
		}
	}
}