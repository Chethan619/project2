package project2_test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project2_source.Addon_page_Spicejet;
import project2_source.Booking_page_Spicejet;
import project2_source.Home_page_Spicejet;
import project2_source.Search_page_Spicejet;
@Listeners(utility_project2.Listener.class)
public class TestCase8 extends LaunchQuit
{
	//check for seat selection during the booking process
	@Test
	public void additional_Details() throws InterruptedException
	{
		Home_page_Spicejet h1=new Home_page_Spicejet(driver);
		h1.source_city();
		h1.source_name();
		h1.destination_city();
		h1.destination_name();
		h1.date_forward_button();
		h1.date_select();
		h1.flight_search_button();
		h1.search_continue_button();
		
		Booking_page_Spicejet b1=new Booking_page_Spicejet(driver);
		b1.title_selection_dd();
		b1.title_selection();
		b1.FIRST_NAME();
		b1.LAST_NAME();
		b1.Mobile_No();
		b1.Email();
		b1.town_name();
		Thread.sleep(2000);
		b1.passenger_info_checkbox();
		b1.payment_page_continue_button();
		
		Thread.sleep(5000);
		
		Addon_page_Spicejet a1=new Addon_page_Spicejet(driver);
		a1.click_add_on();
		//addon.seat_selection();
		a1.seat_selection1();
		Thread.sleep(2000);
		a1.click_done();
		Thread.sleep(4000);
		//a1.click_continue(driver);
		String searchaddon=driver.getCurrentUrl();
		Assert.assertEquals(searchaddon.contains("addons"), true, "not successful");
	}
}
