package seleniumproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTask {
	
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}
	
	
	@Test
	
	public void alert()
	{
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		
		Alert a=driver.switchTo().alert();
		
		String actual=a.getText();
		
		if(actual.equals("I am a JS Alert"))
		{
			
			System.out.println("pass");
		}
		
		else
		{
			
			System.out.println("fail");
		}
		
		a.accept();
		
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Alert b=driver.switchTo().alert();
		b.dismiss();
		
		
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		
		
		//Method 1 to pass value in prompt box
		
		Alert c=driver.switchTo().alert();
		c.sendKeys("jhvbhk");
		c.accept();
		
		// method 2
		
	/*	driver.switchTo().alert().sendKeys("asfsdf");
		driver.switchTo().alert().accept();   */
		
	    
	}

}
