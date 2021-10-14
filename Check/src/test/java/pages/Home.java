package pages;

import org.junit.Assert;

import Browser.Browser;

public class Home extends Browser{
	
	public static void clickRegister() throws Exception 
	{
	locators.Locators.homeRegisterLink().click();
	}
	
	public static void validateUrl() throws Exception
	{
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = readers.ReaderLocators.getData("homeurl");
		try {
			Assert.assertTrue((expectedUrl.equals(actualUrl)) ? true : false);
			System.out.println("Pass");
			}
		catch (AssertionError e) 
			{
			System.out.println(e);
			System.out.println("Fail");
			}
	}
	
}
