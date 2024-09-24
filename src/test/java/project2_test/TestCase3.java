package project2_test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project2_source.Home_page_Spicejet;
@Listeners(utility_project2.Listener.class)
public class TestCase3 extends LaunchQuit
{
	//login with invalid credentials
		@Test
		public void Login_invalid() throws InterruptedException
		{
			Home_page_Spicejet h1=new Home_page_Spicejet(driver);
			h1.login();
			h1.mobile_no();
			h1.invalid_password();
			Thread.sleep(2000);
			h1.login_button();
			Assert.assertEquals(driver.getTitle(), "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", "not successful");
		}
}
