package performers;

import Browser.Browser;
import io.cucumber.java.en.*;
import pages.Home;

public class UrlFunctionality extends Browser{

@Given("open the chrome")
public void open_the_chrome() {
	try
	{
	setDriver();  
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}

@When("Enter the url")
public void enter_the_url() {
	try
	{
	getUrl("http://demowebshop.tricentis.com/");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}

@Then("page is displayed")
public void page_is_displayed() throws Exception {
	try
	{

	Home.validateUrl();   
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
