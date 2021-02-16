package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.contactPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import factory.DriverFactory;

public class contactStepDefinition {
	 private HomePage homepage;
	 private contactPage contactpage;
	 private LoginPage loginPage;
	 private WebDriver driver;
	
	private DriverFactory driverFactory;
		
	 public contactStepDefinition(DriverFactory driverFactory) {
		 
		 this.driverFactory=driverFactory;
		 
		//loginPage=new LoginPage(driver);
		 homepage = new HomePage(driver);
		 
		 
	 }
	
	 

	 @Given("^user is on the Contact Page$")
	 public void user_is_on_the_Contact_Page()  {
	     
		 contactpage.clickOnContactLink();
	 }

}
