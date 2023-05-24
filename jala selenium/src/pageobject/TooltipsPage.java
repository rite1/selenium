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

public class TooltipsPage extends Base{

	
WebDriver pdriver;
	
	
	

	public TooltipsPage(WebDriver driver1) {
		pdriver=driver1;
		PageFactory.initElements(driver1, this);
}


	@FindBy(xpath="//span[@class='hidden_xs']")
	WebElement logoutlink;
	@FindBy(id="UserName")
	WebElement txtuser;
	
	@FindBy(id="Password")
	WebElement txtpassword;
	@FindBy(id="btnLogin")
	WebElement btn;
	@FindBy(xpath="//body[1]/div[2]/aside[1]/section[1]/ul[1]/li[3]/a[1]")  
	WebElement More;
	@FindBy(id="btnTooltip")
	WebElement btnTooltip;
	
	@FindBy(xpath="//body[1]/div[2]/aside[1]/section[1]/ul[1]/li[3]/ul[1]/li[7]/a[1]") 
	WebElement Tooltipmenu;
	
	@FindBy(xpath="//div[@class='tooltip fade bottom in']") 
	WebElement fade;
	
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
	public void tooltipmenu() throws InterruptedException
	{
		
		Tooltipmenu.click();
		
	}
	public String tooltipclik() throws InterruptedException
	{
		Actions av=new Actions(pdriver);
		av.scrollToElement(btnTooltip);
		Thread.sleep(5000);
		btnTooltip.click();
		System.out.println(fade.getAttribute("text"));
		return (fade.getText());
	}
	public void logoutlink()
	{
		logoutlink.click();
	}
}
