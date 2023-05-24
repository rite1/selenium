import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E://IMP document//eclipse-workspace//selenium web//driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		String fwindow=driver.getWindowHandle();
		
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
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
		
			driver.switchTo().window(fwindow);
			Thread.sleep(5000);
			Cookie ck1=new Cookie("Mycookie","1232456");
			driver.manage().addCookie(ck1);
			Set<Cookie> cookie = driver.manage().getCookies();
			System.out.println("cookie size Before deletion - "+cookie.size());
			Iterator<Cookie> ct=cookie.iterator();
			while(ct.hasNext())
			{
				
				System.out.println(ct.next());
			}
			
			
			
			//driver.manage().deleteCookie(ck1);
			 driver.manage().deleteAllCookies();
			 cookie = driver.manage().getCookies();
			Thread.sleep(3000);
			
			for(Cookie c:cookie)
			{
				
				System.out.println(c.getValue());
			}
			System.out.println("cookie size after deletion - "+cookie.size());
			
			driver.close();
	}
	

}
