package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class contactPage {

private WebDriver driver;
private HomePage homepage;
	   


	public contactPage(WebDriver driver) {
		
		
	this.driver= driver;
	homepage = new HomePage(driver);
	}
	
	private By contactPageLink = By.xpath("//span[text()='Log In']");
	private By SideBarMenu = By.xpath("//div[@class='ui left fixed vertical  icon menu sidebar-dark left-to-right']");
	
	public void clickOnContactLink() {
	
		driver.findElement(SideBarMenu).click();
		driver.findElement(contactPageLink).click();
	}
	
}
