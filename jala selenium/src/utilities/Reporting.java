package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

public class Reporting extends TestListenerAdapter{
	WebDriver pppdriver;
	ExtentReports extents;
	ExtentTest test;
	String reportname;
	public void onStart(ITestContext testContext)
	{
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		reportname="Test-Report-"+timestamp+".html";
		extents=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/"+reportname);
		spark.config().setReportName("my report");
		spark.config().setDocumentTitle("new Document");
		extents.attachReporter(spark);
		
		
		
		
		
	//	extents.flush();
		
		//pppdriver.getTitle();
	}
	
	
	public void onTestFailure(ITestResult tr)
	{
		test=extents.createTest(tr.getName());
		Date currdate=new Date();
		//String Screenshotfile=currdate.toString().replace(" ","-").replace(":","-");
		
		
		test.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
		String screenshotpath=System.getProperty("user.dir")+"//screenshots//"+tr.getName()+".jpg";
		//System.out.print(screenshotpath);
		File f=new File(screenshotpath);
		if(f.exists())
		{
			try {
			test.fail("Screenshot is below"+test.addScreenCaptureFromPath(screenshotpath));
			}
			catch(Exception e)
			{
				e.printStackTrace();
		
			}
		}
	}
	
	public void onTestSuccess(ITestResult tr)
	{
		test=extents.createTest(tr.getName());
		test.log(Status.PASS,MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
	}
	public void onTestSkipped(ITestResult tr)
	{
		test=extents.createTest(tr.getName());
		test.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
		
	}
	public void onFinish(ITestContext testContext)
	{
		/*try {
			//Desktop.getDesktop().browse(new File("E://IMP document//eclipse-workspace//jala selenium//test-output/"+reportname).toURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		extents.flush();
	}
	
	
	
}
