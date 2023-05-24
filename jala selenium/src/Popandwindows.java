import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popandwindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E://IMP document//eclipse-workspace//selenium web//driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[2]/aside[1]/section[1]/ul[1]/li[3]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/Home/Popup']")).click();
		driver.findElement(By.id("alertBox")).click();
		String s=driver.switchTo().alert().getText();
		System.out.println(s);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("promptBtn")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("ritesh");
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmBox")).click();
		driver.switchTo().alert().dismiss();
		
		
		driver.close();
	}
	

}
