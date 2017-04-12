package Factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import DataProvider.ConfigDataProvider;

public class BrowserFactory {
	static WebDriver driver; 
	
public static WebDriver getBrowser(String browserName)
{
	if (browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", DataProviderFactory.getDataFromConfig().getChromeDriver()); 
		driver = new ChromeDriver(); 
	}
	else if (browserName.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", DataProviderFactory.getDataFromConfig().getFirefox()); 
		driver = new FirefoxDriver();
		
	}
	else if (browserName.equalsIgnoreCase("edge"))
	{
		System.setProperty("webdriver.edge.driver", DataProviderFactory.getDataFromConfig().getEdge()); 
		driver = new EdgeDriver(); 
	}
	
	
	
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 

	return driver; 
}
	
public static void TearDown(WebDriver driver)
{
	driver.quit();
}
}
