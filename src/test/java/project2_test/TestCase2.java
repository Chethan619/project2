package project2_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project2_source.Home_page_Spicejet;
import utility_project2.DDT1;
@Listeners(utility_project2.Listener.class)
public class TestCase2 extends LaunchQuit
{
	//validate login functionality with valid credentials
		@Test
		public void Login() throws InterruptedException, EncryptedDocumentException, IOException
		{
			DDT1 d1=new DDT1();
			d1.credentials1();
			Home_page_Spicejet h1=new Home_page_Spicejet(driver);
			h1.login();
			h1.email_radio_button();
			h1.email_id();
			h1.password();
			Thread.sleep(2000);
			h1.login_button();
			Thread.sleep(2000);
			Assert.assertEquals(driver.getTitle(), "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", "not successful");
		}
}
