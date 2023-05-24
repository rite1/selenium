import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","E://IMP document//eclipse-workspace//selenium web//driver//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		String d=driver.findElement(By.id("UserName")).getAttribute("value");
		String ele=driver.findElement(By.id("btnLogin")).getTagName();
		System.out.println(driver.findElement(By.id("btnLogin")).isDisplayed());
		System.out.println(driver.findElement(By.id("btnLogin")).isEnabled());
		System.out.println(driver.findElement(By.id("btnLogin")).getSize());
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		driver.navigate().to("https://www.google.com/");
		driver.navigate().forward();
		driver.navigate().back();
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).getLocation());
		
		
		System.out.println(ele);
		String windowid=driver.getWindowHandle();
		System.out.println(windowid);
		driver.findElement(By.xpath("//a[contains(text(),'http://jalatechnologies.com/contact-us.html')]")).click();
		Set<String> windoIDs=driver.getWindowHandles(); 
		Iterator<String> it=windoIDs.iterator();
		String parentID=it.next();
		String parentWindowID=it.next();
		String childWindowID=it.next();
		System.out.println(parentWindowID);
		System.out.println(childWindowID);
		driver.quit();

	}

}

