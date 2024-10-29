package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTestNG {
	
	@Parameters("a")
	@Test
	public void main(String v)
	{
		System.out.println("Value is:"+v);
	}
	

}
