package pageobject;
import testcases.*;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.util.Strings;

import com.google.common.io.Files;

import graphql.Assert;
@Test
public class PageObject extends Base {
	WebDriver pdriver;
	
			
			

			public PageObject(WebDriver driver1) {
				pdriver=driver1;
				PageFactory.initElements(driver1, this);
	}


			
			@FindBy(id="UserName")
			WebElement txtuser;
			@FindBy(id="Password")
			WebElement txtpassword;
			@FindBy(id="FirstName")
			WebElement txtfname;
			@FindBy(id="LastName")
			WebElement lname;
			@FindBy(id="EmailId")
			WebElement email;
			@FindBy(id="MobileNo")
			WebElement mob;
			@FindBy(id="Address")
			WebElement add;
			@FindBy(id="btnLogin")
			WebElement btn;
			@FindBy(id="DOB")
			WebElement Dob;
			@FindBy(xpath="//td[contains(text(),'19')]")
			WebElement Dob1;
			@FindBy(id="rdbMale")
			WebElement gender;
			@FindBy(id="CountryId")
			WebElement country;
			@FindBy(id="CityId")
			WebElement city;
			
			@FindBy(xpath="//button[contains(text(),'Save')]")
			WebElement save;
			@FindBy(xpath="//button[contains(text(),'Save')]")
			WebElement register;
			@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/div[1]/form[1]/div[2]/a[1]")
			WebElement cancel;
			@FindBy(className="checkmark")
			WebElement other;
			@FindBy(id="OtherCity")
			WebElement Othercity;
			
			
			
			@FindBy(xpath="//li[@id='liNext_EmployeeGrid']//a")
			WebElement tablenext;
			@FindBy(xpath="//li[@class='page-item disabled']//a")
			WebElement tablelast;
			@FindBy(xpath="//body[1]/div[3]/aside[1]/section[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
			WebElement search;
			@FindBy(xpath="//span[@class='hidden_xs']")
			WebElement logoutlink;
			
			String em;
			
			public void logoutlink()
			{
				logoutlink.click();
			}
			public void searchempl() throws InterruptedException
			{
				
				search.click();
				List<WebElement> tableemail=pdriver.findElements(By.xpath("//tr[@class='odd' or @class='even']//td"));
				pdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
				String s=tablelast.getText();
				String y=tablenext.getText();
				
				//System.out.println(em);
				while(!(y.equals(s)))
				{
					Thread.sleep(5000);
					
					for(WebElement tr:tableemail)
					{
						
						String ht=tr.getText();
						System.out.println(ht);
						if(ht.equals(em))
						{
							System.out.println("Already Exist Email");
							Assert.assertTrue(false);
						
						}
					
					}
					Thread.sleep(8000);
					tablenext.click();
				}
			}
			
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
			public void fname(String first)
			{
				
				txtfname.sendKeys(first);
				
				
			}
			public void lname(String laname)
			{
				
				lname.sendKeys(laname);
			}
			public void mail(String temail)
			{
				email.sendKeys(temail);
				em=temail;
			}
			public void mno(String mobile)
			{
				mob.sendKeys(mobile);
				
			}
			public void add(String adres)
			{
				add.sendKeys(adres);
				
			}
			
			public void Dob()
			{
			Dob.click();
			Dob1.click();
			
			}
			public void gender()
			{
					gender.click();
			}
			public void country(String z)
			{
				
				Select select=new Select(country);
				select.selectByValue(z);
			}
			public void city(String x)
			{
				Select select1=new Select(city);
				select1.selectByValue(x);
			}
			public void skill(String s)
			{
				if(s.equalsIgnoreCase("AWS"))
				{
					pdriver.findElement(By.name("chkSkill_5")).click();
				}
				if(s.equalsIgnoreCase("Devops"))
				{
					pdriver.findElement(By.name("chkSkill_3")).click();
				}
				if(s.equalsIgnoreCase("Full stack Developer"))
				{
					pdriver.findElement(By.name("chkSkill_2")).click();
				}
				if(s.equalsIgnoreCase("Middleware"))
				{
					pdriver.findElement(By.name("chkSkill_4")).click();
				}
				if(s.equalsIgnoreCase("Qa Automation"))
				{
					pdriver.findElement(By.name("chkSkill_1")).click();
				}
				if(s.equalsIgnoreCase("Webservices"))
				{
					pdriver.findElement(By.name("chkSkill_6")).click();
				}
				
				
				
				
			}
			public void save() throws InterruptedException
			{
				
				//searchempl();
				save.click();
				//pdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//pdriver.navigate().back();
				
				
			}
			public String msg2()
			{
				String msg=pdriver.findElement(By.xpath("//div[contains(text(),'Please fill all the required field first')]")).getText();
				return msg;
			}
			public String msg1()
			{
				WebDriverWait wait=new WebDriverWait(pdriver, Duration.ofSeconds(6));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Employee details saved successfully')]")));
				String msg1=pdriver.findElement(By.xpath("//div[contains(text(),'Employee details saved successfully')]")).getText();
				System.out.println(msg1);
				return msg1;
			}
			public String msg3()
			{
				//
				String msg3=pdriver.findElement(By.xpath("//div[contains(text(),'Please fill all the required field first')]")).getText();
				System.out.println(msg3);
				return msg3;
			}
			
			public void Regist() throws InterruptedException
			{
				
				
				
				
				
				List<WebElement> le=pdriver.findElements(By.xpath("//ul[@id='MenusDashboard']//li"));
				System.out.println(le.size());

				for(WebElement i:le)
				{	
					try
					{
							if(i.getText().equals("Employee"))
							{
								i.click();
								Thread.sleep(3000);
								
								
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
				
				
			}
			
			public void cancel() throws IOException
			{
				cancel.click();
				
			}
			

			public void otherCity(String ot) {
				
				other.click();
				Othercity.sendKeys(ot);
			}
	}


