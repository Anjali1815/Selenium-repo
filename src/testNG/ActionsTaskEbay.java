package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionsTaskEbay {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		
		driver=new ChromeDriver();
	}
	
	
	@BeforeMethod
	public void urlopen()
	
	{
		
		driver.get("https://www.ebay.com");
	}
	
	@Test
	public void test()
	{
		
		Actions act=new Actions(driver);
		
		WebElement elect = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		
		act.moveToElement(elect);
		act.perform();
		driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
		
		
	}

}
