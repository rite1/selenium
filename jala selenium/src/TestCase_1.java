import org.testng.annotations.Test;

public class TestCase_1 extends Base {
	@Test
	public void Reg() throws InterruptedException
	{
		PageObject t1=new PageObject(driver);
		driver.get(url);
		t1.setUname(usn);
		t1.setPass(pwd);
		t1.btnclk();
		Thread.sleep(3000);
		t1.Regist();
		t1.fname(fname);
		t1.lname(lname);
		t1.mail(email);
		t1.add(address);
		t1.mno(mob);
		t1.Dob();
		t1.country();
		t1.gender();
		t1.city();
		t1.skill();
		t1.save();
		
		Thread.sleep(3000);
		
	}	

}
