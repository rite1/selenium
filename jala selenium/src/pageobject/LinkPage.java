package pageobject;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import testcases.*;
public class LinkPage extends Base{

WebDriver pdriver;
	
	
	

	public LinkPage(WebDriver driver1) {
		pdriver=driver1;
		PageFactory.initElements(driver1, this);
}


	
	@FindBy(id="UserName")
	WebElement txtuser;
	@FindBy(xpath="//body[1]/div[2]/aside[1]/section[1]/ul[1]/li[3]/ul[1]/li[5]/a[1]")
	WebElement imageoption;
	@FindBy(id="Password")
	WebElement txtpassword;
	@FindBy(id="btnLogin")
	WebElement btn;
	@FindBy(xpath="//body[1]/div[2]/aside[1]/section[1]/ul[1]/li[3]/a[1]")  
	WebElement More;
	
	@FindBy(id="file") 
	WebElement choose;
	
	@FindBy(xpath="//body[1]/div[2]/aside[1]/section[1]/ul[1]/li[3]/ul[1]/li[9]/a[1]") 
	WebElement linkmenu;
	
	@FindBy(linkText="Link 1") 
	WebElement link1;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]") 
	WebElement link2;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[3]")
	WebElement link3;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	WebElement Brokenlinkmenu;
	
	@FindBy(xpath="//body[1]/div[3]/header[1]/nav[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")
	WebElement logoutlink;
	
	
	public void logoutlink()
	{
		logoutlink.click();
	}
	//String parent;
	public void setUname(String unames)
	{
		txtuser.sendKeys(unames);
		
		
	}
	
	public void setPass(String pwd)
	{
		txtpassword.sendKeys(pwd);
		
	}
	public void btnclk()
	{
		btn.click();
	}
	public void More() throws InterruptedException
	{
		
		More.click();
		Thread.sleep(5000);
	}
	public void linkMenu()
	{
		linkmenu.click();
	}
	public void link1() throws InterruptedException
	{
		
		linkmenu.click();
		String parent=pdriver.getWindowHandle();
	//	String pp=pdriver.switchTo().window(parent).getTitle();
		
	//	System.out.println(pp);
		
		link3.click();
		
		
		link1.click();
		
		link2.click();
		
		
		
		
		
		Set <String> windows=pdriver.getWindowHandles();
		System.out.println(windows.size());
		
		
		
				
			Iterator<String> it=windows.iterator();
			String parent1=it.next();
			System.out.println(pdriver.getTitle());
			while(it.hasNext())
			{
			
			String child=it.next();
			pdriver.switchTo().window(child);
			//WebDriverWait wait1=new WebDriverWait(pdriver,Duration.ofSeconds(20));
			//wait1.until(ExpectedConditions.titleContains(pdriver.getTitle()));
			//System.out.println("child" +child);
		   System.out.println(pdriver.getTitle());
			
			
			if(pdriver.getTitle().equals("Google"))
			{
				pdriver.close();
				break;
			}
			}
			while(it.hasNext())
			{
			
			String child=it.next();
			pdriver.switchTo().window(child);
			
		   System.out.println(pdriver.getTitle());
			
			if(pdriver.getTitle().equals("Workinglinks.co.uk – A job, employment, work and occupation"))
			{
				
				pdriver.close();
				break;
			}
			}
			
		
			
			while(it.hasNext())
			{
			
			String child=it.next();
			pdriver.switchTo().window(child);
			//WebDriverWait wait1=new WebDriverWait(pdriver,Duration.ofSeconds(20));
			//wait1.until(ExpectedConditions.titleContains(pdriver.getTitle()));
			//System.out.println("child" +child);
		   System.out.println(pdriver.getTitle());
			if(pdriver.getTitle().equals("JALA Academy-Singapore and India"))
			{
				pdriver.close();
				break;
			}
			}
			
		pdriver.switchTo().window(parent);
	
	}
			
			
						
			
			
			//pdriver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
			//pdriver.switchTo().window(parent);
			
		
			
		
		
		
		//pdriver.close();
		
		
		
	
	
	public int brokenLinks() throws IOException
	{
		int rescode = 0;
		Brokenlinkmenu.click();
		List <WebElement>links=pdriver.findElements(By.xpath("//a[@href='www.brokenlinkcheck.com/']"));
		List<String> urlList=new ArrayList<String>();
		System.out.println(links.size());
		for(WebElement e:links)
		{
			
			String url=e.getAttribute("href");
			urlList.add(url);
			URL link=new URL(url);
			
			URLConnection httpConn=(HttpURLConnection) link.openConnection();
			httpConn.connect();
				rescode=((HttpURLConnection) httpConn).getResponseCode();
				
		}
		return rescode;
	}
	
		
	
	
		
	
	}	
	
	
	
	

