package StepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import java.io.FileInputStream;
import java.util.Properties;
import org.junit.runner.RunWith;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import Resources.Browser;

@RunWith(Cucumber.class)
public class StepDefination extends Browser {

	@Given("^Navigate to Lgin page \"([^\"]*)\"$")
    public void navigate_to_lgin_page_something(String strArg1) throws Throwable {
    	
    	sys=Bname();
    	sys.get(strArg1);
    	LandingPage lp = new LandingPage(sys);
		//log.info("Landed");
		lp.Login().click();
		//log.info("g to Log in");
    	
    }

	 @When("^Enter Id \"([^\"]*)\" and pwd \"([^\"]*)\" in login page$")
	 public void enter_id_something_and_pwd_something_in_login_page(String emailid, String pwd) throws Throwable {
		
			
			LoginPage ll = new LoginPage(sys);
			ll.getEmail().sendKeys(emailid);
			ll.getpwd().sendKeys(pwd);
			ll.Login().click();
 
    }

    @Then("^User will be logged in$")
    public void user_will_be_logged_in() throws Throwable {
    	System.out.println("Logged in");
   
    }

}