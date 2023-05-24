import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import graphql.Assert;

public class NewTestng  
{
	WebDriver driver= null;
	@Parameters({"browser"})
	@BeforeMethod(groups={"sanity"})
	public void setup(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E://IMP document//eclipse-workspace//selenium web//driver//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E://IMP document//eclipse-workspace//selenium web//driver//geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get("https://magnus.jalatechnologies.com/");
		System.out.println("Before Method");
		String title=driver.getTitle();
		
			Assert.assertFalse(title.equals("jala"));
			System.out.println("Thread "+Thread.currentThread().getId());
		
	}
  @Test(groups={"regression"},priority=2,invocationCount=3)
  public void login()throws IOException {
	  
	  driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("Test Method");
		System.out.println("Thread "+Thread.currentThread().getId());
		
  }
  @Test(enabled=false)
  public void testcase2()
  {
	  System.out.println("this is Testcase2");
	  System.out.println("Thread "+Thread.currentThread().getId());
  }
  
  @Test(priority=1,groups={"regression"})
  public void testcase3()
  {
	  System.out.println("this is Testcase3");
	  System.out.println("Thread "+Thread.currentThread().getId());
  }
  
  @AfterMethod(groups={"regression"})
  public void closeBrowser()
  {
	  System.out.println("After Method");
	  System.out.println("Thread "+Thread.currentThread().getId());
	  driver.close();
  }
}
