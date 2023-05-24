package pageobject;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import testcases.Base;
import testcases.Base1;
import utilities.ReadExcel;

public class LoginPage1 extends Base1{
	WebDriver pddriver;
	public LoginPage1(WebDriver driver1) {
		pddriver=driver1;
		PageFactory.initElements(driver1, this);
}
	
	
	
		
		
		

		

		@FindBy(id="UserName")
		WebElement txtusn;
		@FindBy(id="Password")
		WebElement txtpassword;
		@FindBy(id="btnLogin")
		WebElement btn;
		
		
		public void setUname(String unames)
		{
			txtusn.sendKeys(unames);
			
		}
		public void setPass(String pwd)
		{
			txtpassword.sendKeys(pwd);
		}
		
		public void btnclk()
		{
			btn.click();
		}
		
		
		public String msg()
		{
			String msg=pddriver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[2]")).getText();
			return msg;
		}
		
	}


