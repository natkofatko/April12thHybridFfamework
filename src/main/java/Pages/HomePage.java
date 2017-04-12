package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
WebDriver driver; 
	
	public HomePage(WebDriver Driver)
	{
		this.driver = Driver; 
	}

	@FindBy(xpath = "//input[@name='uid']") WebElement username; 
	@FindBy(xpath = "//input[@name='password']") WebElement password;
	@FindBy(xpath = "//input[@name='btnLogin']") WebElement submit;

	
	public void logInToMyAccount(String user, String pass)
	
	{
	
		try{
			username.clear();
	Thread.sleep(2000);
	username.sendKeys(user);
	Thread.sleep(2000);
	password.clear();
	Thread.sleep(2000);
password.sendKeys(pass);
Thread.sleep(2000);
submit.click();

		}
		catch(Exception e )
		{
			System.out.println(e.getMessage());
		}


	}
	
	public String gtTitle()
	{
		 return driver.getTitle(); 
	}
}
