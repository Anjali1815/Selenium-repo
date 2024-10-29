package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorName {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		
		//driver.findElement(By.name("csi")).click();
		

	}

}
