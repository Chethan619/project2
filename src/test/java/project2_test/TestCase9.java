package project2_test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project2_source.Home_page_Spicejet;
@Listeners(utility_project2.Listener.class)
public class TestCase9 extends LaunchQuit
{
	// validate the systems ability to handle multiple passengers in a single booking
		@Test
		public void Multiple_Passenger() throws InterruptedException
		{
			Home_page_Spicejet h1=new Home_page_Spicejet(driver);
			h1.source_city();
			h1.source_name();
			h1.destination_city();
			h1.destination_name();
			h1.date_forward_button();
			h1.date_select();
			h1.passanger_dropdown();
			h1.adult_button();
			h1.children_button();
			h1.infant_button();
			h1.flight_search_button();
			Thread.sleep(2000);
			Assert.assertEquals(driver.getTitle(), "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", "not successful");
			
		}

}
