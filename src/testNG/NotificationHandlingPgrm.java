package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NotificationHandlingPgrm {

	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		
		ChromeOptions options=new ChromeOptions();            //To handle notifications
		options.addArguments("--disable-notifications");
		
		driver=new ChromeDriver(options);
	}
	
	@BeforeMethod
	public void url()
	{
		
		driver.get("https://www.justdial.com/");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"main-auto\"]")).sendKeys("nvhhj");
	}
}
