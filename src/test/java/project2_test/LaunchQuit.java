package project2_test;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utility_project2.Listener;

public class LaunchQuit extends Listener
{
	//ChromeDriver driver;
	@BeforeMethod
	public void Launch()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	@AfterMethod
	public void Quit() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
