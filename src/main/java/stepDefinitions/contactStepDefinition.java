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
	// private HomePage homepage;
	 private contactPage contactpage;
	 //private LoginPage loginPage;
	 private WebDriver driver;
	
	 private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
		private HomePage homepage;
		//private DriverFactory driverFactory;
		
	 public contactStepDefinition(WebDriver driver) {
		 
		 this.driver=driver;
		 
		loginPage=new LoginPage(driver);
		 homepage = new HomePage(driver);
		 
		 
	 }
	
	 @Given("^User is already on the home Page$")
		public void user_is_already_on_the_home_Page(DataTable datatable)  {
			
			
		List<List<String>> credentials =datatable.raw();  
		String userName=credentials.get(0).get(0);
		String password=credentials.get(0).get(1);
		DriverFactory.getDriver().get("https://www.freecrm.com/");
		homepage = loginPage.doLogin(userName,password);
		
	 }

	 @Given("^user is on the Contact Page$")
	 public void user_is_on_the_Contact_Page()  {
	     
		 String CurrentPage = driver.getTitle();
			
			System.out.println("Currently User is on "+CurrentPage);
		 homepage.clickOnContactLink();
	 }

}
