package project2_test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project2_source.Home_page_Spicejet;
@Listeners(utility_project2.Listener.class)
public class TestCase4 extends LaunchQuit
{
	//test the search functionality for one way flight
		@Test
		public void one_way_flight() throws InterruptedException
		{
			Home_page_Spicejet h1=new Home_page_Spicejet(driver);
			h1.source_city();
			Thread.sleep(2000);
			h1.source_name();
			Thread.sleep(2000);
			h1.destination_city();
			Thread.sleep(2000);
			h1.destination_name();
			Thread.sleep(2000);
			//h1.date_dropdown(); (Not require since after selecting destination automatically it gets open)
			h1.date_forward_button();
			Thread.sleep(2000);
			h1.date_select();
			Thread.sleep(2000);
			h1.flight_search_button();
			Thread.sleep(3000);
			String search=driver.getCurrentUrl();
			Assert.assertEquals(search.contains("departure"), true, "not successful");
		}
}
