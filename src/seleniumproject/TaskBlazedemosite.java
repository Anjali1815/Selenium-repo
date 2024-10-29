package seleniumproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskBlazedemosite {
	
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/register");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("abcdefgh");
		driver.findElement(By.name("company")).sendKeys("sfhvhh");
		driver.findElement(By.id("email")).sendKeys("abcdef@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abcdefgh");
		driver.findElement(By.xpath("//input[@id='password-confirm']")).sendKeys("abcdefgh");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
		
	

}
