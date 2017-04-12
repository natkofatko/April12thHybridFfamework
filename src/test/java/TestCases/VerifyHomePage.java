package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Factory.BrowserFactory;
import Factory.DataProviderFactory;
import Pages.HomePage;

public class VerifyHomePage {
	
	WebDriver driver ; 
	HomePage home; 
	ExtentReports report; 
	ExtentTest logger; 

	@BeforeMethod
	public void setUp()
	{
		report = new ExtentReports("C:\\Users\\natal\\workspace\\LearnAutomation\\com.April12LearnAutomation.hybrid\\Reports\\report.html", true);
		logger= report.startTest("Aprl12th"); 
		driver = BrowserFactory.getBrowser("chrome");
		logger.log(LogStatus.INFO, "Chrome Browser is up and running");
		 home  = PageFactory.initElements(driver, HomePage.class); 
		 driver.get(DataProviderFactory.getDataFromConfig().getUrlAdress());
		 logger.log(LogStatus.INFO, "Opening base url succesful");
	}
	
	@Test
	public void testHomePage()
	{
		
			home.logInToMyAccount(DataProviderFactory.getDataFromExcel().getDataBySheetIndex(0, 1, 0), 
				DataProviderFactory.getDataFromExcel().getDataBySheetIndex(0, 1, 1)); 
			logger.log(LogStatus.PASS, "Succesful log in to the website");
			
	}
	
	@Test
	public void test2()
			{
		
		
		home.logInToMyAccount(DataProviderFactory.getDataFromExcel().getDataBySheetIndex(0, 2, 0), 
		DataProviderFactory.getDataFromExcel().getDataBySheetIndex(0, 2, 1)); 
		logger.log(LogStatus.PASS, "Succesful log in to the website");
	}
	
	@Test
	public void test3()
			{
		
		
		home.logInToMyAccount(DataProviderFactory.getDataFromExcel().getDataBySheetIndex(0, 3, 0), 
		DataProviderFactory.getDataFromExcel().getDataBySheetIndex(0, 3, 1)); 
		logger.log(LogStatus.PASS, "Succesful log in to the website");
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		BrowserFactory.TearDown(driver);
		report.endTest(logger);
		report.flush();
		report.close();
	}
	
}

