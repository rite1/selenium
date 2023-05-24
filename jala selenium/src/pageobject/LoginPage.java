package pageobject;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.google.common.io.Files;




public class LoginPage{
	
	WebDriver ldriver;
	
	
	

	public LoginPage(WebDriver driver1) {
		ldriver=driver1;
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
		String msg=ldriver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[2]")).getText();
		return msg;
	}

	
	
}
