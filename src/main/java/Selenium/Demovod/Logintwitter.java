package Selenium.Demovod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logintwitter extends Pagebase {

	public Logintwitter(WebDriver driver) {
		super(driver);
		
	}
	


	@FindBy(xpath = "//input[@type='text']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[2]/form/div/div[3]/div/div/span/span")
	WebElement loginbtn;
	
	public void logininfor(String Username, String Password) {
		
		username.sendKeys(Username);
		password.sendKeys(Password);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		loginbtn.click();
		
	}
}
