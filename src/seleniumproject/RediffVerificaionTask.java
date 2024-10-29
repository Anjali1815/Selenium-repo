package seleniumproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffVerificaionTask {
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
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		boolean d=logo.isDisplayed() ;
		//OR  We can write 1single line instead of above 2 lines
		//boolean d=driver.findElement(By.xpath("//*[@id=\\\"wrapper\\\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		
		if(d)
		{
			System.out.println("Is displayed");
		}
		else
		{
			System.out.println("Not displayed");
		}
		
		
		boolean c = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
		
		if(c)
		{
			System.out.println("Check box is selected");
		}
		else
		{
			System.out.println("Checkbox not selected");
		}
		
		boolean e=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]")).isSelected();
		
		if(e)
		{
			System.out.println("Gender radio button is selected");
		}
		else
		{
			System.out.println("Radio button is not selected");
		}
		
	}
	
	

}
