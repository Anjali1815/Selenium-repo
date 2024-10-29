package seleniumproject;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle="Facebook – log in or sign up";
		
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		String actualcontent=driver.getPageSource();
		
		String expectedcontent="Log in";
		
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
