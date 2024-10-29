package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatadrivenTestTask1 {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.saucedemo.com/v1/");
	}
	
	@Test
	public void test() throws IOException
	{
		File f=new File("E:\\data1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sht=wb.getSheet("Sheet1");
		System.out.println(sht.getLastRowNum());
		
		
		
		
		for(int i=1;i<sht.getLastRowNum();i++)
				{
			     
			        String username=sht.getRow(i).getCell(0).getStringCellValue();
			        System.out.println("username="+username);
			        
			        String password=sht.getRow(i).getCell(1).getStringCellValue();
			        System.out.println(password);
			        
			        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
			        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
			        driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
			        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
			        
			        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
			
			
				}
	}
	

}
