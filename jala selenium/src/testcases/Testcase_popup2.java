package testcases;



import org.testng.annotations.Test;


import pageobject.PopUpPage;
@Test
public class Testcase_popup2 extends Base {
	
	
	public void validateAlert()throws InterruptedException{
		PopUpPage m2=new PopUpPage(driver);
		driver.get(url);
		//logger.info("url is opened");
		m2.setUname(usn);
//	logger.info(" enter username");
		m2.setPass(pwd);
//	logger.info(" enter password");
		m2.btnclk();
		Thread.sleep(8000);
		
		m2.More();
		m2.popUpMenu();
		Thread.sleep(5000);
		m2.alert();
		Thread.sleep(5000);
		m2.alertwithconfirm();
		Thread.sleep(5000);
		m2.alertwithprompt();

}
}