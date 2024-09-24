package project2_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project2_source.Home_page_Spicejet;
import project2_source.Logout_page_Spicejet;
import utility_project2.DDT1;
@Listeners(utility_project2.Listener.class)
public class TestCase12  extends LaunchQuit
{
	//login to spice  search the flight and logout
		@Test
		public void login_search_logout() throws InterruptedException, EncryptedDocumentException, IOException
		{
			Home_page_Spicejet h1=new Home_page_Spicejet(driver);
			h1.login();
			h1.email_radio_button();
			Thread.sleep(2000);
			DDT1 d1=new DDT1();
			d1.credentials1();
			h1.email_id();
			h1.password();
			Thread.sleep(2000);
			h1.login_button();
			Thread.sleep(3000);
			Assert.assertEquals(driver.getTitle(), "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", "not successful");
			
			/*Thread.sleep(3000);
			h1.source_city();
			h1.source_name();
			h1.destination_city();
			h1.destination_name();
			h1.date_forward_button();
			h1.date_select();
			h1.flight_search_button();
			Thread.sleep(5000);
			
			Logout_page_Spicejet l1= new Logout_page_Spicejet(driver);
			l1.logout_click();
			l1.logout_button();*/
		}
}
