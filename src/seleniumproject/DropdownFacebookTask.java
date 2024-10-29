package seleniumproject;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownFacebookTask {
	
	ChromeDriver driver;
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://upload.facebook.com/reg/");
	}
	
	@Test
	public void facebookdropdowntest()
	{
		WebElement Day=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select selectday=new Select(Day);
		selectday.selectByValue("10");
		List<WebElement> Days = selectday.getOptions();
		System.out.println(Days.size());
		
		
		
		WebElement Month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select selectmonth=new Select(Month);
		selectmonth.selectByIndex(5);
		List<WebElement> Months = selectmonth.getOptions();
		System.out.println(Months.size());
		
		
		
		WebElement Year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select selectyear=new Select(Year);
		selectyear.selectByVisibleText("1997");
		List<WebElement> Years = selectyear.getOptions();
		System.out.println(Years.size());
	}

}
