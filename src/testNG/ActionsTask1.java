package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionsTask1 {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		
		driver=new ChromeDriver();
		
	}
	
	
	@BeforeMethod
	public void urlopen()
	{
		
		driver.get("https://demoqa.com/droppable");
	}
	
	@Test
	public void test1()
	{
		
		WebElement dragme = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		
		WebElement drophere = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions act=new Actions(driver);
		
		//act.clickAndHold(dragme).moveToElement(drophere);
		
		act.dragAndDrop(dragme, drophere);
		act.perform();
		
		String actualtext=drophere.getText();
		
		if(actualtext.equals("Dropped!"))
		{
			System.out.println("pass");
			
		}
		
		else
		{
			
			System.out.println("fail");
		}
		
		
		
		
		
		
		
		
	}

}
