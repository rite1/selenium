import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdpwn {

	public static void main(String[] args)throws InterruptedException 
	{
		
		
System.setProperty("webdriver.chrome.driver","E://IMP document//eclipse-workspace//selenium web//driver//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[2]/aside[1]/section[1]/ul[1]/li[3]/a[1]")).click();
		
		Thread.sleep(6000);
		List<WebElement> ddown=driver.findElements(By.xpath("//ul/div2[@class='treeview-menu']/li"));
		System.out.println(ddown.size());
		
		
		
		for(WebElement ptype:ddown)
		{
			
			{
				
				System.out.println(ptype.getText());
			}
		}
		
		
	
		for(WebElement ptype:ddown)
		{
			if(ptype.getText().equals("Multiple Tabs"))
			{
				System.out.println(ptype.getText());
				ptype.click();
				break;
			}
		}
		
		
		
		
		driver.close();
		
		//WebElement ddown=driver.findElement(By.id("MenusDashboard"));
		
			
		

}

}
