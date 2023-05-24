package pageobject;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

public class SearchPage
{
	WebDriver pdriver;
	
	
	

	public SearchPage(WebDriver driver1) {
		pdriver=driver1;
		PageFactory.initElements(driver1, this);
}
	
	@FindBy(id="UserName")
	WebElement txtuser;
	@FindBy(id="Password")
	WebElement txtpassword;
	@FindBy(id="btnLogin")
	WebElement btn;
	@FindBy(xpath="//body/div[2]/aside[1]/section[1]/ul[1]/li[2]/a[1]")
	WebElement emp;
	
	@FindBy(xpath="//body[1]/div[2]/aside[1]/section[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
	WebElement search;
	
	@FindBy(id="Name")
	WebElement txtsearchName;
	@FindBy(id="btnSearch")
	WebElement btnsearch;
	@FindBy(id="MobileNo")
	WebElement txtmobile;
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/a[1]")
	WebElement addemp;
	
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/div[1]/form[1]/div[1]/div[2]/div[3]/nav[1]/div[1]/ul[1]/li[4]/a[1]")
	WebElement next;
	
	@FindBy(id="btnClear")
	WebElement btnclear;
	@FindBy(id="txtPageNumber_EmployeeGrid")
	WebElement indextext;
	
	@FindBy(xpath="//span[@class='hidden_xs']")
	WebElement logoutlink;
	
	public void logoutlink()
	{
		logoutlink.click();
	}
	public void table() throws InterruptedException
	{
		List<String> name=new ArrayList<String>();
		//List<WebElement> namesEle=pdriver.findElements(By.xpath("//table[@class='table table-bordered table-hover table-striped dataTable no-footer']"));
		Thread.sleep(1000);
		
		String f=pdriver.findElement(By.id("spanTotalPages_EmployeeGrid")).getText();
		int t=Integer.valueOf(f);
		
		
		
		/*System.out.println("last page"+t);
		for(WebElement namesElement:namesEle)
		{
			name.add(namesElement.getText());
		}*/
		//String nextbutton=next.getAttribute("class");
		//System.out.println(nextbutton);
		for(int i=1;i<=t;i++)
		{
			//Thread.sleep(1000);
			
			List<WebElement> namesEle=pdriver.findElements(By.xpath("//table[@class='table table-bordered table-hover table-striped dataTable no-footer']"));
			for(WebElement namesElement:namesEle)
			{
				name.add(namesElement.getText());
			}
			next.click();
			Thread.sleep(2000);
		//	nextbutton=next.getAttribute("class");
			//System.out.println(nextbutton);
		}
		for(String names:name)
		{
			System.out.println(names);
		}
	}
	public void setUname(String usn)
	{
		txtuser.sendKeys(usn);
		
	}
	
	
	public void setPass(String pwd) {
		txtpassword.sendKeys(pwd);
		
	}
	public void addEmpl()
	{
		addemp.click();
	}
	public void btnclk() {
		btn.click();
		
	}
	public void Empl() throws InterruptedException {
		emp.click();
		Thread.sleep(5000);
		
		search.click();
		Thread.sleep(5000);
	}
	public String clear()
	{
		
		btnclear.click();
		String clr=txtsearchName.getAttribute("value");
		return clr;
		
		
	}
	public String search(String name) throws InterruptedException {
		//search.click();
		String name1=name;
		
		txtsearchName.sendKeys(name1);
		String nl = null;
		Thread.sleep(3000);
		btnsearch.click();
		Thread.sleep(3000);
		List<WebElement> el=pdriver.findElements(By.xpath("//table[@class='table table-bordered table-hover table-striped dataTable no-footer']//tbody//tr[1]//td[1]"));
		
		for(WebElement nn:el)
		{
			nl=nn.getText();
			System.out.print(nl);
		if(nl.equals(name1))
		{
			System.out.print("present");
			break;
		}
		}
		return nl;
	}		
		public String searchBymobile(String mob) throws InterruptedException {
			
			
			txtmobile.sendKeys(mob);
			String str = null;
			Thread.sleep(3000);
			btnsearch.click();
			Thread.sleep(8000);
			List<WebElement> el1=pdriver.findElements(By.xpath("//tr[@class='odd']//td[3]"));
			
			for(WebElement sss:el1)
			{
				if(sss.getText().contains(mob))
				{
					
					str=sss.getText();
					break;
				}
			}
			System.out.print(str);
			return str;
			
			
			
			//return str.toString();
		
	}
		public String enterIndexnumber(String num)
		{
			
			String tabledetails = null;
			indextext.clear();
			indextext.sendKeys(num);
			((Actions) indextext).keyDown(Keys.ENTER);
			List <WebElement> tabledata=pdriver.findElements(By.id("tblEmployee"));
			for(WebElement el:tabledata)
			{
				tabledetails=el.getText();
			}
			;
			return tabledetails;
		}
		

}