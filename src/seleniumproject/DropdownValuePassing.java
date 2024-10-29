package seleniumproject;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownValuePassing {
	
	ChromeDriver driver;
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test()
	{
		WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select selectday=new Select(day);
		selectday.selectByValue("02");
		List<WebElement> days = selectday.getOptions();
		System.out.println(days.size());
		
		
		WebElement Month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select selectmonth=new Select(Month);
		selectmonth.selectByIndex(3);
		List<WebElement> Months = selectmonth.getOptions();
		System.out.println(Months.size());
		
		WebElement Year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select selectyear=new Select(Year);
		selectyear.selectByVisibleText("2024");
		List<WebElement> Years = selectyear.getOptions();
		System.out.println(Years.size());
	}

}
