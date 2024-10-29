package seleniumproject;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FacebookScreenshot {
	
	ChromeDriver driver;
	
	
	
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test() throws Exception
	
	
	{
	//	File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	FileHandler.copy(Screenshot,new File("E:\\facbk.png"));
		
		
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"u_0_5_N/\"]"));
		
		File src=login.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("./Screenshot/login.png"));
		
	}

}
