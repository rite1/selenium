package pageobject;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

import testcases.Base;

public class IFramesPage  extends Base{

		WebDriver pdriver;
			String parent;
			
			

			public IFramesPage(WebDriver driver1) {
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
			
			@FindBy(xpath="//body[1]/div[2]/aside[1]/section[1]/ul[1]/li[3]/ul[1]/li[11]/a[1]") 
			WebElement iframemenu;
			
			@FindBy(id="iframe1") 
			WebElement frame1;
			
			@FindBy(id="iframe2") 
			WebElement frame2;
			
			@FindBy(id="iframe3") 
			WebElement frame3;
			
			@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[1]/a[1]")
			WebElement link;
			
			//@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/h3[1]")
			//WebElement text;
			
			
			
			@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
			WebElement Brokenlinkmenu;
			@FindBy(xpath="//span[@class='hidden_xs']")
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
			public void iframeMenu() throws InterruptedException
			{
				
				iframemenu.click();
				
				Thread.sleep(5000);
				
			}
			
			
			public void frame() throws InterruptedException
			{
				String parent=pdriver.getWindowHandle();
				String s=frame1.getText();
				
				System.out.print(s);
				
				pdriver.switchTo().frame(frame2);
				link.click();
				Set <String> windows=pdriver.getWindowHandles();
				for(String windowchild:windows)
				{
					pdriver.switchTo().window(windowchild);
					if(pdriver.getTitle().equals("JALA Academy - Anyone Can become a Software Engineer"))
					{
						pdriver.close();
					}
					
					break;
				}
				pdriver.switchTo().window(parent);
				pdriver.switchTo().frame(frame3);
				frame3.getText();
				//System.out.print(st);
			}
				
				//String child2=windowlist.get(1);
				
				
			}

