import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E://IMP document//eclipse-workspace//selenium web//driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
		WebElement usr=driver.findElement(By.id("UserName"));//sendKeys("training@jalaacademy.com");
		WebElement pwd=driver.findElement(By.id("Password"));
		driver.findElement(By.id("btnLogin")).sendKeys(Keys.ENTER);
		
		Actions act=new Actions(driver);
		act.moveToElement(usr).click().keyDown(usr,Keys.SHIFT).sendKeys(usr,"training@jalaacademy.com").keyUp(usr,Keys.SHIFT).build().perform();
		usr.clear();
		usr.sendKeys("training@jalaacademy.com");
		pwd.sendKeys("jobprogram");
		
		driver.findElement(By.id("btnLogin")).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//body/div[2]/aside[1]/section[1]/ul[1]/li[3]/a[1]")).click();
		driver.findElement(By.xpath("//body/div[2]/aside[1]/section[1]/ul[1]/li[3]/ul[1]/li[6]/a[1]")).click();	
		WebElement clickandhold=driver.findElement(By.xpath("//body/div[3]/div[1]/section[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]"));
		act.clickAndHold(clickandhold).build().perform();
		act.dragAndDropBy(clickandhold,500,200).build().perform();
		
	driver.findElement(By.xpath("//body/div[3]/aside[1]/section[1]/ul[1]/li[3]/ul[1]/li[7]/a[1]")).click();
	WebElement hov=driver.findElement(By.id("btnTooltip"));
		act.moveToElement(hov).build().perform();
		act.doubleClick(hov).build().perform();
		Thread.sleep(3000);
		driver.close();	
	}

}
