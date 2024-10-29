package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionsPgrm {
	
	// to do activities done by keyboard and mouse in selenium
	
	WebDriver driver;
	
	@BeforeTest
	public void setuo()
	{
		
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlopen()
	{
		
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");;
		
	}
	
	@Test
	public void test1()
	{
		
		WebElement fullname = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		
		fullname.sendKeys("abcd");
		
		WebElement rediffid = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		
		
		Actions act=new Actions(driver);
		
		act.keyDown(fullname, Keys.CONTROL).sendKeys("a").keyUp(fullname, Keys.CONTROL);
		act.keyDown(fullname, Keys.CONTROL).sendKeys("c").keyUp(fullname, Keys.CONTROL);
		act.keyDown(rediffid, Keys.CONTROL).sendKeys("v").keyUp(rediffid, Keys.CONTROL);
		
		
		act.build().perform();
		
		//or
		//act.perform();
		
		
		
		
		
		
	}

}
