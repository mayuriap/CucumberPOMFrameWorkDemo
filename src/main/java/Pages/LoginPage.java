package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;



public class LoginPage {
	
	private WebDriver driver ;

	//1.By Locators:
	
		
	private By LogIn = By.xpath("//span[text()='Log In']");
	private By username = By.xpath("//input[@name='email']");
	private By password = By.xpath("//input[@name='password']");
	private By loginbtn = By.xpath("//div[text()='Login']");
	private By forgotMyPassword = By.xpath("//a[text()='Forgot your password?']");
	private By crmLogo = By.xpath("//a[@href='https://freecrm.com']");
	private By ContactPageLink = By.xpath("//a[@href='/contacts']");
	private By HomePageLogo = By.xpath("//div[@href='#']");
	
	

	
	//Constructor of the page class:

	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	
	//3. page actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isForgotPasswordLink() {
		
		return driver.findElement(forgotMyPassword).isDisplayed();
	}
	
	public void getLoginWizard() {
		DriverFactory.getDriver().get("https://www.freecrm.com/");
		driver.findElement(LogIn).click();
	}
	
	public void enterUserName(String un) {
		driver.findElement(username).sendKeys(un);
	}
	
	public void enterpassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void ClickonLoginButton() {
		
		driver.findElement(loginbtn).click();
	}
	
	
	public String verifyHomePageTitle() {
        return driver.getTitle();
	}
        
        public HomePage doLogin(String un,String pwd) {
        	
        	driver.findElement(LogIn).click();
        	driver.findElement(username).sendKeys(un);
        	driver.findElement(password).sendKeys(pwd);
        	driver.findElement(loginbtn).click();
        	return new HomePage(driver);
        	    	
        	
        }
         

}

