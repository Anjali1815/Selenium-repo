package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBlogin {
	
	// POM prgrm using page factory
	
	WebDriver driver;
	
	@FindBy(id="email")WebElement fbemail;
	@FindBy(id="pass")WebElement fbpassword;
	@FindBy(name="login")WebElement fblogin;
	
	public FBlogin(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void setvalues(String email,String password)
	{
		fbemail.sendKeys(email);
		fbpassword.sendKeys(password);
		
		
	}
	
	public void login()
	{
		fblogin.click();
	}

}
