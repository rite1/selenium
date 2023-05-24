package testcases;

import org.testng.annotations.Test;

import graphql.Assert;
import pageobject.SearchPage;
@Test
public class Testcase_search6 extends Base{
	
	
	public void ValidationPagination() throws InterruptedException
	{
		SearchPage k1=new SearchPage(driver);
		driver.get(url);
		  
		k1.setUname(usn);
		k1.setPass(pwd);
		
		k1.btnclk();
		Thread.sleep(5000);
		k1.Empl();
		k1.table();
		
	}
}
		
	


