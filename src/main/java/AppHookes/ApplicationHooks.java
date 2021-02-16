package AppHookes;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import TestUtil.ConfigReader;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import factory.DriverFactory;

public class ApplicationHooks {
	private DriverFactory driverFactory;
	private WebDriver driver;
	private  ConfigReader configreader;
	Properties prop;
	
	
	@Before(order = 0)
	public void getProperty() {
		configreader = new ConfigReader();
		
		prop =configreader.init_prop();
		
	}
	
	
	@Before(order = 1)
	public void launchBrowser()
	{
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver= driverFactory.init_driver(browserName);
		System.out.println("Browser launched successfully");
		
	}
	
	@After (order = 0)	
	public void quitBrowser() {
		driver.quit();
	}

}

