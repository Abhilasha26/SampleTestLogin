package Loginapp.Loginapplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Test1 {
	
	WebDriver driver;
	
	@Test
	public void LoginApp()
	{
		
		System.setProperty("webdriver.gecko.driver", "Driver1\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe"); //This is the location where you have installed Firefox on your machine
        WebDriver driver = new FirefoxDriver(options);
		/*
		 * DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 * capabilities.setCapability("marionette",true);
	      //driver= new FirefoxDriver();
		*/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		System.out.println("  URl opened successfully");
	}

}
