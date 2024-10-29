package seleniumproject;



import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class RediffGettext {
	
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
	
		WebElement button= driver.findElements(By.xpath("//*[@id=\"Register\"]"));
		
	
	}

}
