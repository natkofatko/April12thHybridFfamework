package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Helper {
	
	public static String CaptureScreenshot(WebDriver driver , String ScreenShotName)
	{
		
		String destination = "C:\\Users\\natal\\workspace\\LearnAutomation\\com.April12LearnAutomation.hybrid\\Screenshots\\"  
		+ ScreenShotName + System.currentTimeMillis() + ".png";  
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		try {
			FileUtils.copyFile(src, new File(destination));
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
	return destination; 
	}
	

}
