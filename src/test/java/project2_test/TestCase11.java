package project2_test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project2_source.Booking_page_Spicejet;
import project2_source.Home_page_Spicejet;
import project2_source.Search_page_Spicejet;
@Listeners(utility_project2.Listener.class)
public class TestCase11 extends LaunchQuit
{
	//after clicking on book button in the search page, verify if user is able to enter every text fields present
	
	@Test
	public void passenger_info()
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
		s1.click_continue_button();
		
		Booking_page_Spicejet b1=new Booking_page_Spicejet(driver);
		b1.title_selection_dd();
		b1.title_selection();
		b1.FIRST_NAME();
		b1.LAST_NAME();
		b1.Mobile_No();
		b1.Email();
		b1.town_name();
		b1.passenger_info_checkbox();
		String searchbooking=driver.getCurrentUrl();
		Assert.assertEquals(searchbooking.contains("booking"), true, "not successful");
	}
}
