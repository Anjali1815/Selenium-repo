package testNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileuploadPgrm {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlopen()
	{
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");		
	}
	
	@Test
	public void test() throws Exception
	{
		
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		fileUpload("E:\\Testing levels.pdf");
	}
	
	public void fileUpload(String p) throws AWTException
	{
		
		// To copy path to clipboard
		
		StringSelection strSelection=new StringSelection(p);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		
		//To paste into system window
		
		Robot robot=new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
