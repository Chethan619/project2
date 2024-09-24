package project2_test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project2_source.Home_page_Spicejet;
@Listeners(utility_project2.Listener.class)
public class TestCase6 extends LaunchQuit
{
		@Test
		public void senior_citizen() throws InterruptedException
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
			h1.date_select();
			Thread.sleep(2000);
			h1.senior_citizen_radio_button();
			Thread.sleep(2000);
			h1.flight_search_button();
			Thread.sleep(2000);
			h1.senior_discount_popup();
			Thread.sleep(2000);
			h1.continue_button();
		}
}
