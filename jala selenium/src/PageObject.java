import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
@Test
public class PageObject extends Base {
	WebDriver pdriver;
	
			
			

			public PageObject(WebDriver driver1) {
				pdriver=driver1;
				PageFactory.initElements(driver1, this);
	}



			@FindBy(id="UserName")
			WebElement txtuser;
			@FindBy(id="Password")
			WebElement txtpassword;
			@FindBy(id="FirstName")
			WebElement txtfname;
			@FindBy(id="LastName")
			WebElement lname;
			@FindBy(id="EmailId")
			WebElement email;
			@FindBy(id="MobileNo")
			WebElement mob;
			@FindBy(id="Address")
			WebElement add;
			@FindBy(id="btnLogin")
			WebElement btn;
			@FindBy(id="DOB")
			WebElement Dob;
			@FindBy(xpath="//td[contains(text(),'19')]")
			WebElement Dob1;
			@FindBy(id="rdbMale")
			WebElement gender;
			@FindBy(id="CountryId")
			WebElement country;
			@FindBy(id="CityId")
			WebElement city;
			@FindBy(id="chkSkill_5")
			WebElement skill;
			@FindBy(id="chkSkill_1")
			WebElement skill1;
			@FindBy(xpath="//button[contains(text(),'Save')]")
			WebElement save;
			@FindBy(xpath="//button[contains(text(),'Save')]")
			WebElement register;
			
			

			public void setUname(String unames)
			{
				txtuser.sendKeys(unames);
				
			}
			
			public void setPass(String pwd)
			{
				txtpassword.sendKeys(pwd);
				
			}
			public void btnclk()
			{
				btn.click();
			}
			public void fname(String fname)
			{
				txtfname.sendKeys(fname);
				
			}
			public void lname(String laname)
			{
				
				lname.sendKeys(laname);
			}
			public void mail(String temail)
			{
				email.sendKeys(temail);
				
			}
			public void mno(String mobile)
			{
				mob.sendKeys(mobile);
				
			}
			public void add(String adres)
			{
				add.sendKeys(adres);
				
			}
			
			public void Dob()
			{
			Dob.click();
			Dob1.click();
			
			}
			public void gender()
			{
					gender.click();
			}
			public void country()
			{
				Select select=new Select(country);
				select.selectByValue("1");
			}
			public void city()
			{
				Select select1=new Select(city);
				select1.selectByValue("7");
			}
			public void skill()
			{
				skill.click();
				skill1.click();
			}
			public void save()
			{
				save.click();
				
			}
			public void Regist()
			{
				List<WebElement> le=pdriver.findElements(By.xpath("//ul[@id='MenusDashboard']//li"));
				System.out.println(le.size());

				for(WebElement i:le)
				{	
					try
					{
							if(i.getText().equals("Employee"))
							{
								i.click();
							}
							if(i.getText().equals("Create"))
							{
								i.click();
							}
					}
					catch(Exception e)
					{
						
					}
					
				}
				
			}
	}


