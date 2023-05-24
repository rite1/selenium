package testcases;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import utilities.ReadConfig;

public class Base {
	ReadConfig conf=new ReadConfig();
	public WebDriver driver;
	String driverpth=conf.getChrome();
	public String url=conf.getApllUrl();
	String usn=conf.getusn();
	String pwd=conf.getpassword();
	protected String Parent;
	public  static Logger logger;
	
	@BeforeClass
	public void setup() throws InterruptedException, FileNotFoundException
	{
		
		System.setProperty("webdriver.chrome.driver",driverpth);
		
		 driver=new ChromeDriver();
		logger=Logger.getLogger("magnus");
		PropertyConfigurator.configure("log4j.properties");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
	}
	public void ScreenCapture(WebDriver driver,String testname)throws IOException
	{
		
		
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File target=new File(System.getProperty("user.dir")+"/screenshots/"+testname+".jpg");
	FileUtils.copyFile(source,target);
		System.out.println("Screenshot taken");
	}
	
	@AfterClass
	public void exit()
	{
		driver.close();
		
	}

}


