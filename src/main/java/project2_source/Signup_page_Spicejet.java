package project2_source;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Signup_page_Spicejet 
{
	ChromeDriver driver;
	
	@FindBy(xpath="//select[@class='form-control form-select ']")
	WebElement Title_Dropdown;
	@FindBy(id="first_name")
	WebElement FirstName_TextField;
	@FindBy(id="last_name")
	WebElement LastName_TextField;
	@FindBy(xpath="//select[@class='form-control form-select']")
	WebElement Country_Dropdown;
	
	@FindBy(id="dobDate")
	WebElement Date_Button;
	@FindBy(className="react-datepicker__month-select")
	WebElement Month_DropDown;
	@FindBy(className="react-datepicker__year-select")
	WebElement Year_DropDown;
	@FindBy(xpath="//div[.='23']")
	WebElement Date_Selection;
	
	@FindBy(xpath="//input[@class=' form-control']")
	WebElement MobileNo_TextField;
	@FindBy(id="email_id")
	WebElement Email_TextField;
	@FindBy(id="new-password")
	WebElement Password_TextField;
	@FindBy(id="c-password")
	WebElement C_Password_TextField;
	@FindBy(id="defaultCheck1")
	WebElement Check_Button;
	@FindBy(linkText="Submit")
	WebElement Submit_Button;
	
	
	
	public void title_dropdown(ChromeDriver driver)
	{
		Select s1=new Select(Title_Dropdown);
		s1.selectByVisibleText("Mr");	
	}
	public void FirstName_TextField()
	{
		FirstName_TextField.sendKeys("chethan");
	}
	public void LastName_TextField()
	{
		LastName_TextField.sendKeys("reddy");
	}
	public void country_dropdown(ChromeDriver driver)
	{
		Select s1=new Select(Country_Dropdown);
		s1.selectByValue("IN");
	}
	public void Date_button()
	{
		Date_Button.click();
	}
	public void month_dropdown(ChromeDriver driver)
	{
		Select s1=new Select(Month_DropDown);
		s1.selectByVisibleText("December");	
	}
	public void year_dropdown(ChromeDriver driver)
	{
		Select s1=new Select(Year_DropDown);
		s1.selectByVisibleText("1986");	
	}
	public void date_selection()
	{
		Date_Selection.click();
	}
	public void mobile_no()
	{
		MobileNo_TextField.sendKeys("9573416183");
	}
	public void email(ChromeDriver driver) throws InterruptedException
	{
		/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("email_id")));
		Email_TextField.sendKeys("rankin33399@gmail.com");*/
		Email_TextField.click();
		Thread.sleep(2000);
		Actions a1=new Actions(driver);
		a1.sendKeys(Email_TextField, "rankin33399@gmail.com").build().perform();
		
	}
	public void password(ChromeDriver driver) throws InterruptedException
	{
		Actions a1=new Actions(driver);
		Thread.sleep(4000);
		a1.click(Password_TextField).build().perform();
		Thread.sleep(4000);
		a1.sendKeys(Password_TextField, "Rankin@123").build().perform();
	}
	public void con_password() throws InterruptedException
	{
		Thread.sleep(4000);
		C_Password_TextField.sendKeys("Rankin@123");
	}
	public void checkbox()
	{
		Check_Button.click();
	}
	public void submit()
	{
		Submit_Button.click();
	}
	
	
	public Signup_page_Spicejet(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
