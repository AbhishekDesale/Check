package performers;

import java.io.IOException;

import Browser.Browser;
import io.cucumber.java.en.*;
import pages.Registration;

public class InvalidPasswordFunctionality extends Browser{


@Given("user is on Register page of demo web shop")
public void user_is_on_Register_page_of_demo_web_shop() {
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

@When("user enters Valid details and invalid password")
public void user_enters_Valid_details_and_invalid_password() throws Exception {
	try
	{
	Registration.enterFirstName(4, 0);
    Registration.enterLastName(4, 1);
    Registration.enterEmailId(4, 2);
    Registration.enterPassword(4, 3);
    Registration.enterConfirmPassword(4, 4);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}

@And("user clicks on the register button")
public void user_clicks_on_the_register_button() throws Exception {
	try
	{
	Registration.clickRegisterButton();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
  
}

@Then("error messsage displays invalid password")
public void error_messsage_displays_invalid_password() throws Exception {
	try
	{
	Registration.invalidpasswordHome();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
   
}




}
