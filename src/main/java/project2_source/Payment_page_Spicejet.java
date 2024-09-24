package project2_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_page_Spicejet 
{
	ChromeDriver driver;
	
	@FindBy (xpath="//div[.='Apply Promo']")
	WebElement Promocode;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[4]")
	WebElement enterPromecode;
	
	@FindBy (xpath="//div[.='APPLY']")
	WebElement clickapplay;
	
	@FindBy(xpath="//iframe[@class='card_number_iframe']")
	WebElement card_number_iframe;	
	
	@FindBy(xpath="//iframe[@class='name_on_card_iframe']")
	WebElement card_holder_iframe;
	
	@FindBy(xpath="//iframe[@class='card_exp_month_iframe']")
	WebElement card_month_iframe;
	
	@FindBy(xpath="//iframe[@class='card_exp_year_iframe']")
	WebElement card_year_iframe;
	
	@FindBy(xpath="//iframe[@class='security_code_iframe']")
	WebElement card_cvv_iframe;
	
	@FindBy(id="card_number")
	WebElement Card_Number;
	
	@FindBy(id="name_on_card")
	WebElement Card_Holder_Name;
	
	@FindBy(id="card_exp_month")
	WebElement Expiry_Month;
	
	@FindBy(id="card_exp_year")
	WebElement Expiry_Year;
	
	@FindBy(id="security_code")
	WebElement CVV_Number;
	
	@FindBy(xpath="//div[.='Proceed to pay']")
	WebElement Proceed_To_Pay_Button;
	
	public void Click_Promo_code()
	{
		Promocode.click();
	}
	public void Enter_Prome_Code()
	{
		//driver.switchTo().frame(iframe);
		enterPromecode.sendKeys("dfkglt");
	}
	
	public void Click_apply_button(ChromeDriver driver)
	{
		clickapplay.click();
		driver.switchTo().defaultContent();
	}
	
	public void card_number(ChromeDriver driver)
	{
		driver.switchTo().frame(card_number_iframe);
		Card_Number.sendKeys("123443211234");
		driver.switchTo().defaultContent();
	}
	public void card_holder_name(ChromeDriver driver)
	{
		driver.switchTo().frame(card_holder_iframe);
		Card_Holder_Name.sendKeys("chethan reddy");
		driver.switchTo().defaultContent();
	}
	public void expiry_month(ChromeDriver driver)
	{
		driver.switchTo().frame(card_month_iframe);
		Expiry_Month.sendKeys("12");
		driver.switchTo().defaultContent();
	}
	public void expiry_year(ChromeDriver driver)
	{
		driver.switchTo().frame(card_year_iframe);
		Expiry_Year.sendKeys("27");
		driver.switchTo().defaultContent();
	}
	public void cvv_number(ChromeDriver driver)
	{
		driver.switchTo().frame(card_cvv_iframe);
		CVV_Number.sendKeys("123");
		driver.switchTo().defaultContent();
	}
	public void proceed_to_pay_button()
	{
		Proceed_To_Pay_Button.click();
	}
	
	public Payment_page_Spicejet(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
