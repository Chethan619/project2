package project2_test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project2_source.Home_page_Spicejet;
@Listeners(utility_project2.Listener.class)
public class TestCase14 extends LaunchQuit
{
	//check if user is able to search domestic round trip flight
		@Test
		public void Domestic_RoundTrip() throws InterruptedException
		{
			Home_page_Spicejet h1=new Home_page_Spicejet(driver);
			h1.round_trip_radio_button();
			h1.source_city();
			h1.source_name();
			h1.destination_city();
			h1.destination_name();
			//h1.date_dropdown();
			h1.date_select();
			h1.date_forward_button();
			h1.return_date();
			h1.flight_search_button();
			Thread.sleep(3000);
			String search=driver.getCurrentUrl();
			Assert.assertEquals(search.contains("departure"), true, "not successful");
		}
}
