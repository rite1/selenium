package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import graphql.Assert;
import pageobject.SearchPage;

@Test
public class TestCase_search2 extends Base{
	public void SearchwithoutExistName() throws InterruptedException, IOException
	{
		SearchPage k1=new SearchPage(driver);
		driver.get(url);
		
		k1.setUname(usn);
		k1.setPass(pwd);
		
		
		
		
		k1.btnclk();
		Thread.sleep(5000);
		k1.Empl();
		String dummyname="sarohar";
		String sn=k1.search(dummyname);
		System.out.print(sn);
		if(sn.equals(dummyname))
		{
			System.out.print(" Available");
			ScreenCapture(driver,"SearchwithoutExistName");
			Assert.assertTrue(false);
		}
		else
		{
			System.out.print("Not Available");
			
			Assert.assertTrue(true);
		}
	}
}
