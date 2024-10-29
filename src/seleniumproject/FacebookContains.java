package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookContains {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
				driver.get("https:/www.facebook.com");
				
				driver.findElement(By.xpath("//*[contains(@id,'u_0_5')]")).click();  //using contains
				
				// By using ChroPath
				//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ahdvjd");
			//	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abdgh");
		
		

	}

}
