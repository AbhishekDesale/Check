package performers;

import Browser.Browser;
import io.cucumber.java.en.*;
import pages.Home;
import pages.Registration;

public class RegisterButtonFunctional extends Browser {

@Given("user is on home page of demo web shop")
public void user_is_on_home_page_of_demo_web_shop() {
	try
	{
	
	setDriver();
	getUrl("http://demowebshop.tricentis.com/");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}

@When("user clicks on Register_Button")
public void user_clicks_on_Register_Button() throws Exception {
	try
	{
	Home.clickRegister();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
   
}

@Then("Register page is Displayed")
public void register_page_is_Displayed() throws Exception {
	try
	{
	Registration.validateUrlRegister();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
   
}


}
