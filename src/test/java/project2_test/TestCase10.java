package project2_test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project2_source.Home_page_Spicejet;
import project2_source.Search_page_Spicejet;
@Listeners(utility_project2.Listener.class)
public class TestCase10 extends LaunchQuit
{
	// Validate the flight information, fare details, baggage rules and cancellations link has the details in the search result page.
	
		@Test
		public void Flight_Details() throws InterruptedException
		{
			Home_page_Spicejet h1=new Home_page_Spicejet(driver);
			h1.source_city();
			h1.source_name();
			h1.destination_city();
			h1.destination_name();
			h1.date_forward_button();
			h1.date_select();
			h1.flight_search_button();
			
			Search_page_Spicejet s1=new Search_page_Spicejet(driver);
			Thread.sleep(4000);
			s1.click_Flight_Details_Dropdown(driver);
			Thread.sleep(2000);
			s1.scroll_flightinfo(driver);
			Thread.sleep(2000);
			s1.click_baggagelink();
			Thread.sleep(2000);
			s1.click_cancellationlink();
			Thread.sleep(2000);
			s1.click_continue_button();
			Thread.sleep(3000);
			String searchresult=driver.getCurrentUrl();
			Assert.assertEquals(searchresult.contains("booking"), true, "not successful");
		}
}
