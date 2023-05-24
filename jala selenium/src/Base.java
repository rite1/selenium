import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class Base {

	public WebDriver driver;
	public String driverpth;
	public String url;
	public String usn;
	public String pwd;
	public String fname;
	public String lname;
	public String email;
	public String mob;
	public String address;
	String emailwrong;
	String wrongmob;
	@BeforeClass
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
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
	}
	
	
	@AfterClass
	public void exit()
	{
		driver.close();
	}
	
	
	

}


