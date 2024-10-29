package testNG;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RishiherbalTask {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void url()
	{
		
		driver.get("https://rishiherbalindia.linker.store/");
	}
	
	@Test
	public void test() throws IOException
	{
		
		//Register
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("sbhhdh@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Abcd@123");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"register-model-signin-link\"]")).click();
		
		//Login
		
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Abcd@123");
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
		
		
		driver.navigate().refresh();
		
		//Serch Herbal agro growth booster in searchbar
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Herbal agro growth booster");
		
		
		//Click add to wishlist and add that product to your wishlist
		
		driver.findElement(By.xpath("//*[@id=\"searchDDWrp\"]/ul/div[4]/div/div/li[1]/div/div[2]/div/a")).click();
		
		//Click on link skin and add aloe fairness cream to your wishlist
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();  
		
		WebElement aloe = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img"));
		Actions act=new Actions(driver);
		act.moveToElement(aloe).perform();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button/span")).click();
		
		//Click All link.Then click health link, after that click safety link one after other.
		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
		
		//Scroll down to the bottom of the page and click 'about us'.
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")));
		
		driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click(); 
		
		//Take screenshot of element privacy policy
		
		WebElement ss = driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[4]/div/ul/li[1]/a"));
		File privacyelement=ss.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(privacyelement,new File("./Screenshot//privacyelement.png"));
		
		//Check the response code of the link
		
		URL ob=new URL("https://rishiherbalindia.linker.store/");
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		}

}
