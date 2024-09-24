package project2_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addon_page_Spicejet 
{
	ChromeDriver driver;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-poiln3 r-1gkfh8e r-1kfrs79 r-1d4mawv'])[2]")
	WebElement clickaddon;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-bnwqim r-73glhw']//*[name()='svg']//*[name()='g' and @id='OneWay']//*[name()='g' and @id='Flight-Results-One-Way---Fare-Details']//*[name()='g' and @id='Group-2']//*[name()='g' and @id='Group-7']//*[name()='g' and @id='Group-6']//*[name()='path' and @id='right-chveron']")
	WebElement seatselection;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1loqt21 r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr'])[11]")
	WebElement seatselection1;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1loqt21 r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr'])[15]")
	WebElement seatselection2;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1loqt21 r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr'])[21]")
	WebElement seatselection3;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-15bsvpr r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement clickdone;
	
	@FindBy(xpath="//div[.='Continue']")
	WebElement clickcontinue;
	
	@FindBy(tagName="iframe")
	WebElement iframe1;
	
	@FindBy(xpath="(//div[.='Continue'])[6]")
	WebElement Continue_Button;
	@FindBy(id="destination_publishing_iframe_spicejet_0")
	WebElement iFrame1;
	
	@FindBy(id="at_addon_close_icon")
	WebElement Pop_up1;
	
	public void click_add_on()
	{
		clickaddon.click();
	}
	
	public void seat_selection()
	{
		seatselection.click();
	}
	
	public void seat_selection1()
	{
		seatselection1.click();
	}
	public void seat_selection2()
	{
		seatselection2.click();
	}
	public void seat_selection3()
	{
		seatselection3.click();
	}
	
	public void click_done()
	{
		clickdone.click();
	}
	public void click_continue(ChromeDriver driver)
	{
		
		clickcontinue.click();
	}
	
	public void continue_button()
	{
		Continue_Button.click();	
	}
	public void iframe1(ChromeDriver driver)
	{
		driver.switchTo().frame(iFrame1);
	}
	public void pop_up1()
	{
		Pop_up1.click();
	}
	
	public Addon_page_Spicejet(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
