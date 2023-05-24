package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import graphql.Assert;
import pageobject.LoginPage;
import pageobject.LoginPage1;

public class Testcase_login1 extends Base{
	
	@Test(dataProvider="login")
	public void loginWithValidDet(String user,String pass) throws InterruptedException, IOException
	{
		
		
		
		
		LoginPage1 l1=new LoginPage1(driver);
		//System.out.print(user);
		//System.out.print(pass);
		driver.get(url);
	logger.info("url opened");
		l1.setUname(user);
	logger.info("username input");
		l1.setPass(pass);
	//	logger.info("password input");
		l1.btnclk();
		Thread.sleep(6000);
		if(driver.getTitle().equals("Magnus"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			ScreenCapture(driver,"loginWithValidDet");
			Assert.assertTrue(false);
		}
		
		String b=driver.getTitle();
		System.out.print(b);
		
		
	}
	
	@DataProvider(name="login")
	public String[][] getExcelData() throws IOException {
			File excelFile=new File("C://Users//ritzz//Desktop//newfile.xlsx");
			FileInputStream fis=new FileInputStream(excelFile);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet("sheet1");
			System.out.print(sheet.getPhysicalNumberOfRows());
			int noofrow=sheet.getPhysicalNumberOfRows();
			int noofcol=sheet.getRow(0).getLastCellNum();
			String[][] data=new String[noofrow-1][noofcol];
			for(int i=0;i<noofrow-1;i++)
			{
				for(int j=0;j<noofcol;j++)
				{
					DataFormatter df=new DataFormatter();
					
					data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
				}
			}
			workbook.close();
			fis.close();
			return data;
	}

}
