package seleniumproject;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyContent {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		String actualcontent=driver.getPageSource();
		String expectedcontent="Gmail";
		
		if(actualcontent.contains(expectedcontent))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
	}

}
