package stepDefinitions;



import java.util.*;

import Pages.HomePage;
import Pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import factory.DriverFactory;

public class CommonStepDefinition {
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private HomePage homepage;
	
	 @Given("^User is already on the home Page$")
		public void user_is_already_on_the_home_Page(DataTable datatable)  {
			
			
		List<List<String>> credentials =datatable.raw();  
		String userName=credentials.get(0).get(0);
		String password=credentials.get(0).get(1);
		DriverFactory.getDriver().get("https://www.freecrm.com/");
		homepage = loginPage.doLogin(userName,password);
		
	 }
	
	
	
	
	    
	}

