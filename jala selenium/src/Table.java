import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E://IMP document//eclipse-workspace//selenium web//driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
		String ff=driver.getWindowHandle();
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//body/div[2]/aside[1]/section[1]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("//body/div[2]/aside[1]/section[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]")).click();
		List<WebElement> tab=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover table-striped dataTable no-footer']"));
		String s=driver.findElement(By.xpath("//li[@class='page-item disabled']//a")).getText();
		WebElement wb=driver.findElement(By.xpath("//li[@id='liNext_EmployeeGrid']//a"));
		System.out.println("hi"+s);
		
				
						while(!(wb.getText().contains(s)))
							{
								for(WebElement t:tab)
								{
									System.out.println("--------------------------------\n-----------------------");
									System.out.println(t.getText());
								}
								Thread.sleep(2000);
								wb.click();
								
							}
						
				
			
		List<WebElement> row=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover table-striped dataTable no-footer']//tr"));
		System.out.println("Total No. Of Rows"+row.size());
		
		WebElement tdata=driver.findElement(By.xpath("//table[@id='tblEmployee']//tr[4]"));
		System.out.println(tdata.getText());
		
		driver.quit();
		
	}

}
