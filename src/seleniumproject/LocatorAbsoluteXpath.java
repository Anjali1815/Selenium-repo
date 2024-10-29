package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAbsoluteXpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:/www.facebook.com");
		//driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div/div[2]/div/div/form/div[1]/div/input"))
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hjduj");
	
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hgfhh");
	driver.findElement(By.xpath("//button[@name='login']")).click();
		
		

	}

}
