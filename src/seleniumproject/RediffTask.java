package seleniumproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffTask {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void Test1()
	{
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("abcdefg");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("abcd@gamil.com");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
		driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys("abcdefg");
		driver.findElement(By.xpath("//input[@id='newpasswd1']")).sendKeys("abcdefg");
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]/input")).sendKeys("abghdb@gnkjj");
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]/div[3]/input")).sendKeys("98767489");
		driver.findElement(By.xpath("//table/tbody/tr[22]/td[3]/select[1]")).click();
		driver.findElement(By.xpath("//table/tbody/tr[22]/td[3]/select[1]")).sendKeys("10");
		driver.findElement(By.xpath("//table/tbody/tr[22]/td[3]/select[2]")).click();
		driver.findElement(By.xpath("//table/tbody/tr[22]/td[3]/select[1]")).sendKeys("JUN");
		driver.findElement(By.xpath(""))
	}

}
