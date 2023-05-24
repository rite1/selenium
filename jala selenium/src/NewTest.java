import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver=null;
	String driverpth;
	String url;
	String usn;
	String pwd;
	String fname;
	String lname;
	String email;
	String mob;
	String address;
	String emailwrong;
	String wrongmob;
	@BeforeMethod
	public void setup() throws InterruptedException, FileNotFoundException
	{
		Properties pro=new Properties();
		FileInputStream f=new FileInputStream("E://IMP document//eclipse-workspace//jala selenium//config.properties");
		try {
			pro.load(f);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		driverpth=pro.getProperty("path");
		url=pro.getProperty("url");
		usn=pro.getProperty("usn");
		pwd=pro.getProperty("pwd");
		fname=pro.getProperty("fname");
		lname=pro.getProperty("lname");
		mob=pro.getProperty("mo");
		address=pro.getProperty("address");
		email=pro.getProperty("email");
		emailwrong=pro.getProperty("emailwrong");
		wrongmob=pro.getProperty("wrongmo");
		System.setProperty("webdriver.chrome.driver",driverpth);
		
		 driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("UserName")).sendKeys(usn);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		
	}
	
  @Test()
  public void create() {

			
			//Thread.sleep(3000);
		List<WebElement> le=driver.findElements(By.xpath("//ul[@id='MenusDashboard']//li"));
		System.out.println(le.size());

		for(WebElement i:le)
		{	
			try
			{
					if(i.getText().equals("Employee"))
					{
						i.click();
					}
					if(i.getText().equals("Create"))
					{
						i.click();
					}
			}
			catch(Exception e)
			{
				
			}
			
		}
		String str=driver.getTitle();
		
		if(str.equals("Create Employee"))
		{
			Assert.assertTrue(true);
			System.out.println("Validation Succesful");
		}
			else
			{
				Assert.assertTrue(false);
			}
		
		}
  @Test(priority=1)
  public void valditing_ByProvidingAllDet() throws InterruptedException
	{
		
		Thread.sleep(3000);
	List<WebElement> le=driver.findElements(By.xpath("//ul[@id='MenusDashboard']//li"));
	System.out.println(le.size());

	for(WebElement i:le)
	{	
		try
		{
				if(i.getText().equals("Employee"))
				{
					i.click();
				}
				if(i.getText().equals("Create"))
				{
					i.click();
				}
		}
		catch(Exception e)
		{
			
		}
		
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("FirstName")).sendKeys(fname);
	driver.findElement(By.id("LastName")).sendKeys(lname);
	driver.findElement(By.id("EmailId")).sendKeys(email);
	driver.findElement(By.id("MobileNo")).sendKeys(mob);
	driver.findElement(By.id("DOB")).click();
	driver.findElement(By.xpath("//td[contains(text(),'19')]")).click();
	driver.findElement(By.id("rdbMale")).click();
	driver.findElement(By.id("Address")).sendKeys(address);
	WebElement country=driver.findElement(By.id("CountryId"));
	Select select=new Select(country);
	select.selectByValue("1");
	
	WebElement city=driver.findElement(By.id("CityId"));
	Select select1=new Select(city);
	select1.selectByValue("7");
	//driver.findElement(By.xpath("//body/div[3]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[4]/div[3]/label[1]/span[1]")).click();
	
	driver.findElement(By.id("chkSkill_5")).click();
	driver.findElement(By.id("chkSkill_1")).click();
	
	
	//
	driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	Thread.sleep(10000);
	driver.navigate().back();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("toast-message")));
	//driver.ex
	String sk=driver.findElement(By.className("toast-title")).getText();
	String sk1=driver.findElement(By.className("toast-message")).getText();
	System.out.println(sk);
	System.out.println(sk1);
	
if(sk.equals("Employee details saved successfully"))
	{
		
		System.out.println("Success added");
		Assert.assertTrue(true);
	}
	else
	{
		System.out.println("Fail");
		Assert.assertTrue(false);
	}

	}
  
  
  
  
  
  @Test
  public void validatingWithoutCredential() throws InterruptedException
	{
	
	
	
	
	Thread.sleep(3000);
	List<WebElement> le=driver.findElements(By.xpath("//ul[@id='MenusDashboard']//li"));
	System.out.println(le.size());

	for(WebElement i:le)
	{	
		try
		{
				if(i.getText().equals("Employee"))
				{
					i.click();
				}
				if(i.getText().equals("Create"))
				{
					i.click();
				}
		}
		catch(Exception e)
		{
			
		}
		
	}
	driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	String msg=driver.findElement(By.xpath("//div[contains(text(),'Please fill all the required field first')]")).getText();
	System.out.println(msg);
	if(msg.equals("Please fill all the required field first"))
	{
		System.out.println("pass");
		Assert.assertTrue(true);
	}
	else
	{
		System.out.println("fail");
		Assert.assertFalse(false);
	}
	}
  @Test
  public void valditing_ByProvidingInvalidEmail() throws InterruptedException
	{
		
		Thread.sleep(3000);
	List<WebElement> le=driver.findElements(By.xpath("//ul[@id='MenusDashboard']//li"));
	System.out.println(le.size());

	for(WebElement i:le)
	{	
		try
		{
				if(i.getText().equals("Employee"))
				{
					i.click();
				}
				if(i.getText().equals("Create"))
				{
					i.click();
				}
		}
		catch(Exception e)
		{
			
		}
		
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("FirstName")).sendKeys(fname);
	driver.findElement(By.id("LastName")).sendKeys(lname);
	driver.findElement(By.id("EmailId")).sendKeys(emailwrong);
	driver.findElement(By.id("MobileNo")).sendKeys(mob);
	driver.findElement(By.id("DOB")).click();
	driver.findElement(By.xpath("//td[contains(text(),'19')]")).click();
	driver.findElement(By.id("rdbMale")).click();
	driver.findElement(By.id("Address")).sendKeys(address);
	WebElement country=driver.findElement(By.id("CountryId"));
	Select select=new Select(country);
	select.selectByValue("1");
	
	WebElement city=driver.findElement(By.id("CityId"));
	Select select1=new Select(city);
	select1.selectByValue("7");
	//driver.findElement(By.xpath("//body/div[3]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[4]/div[3]/label[1]/span[1]")).click();
	
	driver.findElement(By.id("chkSkill_5")).click();
	driver.findElement(By.id("chkSkill_1")).click();
	
	
	//
	driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	Thread.sleep(5000);
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("toast-message")));
	//driver.ex
	String sk=driver.findElement(By.className("toast-title")).getText();
	String sk1=driver.findElement(By.className("toast-message")).getText();
	
	
if(sk.equals("Please fill valid Details"))
	{
		
		System.out.println("Valid Detail Success and passed");
		Assert.assertTrue(true);
	}
	else
	{
		System.out.println("failed Message Toast is not showing Proper message");
		Assert.assertTrue(false);
	}

	}   
  @Test
  public void valditing_ByProvidingInvalidMobNumber() throws InterruptedException
	{
	
		Thread.sleep(3000);
	List<WebElement> le=driver.findElements(By.xpath("//ul[@id='MenusDashboard']//li"));
	System.out.println(le.size());

	for(WebElement i:le)
	{	
		try
		{
				if(i.getText().equals("Employee"))
				{
					i.click();
				}
				if(i.getText().equals("Create"))
				{
					i.click();
				}
		}
		catch(Exception e)
		{
			
		}
		
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("FirstName")).sendKeys(fname);
	driver.findElement(By.id("LastName")).sendKeys(lname);
	driver.findElement(By.id("EmailId")).sendKeys(email);
	driver.findElement(By.id("MobileNo")).sendKeys(wrongmob);
	driver.findElement(By.id("DOB")).click();
	driver.findElement(By.xpath("//td[contains(text(),'19')]")).click();
	driver.findElement(By.id("rdbMale")).click();
	driver.findElement(By.id("Address")).sendKeys(address);
	WebElement country=driver.findElement(By.id("CountryId"));
	Select select=new Select(country);
	select.selectByValue("1");
	
	WebElement city=driver.findElement(By.id("CityId"));
	Select select1=new Select(city);
	select1.selectByValue("7");
	//driver.findElement(By.xpath("//body/div[3]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[4]/div[3]/label[1]/span[1]")).click();
	
	driver.findElement(By.id("chkSkill_5")).click();
	driver.findElement(By.id("chkSkill_1")).click();
	
	
	//
	driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	Thread.sleep(10000);
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("toast-message")));
	//driver.ex
	String sk=driver.findElement(By.className("toast-title")).getText();
	String sk1=driver.findElement(By.className("toast-message")).getText();
	
	
if(sk.equals("Please fill valid Mobile Number"))
	{
		
		System.out.println("Success and passed");
		Assert.assertTrue(true);
	}
	else
	{
		System.out.println("failed Message Toast is not showing Proper message");
		Assert.assertTrue(false);
	}
		
	} 
  @AfterMethod
  public void Exit()
  {
	  driver.quit();
  }
  }

