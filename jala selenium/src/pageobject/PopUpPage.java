package pageobject;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v107.browser.Browser;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import testcases.Base;

public class PopUpPage extends Base {

WebDriver pdriver;
//String parent;
	
	

	public PopUpPage(WebDriver driver1) {
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
	@FindBy(id="btnTooltip")
	WebElement btnTooltip;
	
	@FindBy(xpath="//body[1]/div[2]/aside[1]/section[1]/ul[1]/li[3]/ul[1]/li[8]/a[1]") 
	WebElement popupmenu;
	
	@FindBy(id="btn-one") 
	WebElement popone;
	@FindBy(id="btn-two") 
	WebElement poptwo;
	@FindBy(id="btn-three") 
	WebElement popthree;
	
	//alert
	@FindBy(id="alertBox") 
	WebElement alert;
	
	@FindBy(id="confirmBox") 
	WebElement alertwithconfirm;
	
	@FindBy(id="promptBtn") 
	WebElement promptBtn;
	
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
		Thread.sleep(3000);
	}
	public void popUpMenu() throws InterruptedException
	{
		popupmenu.click();
		
		
	}
	public void popUpButton() throws InterruptedException
	{
				popupmenu.click();
				popone.click();
				poptwo.click();
				popthree.click();
				Thread.sleep(3000);
				Set<String> window=pdriver.getWindowHandles();
				
				
				Iterator <String> it=window.iterator();
				String parent1=it.next();
					while(it.hasNext())
					{
						String child=it.next();
						String ss=pdriver.switchTo().window(child).getTitle();
						System.out.print(ss);
						
						if(pdriver.getTitle().equals("Google"))
						{
							pdriver.close();
							break;
						}
					}
					
					while(it.hasNext())
					{
						String child=it.next();
						
						String ss1=pdriver.switchTo().window(child).getTitle();
						System.out.print(ss1);
					if(pdriver.getTitle().equals("Online Courses and eBooks Library"))
					{
						pdriver.close();
						break;
					}
					}
					while(it.hasNext())
					{
						
						String child=it.next();
						
						String ss3=pdriver.switchTo().window(child).getTitle();
						System.out.print(ss3);
					if(pdriver.getTitle().equals("TutorialsTeacher - Learn Technologies"))
					{
						pdriver.close();
						break;
					}
					}
					pdriver.switchTo().window(parent1);
				
				
				
	}
	
	public void alert() throws InterruptedException
	{
		
		alert.click();
		pdriver.switchTo().alert().accept();
		
	}
	
	public void alertwithconfirm() throws InterruptedException
	{
		
		alertwithconfirm.click();
		pdriver.switchTo().alert().accept();
		
	}
	public void alertwithprompt() throws InterruptedException
	{
		
		promptBtn.click();
		pdriver.switchTo().alert().accept();
		
	}
	
	
}
