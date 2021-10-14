package performers;

import java.io.IOException;

import Browser.Browser;
import io.cucumber.java.en.*;
import pages.Registration;

public class InvalidEmailFunctionality extends Browser{

@Given("user is on Registration page of demo-web-shop")
public void user_is_on_Registration_page_of_demo_web_shop() {
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

@When("user enters Valid details and invalid email")
public void user_enters_Valid_details_and_invalid_email() throws Exception {
	try
	{
	    Registration.enterFirstName(2, 0);
	    Registration.enterLastName(2, 1);
	    Registration.enterEmailId(2, 2);
	    Registration.enterPassword(2, 3);
	    Registration.enterConfirmPassword(2, 4);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}

@And("user clicks on register__button")
public void user_clicks_on_register__button() throws Exception {
	try
	{
	Registration.clickRegisterButton();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}

@Then("Credentials Should not be accepted")
public void credentials_Should_not_be_accepted() throws Exception {
	
}
   

@And("error messsage displays wrong email")
public void error_messsage_displays_wrong_email() throws Exception {
	try
	{
	Registration.invalidemailHome();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
 

}
