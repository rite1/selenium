import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import dev.failsafe.internal.util.Durations;

public class DatePicker {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","E://IMP document//eclipse-workspace//selenium web//driver//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
		String ff=driver.getWindowHandle();
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//body/div[2]/aside[1]/section[1]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("//body/div[2]/aside[1]/section[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//body/div[3]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]")).click();
		String date=driver.findElement(By.className("datepicker-switch")).getText();
		System.out.println(date);//April 2023
		
		while(!(date.equals("December 2024")))
		{
			driver.findElement(By.xpath("//body[1]/div[4]/div[1]/table[1]/thead[1]/tr[2]/th[3]")).click();
			date=driver.findElement(By.className("datepicker-switch")).getText();
			 
		}
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]")).click();
		
	}

}
