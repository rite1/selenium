package pageobject;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import testcases.Base;
@Test
public class Collapsiblecontentpage extends Base {

	
	
	
		
		WebDriver pdriver;
		
			public Collapsiblecontentpage(WebDriver driver1) {
			pdriver=driver1;
			PageFactory.initElements(driver1, this);
	}
			
			@FindBy(id="UserName")
			WebElement txtuser;
			@FindBy(id="Password")
			WebElement txtpassword;
			@FindBy(id="btnLogin")
			WebElement btn;
			@FindBy(xpath="//body[1]/div[2]/aside[1]/section[1]/ul[1]/li[3]/a[1]")
			WebElement More;
			@FindBy(xpath="//body[1]/div[2]/aside[1]/section[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]")
			WebElement menu;
			@FindBy(xpath="//body[1]/div[2]/aside[1]/section[1]/ul[1]/li[3]/ul[1]/li[4]/a[1]")
			WebElement collapse;
			
			@FindBy(xpath="//i[@class='more-less glyphicon glyphicon-plus']")
			WebElement coll;
			@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h4[1]/a[1]")
			WebElement collapseone;
			@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h4[1]/a[1]")
			WebElement collapseTwo;
			@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/h4[1]/a[1]")
			WebElement collapseThree;
			@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
			WebElement collapsemul;
			
			@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
			WebElement panelcol1;
			
			@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]")
			WebElement panelcol2;
			
			@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]")
			WebElement panelcol3;
			
			@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h4[1]/a[1]/i[1]")
			WebElement collapsemul1;
			
			@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/h4[1]/a[1]")
			WebElement collapsemul2;
			
			@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/h4[1]/a[1]")
			WebElement collapsemul3;
			
			@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/h4[1]/a[1]")
			WebElement collapsemul4;
			
			@FindBy(xpath="//span[@class='hidden_xs']")
			WebElement logoutlink;
			
			
			@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]")
			WebElement collapasemultiplepanel01;
			
			@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]")
			WebElement collapasemultiplepanel02;
			
			@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]")
			WebElement collapasemultiplepanel03;
			
			
			public void logoutlink()
			{
				logoutlink.click();
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
			public void More() throws InterruptedException
			{
				
				More.click();
				Thread.sleep(5000);
			}
			
			public void Menu()
			{
				
				menu.click();
			}
			public void collapse()
			{
				
				collapse.click();
				
			}
			public String collapse1() throws InterruptedException
			{
				
				collapseone.click();
				Thread.sleep(2);
				System.out.println(panelcol1.getText());
				return panelcol1.getText();
			}
			public String collapse2() throws InterruptedException
			{
				
				collapseTwo.click();
				Thread.sleep(2);
				System.out.println(panelcol2.getText());
				return panelcol2.getText();
			}
			public String collapse3() throws InterruptedException
			{
				
				collapseThree.click();
				Thread.sleep(2);
				System.out.println(panelcol3.getText());
				return panelcol3.getText();
			}
			
			
			
			public void collapsemul()
			{
				
				collapsemul.click();
			}
			public String collapsemul1()
			{
				
				collapsemul1.click();
				return collapasemultiplepanel01.getText();
				
			}
			public String collapsemul2()
			{
				
				collapsemul2.click();
				
				return collapasemultiplepanel02.getText();
			}
			public String collapsemul3()
			{
				
				collapsemul3.click();
				return collapasemultiplepanel03.getText();
			}
			
}




