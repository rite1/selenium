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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import testcases.Base;
@Test
public class MenuPage extends Base{
	
	WebDriver pdriver;
	
		public MenuPage(WebDriver driver1) {
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
		@FindBy(id="b1")
		WebElement Testing;
		@FindBy(id="b2")
		WebElement java;
		@FindBy(id="b3")
		WebElement dotnet;
		@FindBy(id="b4")
		WebElement database;
		@FindBy(linkText="Sub Menus")
		WebElement submenu;
		@FindBy(xpath="//body[1]/div[2]/aside[1]/section[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]")
		WebElement menu;
		@FindBy(id="label")
		WebElement msg;
		@FindBy(id="label1")
		WebElement submsg;
		@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")
		WebElement subTesting;
		@FindBy(id="selbtn")
		WebElement subselenium;
		@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")
		WebElement subjava;
		@FindBy(id="manualbtn")
		WebElement submanual;
		@FindBy(id="dbbtn")
		WebElement subdatabase;
		@FindBy(id="unitbtn")
		WebElement unitbtn;
		@FindBy(id="advjavabtn")
		WebElement advjavabtn;
		@FindBy(id="springbtn")
		WebElement springbtn;
		@FindBy(id="hibernatebtn")
		WebElement hibernatebtn;
		@FindBy(id="corejavabtn")
		WebElement corejavabtn;
		
		@FindBy(id="cbtn")
		WebElement cbtn;
		@FindBy(id="aspbtn")
		WebElement aspbtn;
		@FindBy(id="adobtn")
		WebElement adobtn;
		@FindBy(id="mvcbtn")
		WebElement mvcbtn;
		@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]")
		WebElement subdot;
		
		@FindBy(id="sqlbtn")
		WebElement sqlbtn;
		@FindBy(id="mysqlbtn")
		WebElement mysqlbtn;
		@FindBy(id="oraclebtn")
		WebElement oraclebtn;
		@FindBy(id="h2btn")
		WebElement h2btn;
		@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]")
		WebElement submenudatabase;
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
		
		public void Menu()
		{
			
			menu.click();
		}
		public String Testing()
		{
			
			Testing.click();
			String m=msg.getText();
			return m;
			
		}
		public String java()
		{
			
			java.click();
			String m=msg.getText();
			return m;
		}
		public String dotnet()
		{
			
			dotnet.click();
			String m=msg.getText();
			return m;
		}
		public String database()
		{
			
			database.click();
			String m=msg.getText();
			return m;
		}
		public void Submenu()
		{
			
			submenu.click();
		}
		public String subTesting() throws InterruptedException
		{
			Actions act=new Actions(pdriver);
			act.moveToElement(subTesting).build().perform();
			subselenium.click();
			Thread.sleep(5000);
			String m=submsg.getText();
			return m;
			
		}
		public String submanual() throws InterruptedException
		{
			Actions act=new Actions(pdriver);
			act.moveToElement(submanual).build().perform();
			submanual.click();
			Thread.sleep(5000);
			String m=submsg.getText();
			return m;
			
		}
		public String subdatabase() throws InterruptedException
		{
			Actions act=new Actions(pdriver);
			act.moveToElement(subdatabase).build().perform();
			subdatabase.click();
			Thread.sleep(5000);
			String m=submsg.getText();
			return m;
			
		}
		public String subunit() throws InterruptedException
		{
			Actions act=new Actions(pdriver);
			act.moveToElement(unitbtn).build().perform();
			unitbtn.click();
			Thread.sleep(5000);
			String m=submsg.getText();
			return m;
			
		}
		
		public String subjava() throws InterruptedException
		{
			Actions act=new Actions(pdriver);
			act.moveToElement(subjava).build().perform();
			subjava.click();
			Thread.sleep(5000);
			String m=submsg.getText();
			return m;
			
		}
		public String advjava() throws InterruptedException
		{
			Actions act=new Actions(pdriver);
			act.moveToElement(advjavabtn).build().perform();
			advjavabtn.click();
			Thread.sleep(5000);
			String m=submsg.getText();
			return m;
			
		}
		public String springjava() throws InterruptedException
		{
			Actions act=new Actions(pdriver);
			act.moveToElement(springbtn).build().perform();
			springbtn.click();
			Thread.sleep(5000);
			String m=submsg.getText();
			return m;
			
		}
		public String hiberjava() throws InterruptedException
		{
			Actions act=new Actions(pdriver);
			act.moveToElement(hibernatebtn).build().perform();
			hibernatebtn.click();
			Thread.sleep(5000);
			String m=submsg.getText();
			return m;
			
		}
		public String corejava() throws InterruptedException
		{
			Actions act=new Actions(pdriver);
			act.moveToElement(corejavabtn).build().perform();
			corejavabtn.click();
			Thread.sleep(5000);
			String m=submsg.getText();
			return m;
			
		}
		public String subdotnet() throws InterruptedException
		{
			Actions act=new Actions(pdriver);
			act.moveToElement(subdot).build().perform();
			subdot.click();
			Thread.sleep(5000);
			String m=submsg.getText();
			return m;
			
		}
		
		public String chash() throws InterruptedException
		{
			Actions act=new Actions(pdriver);
			act.moveToElement(cbtn).build().perform();
			cbtn.click();										
			Thread.sleep(5000);
			String m=submsg.getText();
			return m;
			
		}
		public String aspdotnet() throws InterruptedException
		{
			Actions act=new Actions(pdriver);
			act.moveToElement(aspbtn).build().perform();
			aspbtn.click();
			Thread.sleep(5000);
			String m=submsg.getText();
			return m;
			
		}
		public String adodotnet() throws InterruptedException
		{
			Actions act=new Actions(pdriver);
			act.moveToElement(adobtn).build().perform();
			adobtn.click();
			Thread.sleep(5000);
			String m=submsg.getText();
			return m;
			
		}
		public String mvc() throws InterruptedException
		{
			Actions act=new Actions(pdriver);
			act.moveToElement(mvcbtn).build().perform();
			mvcbtn.click();
			Thread.sleep(5000);
			String m=submsg.getText();
			return m;
			
		}
		
		
		
		
		
		
		public String sql() throws InterruptedException
		{
			Actions act=new Actions(pdriver);
			act.moveToElement(sqlbtn).build().perform();
			sqlbtn.click();										
			Thread.sleep(5000);
			String m=submsg.getText();
			return m;
			
		}
		public String mySql() throws InterruptedException
		{
			Actions act=new Actions(pdriver);
			act.moveToElement(mysqlbtn).build().perform();
			mysqlbtn.click();
			Thread.sleep(5000);
			String m=submsg.getText();
			return m;
			
		}
		public String oracle() throws InterruptedException
		{
			Actions act=new Actions(pdriver);
			act.moveToElement(oraclebtn).build().perform();
			oraclebtn.click();
			Thread.sleep(5000);
			String m=submsg.getText();
			return m;
			
		}
		public String h2() throws InterruptedException
		{
			Actions act=new Actions(pdriver);
			act.moveToElement(h2btn).build().perform();
			h2btn.click();
			Thread.sleep(5000);
			String m=submsg.getText();
			return m;
			
		}
		
		public String Submenudatabase() throws InterruptedException
		{
			Actions act=new Actions(pdriver);
			act.moveToElement(submenudatabase).build().perform();
			submenudatabase.click();
			Thread.sleep(5000);
			String m=submsg.getText();
			return m;
			
		}
		
		
		

}
