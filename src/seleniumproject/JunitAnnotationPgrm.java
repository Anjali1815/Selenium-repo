package seleniumproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitAnnotationPgrm {
	
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		}
	
	@Test
	public void testtitle()
	{
		String actualtitle=driver.getTitle();
		String expectedtitle="Google";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	
	}
	@Test
	public void testcontent()
	{
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
	@Test
	public void testcontent1()
	{
		String actualcontent=driver.getTitle();
		String expectedcontent="Images";
		if(actualcontent.contains(expectedcontent))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	@After
	public void browserclose()
	{
		driver.close();
	}
	

}
