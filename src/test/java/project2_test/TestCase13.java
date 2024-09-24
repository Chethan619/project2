package project2_test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import project2_source.Addon_page_Spicejet;
import project2_source.Booking_page_Spicejet;
import project2_source.Home_page_Spicejet;
import project2_source.Payment_page_Spicejet;
import project2_source.Search_page_Spicejet;
@Listeners(utility_project2.Listener.class)
public class TestCase13 extends LaunchQuit
{
	//check if user is able to apply coupon code while ordering the product
		@Test
		public void Coupon_Code() throws InterruptedException
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
			Thread.sleep(2000);
			b1.passenger_info_checkbox();
			b1.payment_page_continue_button();
			
			Addon_page_Spicejet a1=new Addon_page_Spicejet(driver);
			Thread.sleep(2000);
			a1.click_continue(driver);
			Thread.sleep(2000);
			
			Payment_page_Spicejet p1=new Payment_page_Spicejet(driver);
			Thread.sleep(2000);
			p1.Click_Promo_code();
			Thread.sleep(1000);
			p1.Enter_Prome_Code();
			Thread.sleep(1000);
		    p1.Click_apply_button(driver);
		    Thread.sleep(3000);
		    String searchcoupon=driver.getCurrentUrl();
			Assert.assertEquals(searchcoupon.contains("prepayment"), true, "not successful");
		}

}
