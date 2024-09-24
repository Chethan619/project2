package project2_test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project2_source.Home_page_Spicejet;
import project2_source.Signup_page_Spicejet;
@Listeners(utility_project2.Listener.class)
public class TestCase1 extends LaunchQuit
{
	//verify that user can successfully register for a new account
	@Test(retryAnalyzer=utility_project2.Retry.class)
	public void SignUp() throws InterruptedException
	{
		Home_page_Spicejet h1=new Home_page_Spicejet(driver);
		h1.signup();
		h1.switchtochild(driver);
		
		Signup_page_Spicejet s1=new Signup_page_Spicejet(driver);
		s1.title_dropdown(driver);
		Thread.sleep(1000);
		s1.FirstName_TextField();
		Thread.sleep(1000);
		s1.LastName_TextField();
		Thread.sleep(1000);
		s1.country_dropdown(driver);
		Thread.sleep(1000);
		s1.Date_button();
		Thread.sleep(1000);
		s1.month_dropdown(driver);
		Thread.sleep(1000);
		s1.year_dropdown(driver);
		Thread.sleep(1000);
		s1.date_selection();
		Thread.sleep(1000);
		s1.mobile_no();
		Thread.sleep(1000);
		s1.email(driver);
		Thread.sleep(1000);
		s1.password(driver);
		Thread.sleep(1000);
		s1.con_password();
		Thread.sleep(1000);
		s1.checkbox();
		Thread.sleep(1000);
		s1.submit();	
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "SpiceClub - The frequent flyer program of SpiceJet", "not successful");
	}
}
