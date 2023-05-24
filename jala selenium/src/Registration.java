import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
				
									
									//Reg3 r1=new Reg3();
									
								//	r1.validating_reglink();
								//	Reg2 r2=new Reg2();
								//	r2.valditing_ByProvidingAllDet();
								//	Reg3 r3=new Reg3();
								//	r3.validatingWithoutCredential();
								//	Reg4 r4=new Reg4();
								//	r4.valditing_ByProvidingInvalidEmail();
									
									Reg5 r5=new Reg5();
									r5.valditing_ByProvidingInvalidMobNumber();
								
		
						}	
		}	
	class log
	{
		public WebDriver driver=null;
		void setup()
		{
		System.setProperty("webdriver.chrome.driver","E://IMP document//eclipse-workspace//selenium web//driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		}
		public void login() throws InterruptedException
		{
			driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
			driver.findElement(By.id("Password")).sendKeys("jobprogram");
			driver.findElement(By.id("btnLogin")).click();
			
				
			
		}
			
			
		
		void quit()
		{
			driver.close();
		}
		
	}
	
class Reg1
{
	
	
	public void validating_reglink() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E://IMP document//eclipse-workspace//selenium web//driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
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
	driver.quit();
	}
	
}
class Reg2
{
	public void valditing_ByProvidingAllDet() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","E://IMP document//eclipse-workspace//selenium web//driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
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
	driver.findElement(By.id("FirstName")).sendKeys("saahil");
	driver.findElement(By.id("LastName")).sendKeys("Kumar");
	driver.findElement(By.id("EmailId")).sendKeys("saahil@gmail.com");
	driver.findElement(By.id("MobileNo")).sendKeys("1234567898");
	driver.findElement(By.id("DOB")).click();
	driver.findElement(By.xpath("//td[contains(text(),'19')]")).click();
	driver.findElement(By.id("rdbMale")).click();
	driver.findElement(By.id("Address")).sendKeys("ameerpet");
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
	}
	else
	{
		System.out.println("Fail");
	}
driver.quit();
	}
	//String ss=driver.g
	
	}
class Reg3
{
	
	public void validatingWithoutCredential() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","E://IMP document//eclipse-workspace//selenium web//driver//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://magnus.jalatechnologies.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
	driver.findElement(By.id("Password")).sendKeys("jobprogram");
	driver.findElement(By.id("btnLogin")).click();
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
	}
	else
	{
		System.out.println("fail");
	}
	}
}

class Reg4
{
	public void valditing_ByProvidingInvalidEmail() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","E://IMP document//eclipse-workspace//selenium web//driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
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
	driver.findElement(By.id("FirstName")).sendKeys("saahil");
	driver.findElement(By.id("LastName")).sendKeys("Kumar");
	driver.findElement(By.id("EmailId")).sendKeys("saahilgmail.com");
	driver.findElement(By.id("MobileNo")).sendKeys("1234567898");
	driver.findElement(By.id("DOB")).click();
	driver.findElement(By.xpath("//td[contains(text(),'19')]")).click();
	driver.findElement(By.id("rdbMale")).click();
	driver.findElement(By.id("Address")).sendKeys("ameerpet");
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
	
	
if(sk.equals("Please fill valid Details"))
	{
		
		System.out.println("Success and passed");
	}
	else
	{
		System.out.println("failed Message Toast is not showing Proper message");
		
	}
driver.quit();
	}   
	
}
class Reg5
{
	public void valditing_ByProvidingInvalidMobNumber() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","E://IMP document//eclipse-workspace//selenium web//driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
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
	driver.findElement(By.id("FirstName")).sendKeys("saahil");
	driver.findElement(By.id("LastName")).sendKeys("Kumar");
	driver.findElement(By.id("EmailId")).sendKeys("saahil@gmail.com");
	driver.findElement(By.id("MobileNo")).sendKeys("1234567");
	driver.findElement(By.id("DOB")).click();
	driver.findElement(By.xpath("//td[contains(text(),'19')]")).click();
	driver.findElement(By.id("rdbMale")).click();
	driver.findElement(By.id("Address")).sendKeys("ameerpet");
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
	}
	else
	{
		System.out.println("failed Message Toast is not showing Proper message");
		
	}
		driver.quit();
	}  
	
	
	
}

	
