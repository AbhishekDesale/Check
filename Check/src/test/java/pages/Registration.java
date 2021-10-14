package pages;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;

import Browser.Browser;

public class Registration extends Browser{
	
	public static void enterFirstName(int row, int column) throws Exception 
	{
		locators.Locators.registrationFirstNameTextbox().sendKeys(readers.ReaderExcel.readExcel(row, column));
	}
	public static void enterLastName(int row, int column) throws Exception 
	{
		locators.Locators.registrationLastNameTextbox().sendKeys(readers.ReaderExcel.readExcel(row, column));
	}
    public static void enterEmailId(int row, int column) throws Exception 
    {
    	locators.Locators.registrationEmailIdTextbox().sendKeys(readers.ReaderExcel.readExcel(row, column));
    }
    public static void enterPassword(int row, int column) throws Exception
    {
    	locators.Locators.registrationPasswordTextbox().sendKeys(readers.ReaderExcel.readExcel(row, column));
    }
    public static void enterConfirmPassword(int row, int column) throws Exception
    {
    	locators.Locators.registrationConfirmPasswordTextbox().sendKeys(readers.ReaderExcel.readExcel(row, column));
    }
    public static void clickRegisterButton() throws Exception 
    {
    	locators.Locators.registrationRegisterButton().click();
    }
    public static void validateUrlRegister()
	{
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "http://demowebshop.tricentis.com/register";
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
    public static void validateUrlHome()
   	{
   		String actualUrl = driver.getCurrentUrl();
   		String expectedUrl = "http://demowebshop.tricentis.com";
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
      
    public static void invalidemailHome()
   	{
   		String actual = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/span[2]/span")).getText();
   		String expected = "Wrong email";
   		System.out.println(actual);
   		System.out.println(expected);
   		try {
   			Assert.assertTrue((expected.equals(actual)) ? true : false);
   			System.out.println("Pass");
   			}
   		catch (AssertionError e) 
   			{
   			System.out.println(e);
   			System.out.println("Fail");
   			}
   	}
    
    public static void invalidpasswordHome()
   	{
   		String actual = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/span[2]/span")).getText();
   		String expected = "The password should have at least 6 characters.";
   		System.out.println(actual);
   		System.out.println(expected);
   		try {
   			Assert.assertTrue((expected.equals(actual)) ? true : false);
   			System.out.println("Pass");
   			}
   		catch (AssertionError e) 
   			{
   			System.out.println(e);
   			System.out.println("Fail");
   			}
   	}
    public static void mismatchpasswordHome()
   	{
   		String actual = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/span[2]/span")).getText();
   		String expected = "The password and confirmation password do not match.";
   		System.out.println(actual);
   		System.out.println(expected);
   		try {
   			Assert.assertTrue((expected.equals(actual)) ? true : false);
   			System.out.println("Pass");
   			}
   		catch (AssertionError e) 
   			{
   			System.out.println(e);
   			System.out.println("Fail");
   			}
   	}
   

}
