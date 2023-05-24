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
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.google.common.io.Files;
@Test
public class Autocomplete {
	WebDriver pdriver;
	
	public Autocomplete(WebDriver driver1) {
	pdriver=driver1;
	PageFactory.initElements(driver1, this);
}
	
	@FindBy(id="UserName")
	WebElement txtuser;
	@FindBy(id="Password")
	WebElement txtpassword;
	@FindBy(id="btnLogin")
	WebElement btn;
	@FindBy(xpath="//body[1]/div[2]/aside[1]/section[1]/ul[1]/li[3]/ul[1]/li[3]/a[1]")
	WebElement Autocomplete;
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	WebElement Singlevalue;
	@FindBy(id="txtSingleAutoComplete")
	WebElement txtsingle;
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	WebElement Multiplevalue;
	@FindBy(id="txtMultipleAutoComplete")
	WebElement txtmultiple;
	@FindBy(xpath="//body[1]/div[2]/aside[1]/section[1]/ul[1]/li[3]/a[1]")
	WebElement More;
	
	@FindBy(xpath="//body[1]/div[3]/header[1]/nav[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")
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
	public void singlevalue()
	{
		Singlevalue.click();
	}
	public void multiplevalue()
	{
		Multiplevalue.click();
	}
	public void Autocomplete()
	{
		Autocomplete.click();	
	}
	public void singletext(String d2)
	{
		txtsingle.sendKeys(d2);	
	}
	public void multipletext(String s2)
	{
		txtmultiple.sendKeys(s2);	
	}
	
	
	
	

}
