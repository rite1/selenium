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

import com.google.common.io.Files;

import testcases.Base;

public class sliderPage extends Base {
	WebDriver pdriver;
	
	
	

	public sliderPage(WebDriver driver1) {
		pdriver=driver1;
		PageFactory.initElements(driver1, this);
}


	
	@FindBy(id="UserName")
	WebElement txtuser;
	@FindBy(id="ex6SliderVal")
	WebElement sliderval;
	@FindBy(id="Password")
	WebElement txtpassword;
	@FindBy(id="btnLogin")
	WebElement btn;
	@FindBy(xpath="//body[1]/div[2]/aside[1]/section[1]/ul[1]/li[3]/a[1]")  
	WebElement More;
	
	@FindBy(xpath="//body[1]/div[2]/aside[1]/section[1]/ul[1]/li[3]/ul[1]/li[6]/a[1]") 
	WebElement slide;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]") 
	WebElement sliderClickanddrop;
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
	public void slider()
	{
		slide.click();
	}
	public void sliderDrag()
	{
		Actions act=new Actions(pdriver);
		act.dragAndDropBy(sliderClickanddrop,400,200).build().perform();
	}
	
	public String sliderDragVal()
	{
		String x=sliderval.getText();
		System.out.println(x);
		return x;
	}
	
	
}
