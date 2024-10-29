package seleniumproject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo {
	
	
	
	@BeforeTest
	public void setup()
	{
		
		System.out.println("open browser");
		
	}
	
	
	@BeforeMethod
	public void url()
	{
		
		System.out.println("open url");
	}
	
	@Test(priority=3)
	
	public void test1()
	{
		System.out.println("Test1");
		
	}
	
	
	@Test(priority=2,invocationCount=2,dependsOnMethods= {"test1"})  //due to Invocation count set as 2 test 2 will execute twice
	public void test2()                                              //Due to dependsONMethod set test 1, test 2 will execute only after test1
	{
		                                                             //Priority is provided to set order of execution
		System.out.println("test 2");
	}
	
	
	@Test(priority=1,enabled=false)           //Due to enabled=false test 3 will be skipped or excluded from execution
	public void test3()
	{
		System.out.println("test 3");
		
	}
	
	@AfterMethod
	public void report()
	{
		
		System.out.println("report");
	}
	
	@AfterTest
	public void browserclose()
	{
		
		System.out.println("Browser close");
	}

}
