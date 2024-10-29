package seleniumproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	
	ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Files/Alert.html");;
	}
	
	@Test
	
	public void alerthandle()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		//driver.switchTo().alert();
		
		Alert a=driver.switchTo().alert();
		String actual=a.getText();
		System.out.println(actual);
		
		if(actual.equals("Hello!I am an alert box!!"))
		{
			System.out.println("Pass");
		}
		
		else
		{
			System.out.println("fail");
		}
		
		
		a.accept();
		
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("dvhbh");
		
	}

}
