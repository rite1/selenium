package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	public ReadConfig()
	{
		try {
		FileInputStream f=new FileInputStream("E://IMP document//eclipse-workspace//jala selenium//config.properties");
		pro=new Properties();
	
	
		pro.load(f);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	
	
	
	}
	public String getApllUrl()
	{
		String url=pro.getProperty("url");
		return url;
		
	}
	
	public String getusn()
	{
		String usn=pro.getProperty("usn");
		return usn;
	}
	
	public String getpassword()
	{
		String pwd=pro.getProperty("pwd");
		return pwd;
	}
	
	public String getChrome()
	{
		String chrome=pro.getProperty("path");
		return chrome;
	}
}
