package performers;

import java.io.IOException;

import Browser.Browser;
import io.cucumber.java.en.*;
import pages.Registration;

public class ValidDetailsFunctionality extends Browser {


@Given("user is on registration page of demo_web_shop")
public void user_is_on_registration_page_of_demo_web_shop() {
	try
	{
	setDriver();
	getUrl("http://demowebshop.tricentis.com/register");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}

@When("user enters Valid details")
public void user_enters_Valid_details() throws IOException, Exception {
	try
	{

    Registration.enterFirstName(1, 0);
    Registration.enterLastName(1, 1);
    Registration.enterEmailId(1, 2);
    Registration.enterPassword(1, 3);
    Registration.enterConfirmPassword(1, 4);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
    
}

@And("user clicks on register-button")
public void user_clicks_on_register_button() throws Exception {
	
	try
	{
	Registration.clickRegisterButton();
	Thread.sleep(5000);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
   

@Then("user is navigated to home page of demo web shop")
public void user_is_navigated_to_home_page_of_demo_web_shop() throws Exception {
	try
	{
	Registration.validateUrlHome();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
   
}

}
