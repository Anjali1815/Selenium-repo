package seleniumproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask {
	
	ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	
	@Test
	
	public void test1()
	{
		driver.findElement(By.name("field-keywords")).sendKeys("mobiles");
		driver.findElement(By.xpath("//div[@id='nav-tools']/a[4]")).click();
		driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]/div")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abhvfdh@gmail");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.navigate().back(); 
		
		
	
		
	}
}
