package factory;



//import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import TestUtil.Util;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	public WebDriver init_driver(String browser) {
		
if(browser.equals("chrome")){
			
			WebDriverManager.chromedriver().setup();
					
			tlDriver.set(new ChromeDriver());
		
	
	}else if (browser.equals("firefox")) {
		
		WebDriverManager.firefoxdriver().setup();
		 
		tlDriver.set(new FirefoxDriver());
}else {
	System.out.println("Please pass the correct browser value:" +browser);
}
getDriver().manage().window().maximize();
getDriver().manage().deleteAllCookies();
//getDriver().manage().timeouts().pageLoadTimeout(Util.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
//getDriver().manage().timeouts().implicitlyWait(Util.IMPLICIT_WAIT,TimeUnit.SECONDS);
return getDriver();
	}
	
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
		
	}
}