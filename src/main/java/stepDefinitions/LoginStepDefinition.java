package stepDefinitions;

import org.junit.Assert;

import Pages.LoginPage;
import factory.DriverFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		
		DriverFactory.getDriver().get("https://www.freecrm.com/");
		loginPage.getLoginWizard();
		
		System.out.println("User is on the Login Page");
	}

	@When("^user get the title of the page$")
	public void user_get_the_title_of_the_page()  {
		String title=loginPage.validateLoginPageTitle();
		
		System.out.println("Title of the Page is"+ title);
	    
	}

	@Then("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String logintitle)  {
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title,logintitle);
	}

	

	@Then("^forgot password link should be displayed$")
	public void forgot_password_link_should_be_displayed() {
		
		loginPage.isForgotPasswordLink();
	    
	}

	@When("^user enters username \"([^\"]*)\"$")
	public void user_enters_username(String un)  {
		
		loginPage.enterUserName(un);
	    
	}

	@When("^user enters password \"([^\"]*)\"$")
	public void user_enters_password(String pwd)  {
		loginPage.enterUserName(pwd);
	}

	@When("^user clicks on Login button$")
	public void user_clicks_on_Login_button()  {
		loginPage.ClickonLoginButton();
	    
	}

	@Then("^user gets the title of the page$")
	public void user_gets_the_title_of_the_page()  {
	    
		String HomePageTitle=loginPage.verifyHomePageTitle();
		Assert.assertEquals(HomePageTitle,"Cogmento CRM");
	}

}
