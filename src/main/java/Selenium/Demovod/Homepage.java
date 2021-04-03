package Selenium.Demovod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Pagebase {

	public Homepage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//span[contains(text(),'Log in')]")
	WebElement login;
	
	public void gotosignpage()
	{
		login.click();
	}
}
