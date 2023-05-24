import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","E://IMP document//eclipse-workspace//selenium web//driver//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[2]/aside[1]/section[1]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//body/div[2]/aside[1]/section[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")).click();
		List<WebElement> w=driver.findElements(By.name("rdbGender"));
		System.out.println(w.size());
		
		List<WebElement> t=driver.findElements(By.xpath("//div[@class='col-md-4 form-group mt_25']"));
		
		
		for(WebElement i:t)
		{
			System.out.println(i.getText());
			
			
			
		}
		for(WebElement s:w)
		{
			
			
			if(s.getAttribute("value").equals("M"))
			{
				s.click();
				System.out.println(s.isEnabled());
				System.out.println(s.isSelected());
			}
			if(s.isSelected())
			{
				System.out.println(s.getAttribute("label"));
			}
			System.out.println(s.getAttribute("value"));
			
		}
		
		driver.close();
	}

}
