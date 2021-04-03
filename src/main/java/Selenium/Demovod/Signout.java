package Selenium.Demovod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signout extends Pagebase {

	public Signout(WebDriver driver) {
		super(driver);
		
	}
@FindBy(xpath="//*[@id=\"react-root\"]/div/div/div[2]/header/div/div/div/div[2]/div/div/div[1]/div/div[2]")
WebElement pofpic;

@FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/a[2]/div[1]/div")
WebElement signoutbtn;

@FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div[3]/div[2]/div/span/span")
	WebElement finallogoutbtn;

public void logout() {
	
	pofpic.click();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	signoutbtn.click();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	finallogoutbtn.click();
	
}
	
	
}
