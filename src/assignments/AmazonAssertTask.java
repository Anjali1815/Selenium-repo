package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AmazonAssertTask {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void url()
	{
		//Open amazon site
		driver.get("https://www.amazon.in/");
		
	}
	
	@Test
	public void test()
	{
		
		//Search mobile phones
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		//Verify title
		String expectedtitle="Amazon.in : mobile phones";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		Assert.assertEquals(expectedtitle, actualtitle);
		
		//Click on first phone details
		//Click add to cart
		
		String parentwindow=driver.getWindowHandle();
		System.out.println("Parent window title "+driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		Set<String> allwindowhandles = driver.getWindowHandles();
		
		for(String handle:allwindowhandles)
		{
			System.out.println(handle);
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				driver.close();
				driver.switchTo().window(parentwindow);
				driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
				//Select cart
				
				
			}
		
			}
		
		}

}
