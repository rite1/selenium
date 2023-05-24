import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E://IMP document//eclipse-workspace//selenium web//driver//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		//driver.wait(1000);
		String d=driver.findElement(By.id("UserName")).getAttribute("value");
		String c=driver.findElement(By.id("UserName")).getAttribute("placeholder");
		driver.findElement(By.id("UserName")).clear();
		
		System.out.println(d);
		System.out.println(c);
		System.out.println(driver.findElement(By.id("UserName")).isEnabled());
		driver.findElement(By.id("btnLogin")).click();
		
		
		
		driver.close();
		
		

	}

}
