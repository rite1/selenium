package pageobject;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.google.common.io.Files;
@Test
public class ImagePage {

	
WebDriver pdriver;
	
	
	

	public ImagePage(WebDriver driver1) {
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
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[3]/button[1]") 
	WebElement uploadbutton;
	
	@FindBy(xpath="//body[1]/div[4]/div[1]/div[2]") 
	WebElement toast;
	
	@FindBy(xpath="//span[@class='hidden_xs']")
	WebElement logoutlink;
	
	
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
	public void imageOption()
	{
		imageoption.click();
	}
	public void chooseFile(String path)
	{
		choose.sendKeys(path);
		
	}
	public void upload()
	{
		uploadbutton.click();
	}
	public String toast()
	{
		String msg = toast.getText();
		return msg;
	}
	
}
