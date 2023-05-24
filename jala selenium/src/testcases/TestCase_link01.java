package testcases;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Durations;
import graphql.Assert;
import javafx.util.Duration;
import pageobject.LinkPage;
import pageobject.TooltipsPage;
@Test
public class TestCase_link01 extends Base{

	
	public void validateLinks()throws InterruptedException{
		LinkPage m2=new LinkPage(driver);
		driver.get(url);
		
		m2.setUname(usn);
		m2.setPass(pwd);
		m2.btnclk();
		
		Thread.sleep(8000);
		m2.More();
		//m2.linkMenu();
		
		Thread.sleep(5000);
		m2.link1();
		
		
		}
}
