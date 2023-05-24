import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screensht {

	public static void main(String[] args) throws IOException, InterruptedException {
System.setProperty("webdriver.chrome.driver","E://IMP document//eclipse-workspace//selenium web//driver//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		String ff=driver.getWindowHandle();
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().window().maximize();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f,new File("F:/sample.jpg"));
		driver.findElement(By.xpath("//body/div[2]/aside[1]/section[1]/ul[1]/li[3]/a[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//body/div[2]/aside[1]/section[1]/ul[1]/li[3]/ul[1]/li[11]/a[1]")).click();
		driver.switchTo().frame("iframe2");
		
		driver.findElement(By.linkText("http://jalatechnologies.com/contact-us.html")).click();
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		while(it.hasNext())
		{
			String window1=it.next();
			driver.switchTo().window(window1);
			if(driver.getTitle().equals("JALA Academy - Anyone Can become a Software Engineer"))
			{
				driver.close();
			}
		}
		driver.switchTo().window(ff);
		
		
		
		//Broken Links
		
		driver.findElement(By.xpath("//body/div[3]/aside[1]/section[1]/ul[1]/li[3]/ul[1]/li[9]/a[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Broken Links')]")).click();
		List<WebElement> a=driver.findElements(By.tagName("a"));
		System.out.println(a.size());
		
		for(WebElement h:a)
		{
			String url=h.getAttribute("href");
			System.out.println("----------------------");
			System.out.println(url);
		if(url.equals("null")||url.isEmpty())
		{
			System.out.println("empty");
			continue;
		}
		try
		{
		HttpURLConnection huc=(HttpURLConnection)(new URL(url).openConnection());
		huc.connect();
		if(huc.getResponseCode()>=400)
		{
			System.out.println("Url is not working");
		}
		else
		{
			System.out.println("Url is working");
		}
		}catch(Exception e)
		{
			
		}

	}
		
driver.close();
}
}
