package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import graphql.Assert;
import pageobject.SearchPage;
@Test
public class TestCase_search3 extends Base {
	
	public void SearchwithMobile() throws InterruptedException, IOException
	{
		SearchPage k1=new SearchPage(driver);
		driver.get(url);
		
		k1.setUname(usn);
		k1.setPass(pwd);
		k1.btnclk();
		Thread.sleep(5000);
		k1.Empl();
		String dummobile="0736844292";
		String sn=k1.searchBymobile(dummobile).trim();
		System.out.print(sn);
		Thread.sleep(3000);
		if(sn.equals(dummobile))
		{
			System.out.print(" Available");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.print("Not Available");
			ScreenCapture(driver,"SearchwithMobile");
			Assert.assertTrue(false);
		}
	}
	

}
