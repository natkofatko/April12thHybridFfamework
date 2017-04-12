package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro; 
	
	public ConfigDataProvider()
	{
		File src = new File("C:\\Users\\natal\\workspace\\LearnAutomation\\com.April12LearnAutomation.hybrid\\Configuration\\config.properties");
	try{
		
		FileInputStream fis = new FileInputStream(src);
	pro = new Properties();
	pro.load(fis);
	}
	catch(Exception e)
	{
	System.out.println(e.getMessage());
	}
	}
	
	public String getUrlAdress()
	{
		String UrlAdress= pro.getProperty("url"); 
		return UrlAdress; 
	}
	
	public String getChromeDriver()
	{
		String chrome = pro.getProperty("chrome"); 
				return chrome; 
	}
	public String getEdge()
	{
		String edge = pro.getProperty("edge");
		return edge; 
	}
	public String getFirefox()
	{
		String firefox = pro.getProperty("firefox");
		return firefox; 
	}

}
