package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;

public class HomePage {

	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
	}
	private By contactPageLink = By.xpath("//span[text()='Log In']");
	private By SideBarMenu = By.xpath("//div[@class='ui left fixed vertical  icon menu sidebar-dark left-to-right']");
	
	
	
	public String getTheHomePageTitle(){
		
		return driver.getTitle();
		
		
		
	}
	
	public void clickOnContactLink() {
		
		String CurrentPage = driver.getTitle();
		
	System.out.println("Currently User is on "+CurrentPage);
		
		driver.findElement(SideBarMenu).click();
		driver.findElement(contactPageLink).click();
	}
	
	
	
}
