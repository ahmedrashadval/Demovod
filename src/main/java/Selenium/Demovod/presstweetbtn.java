package Selenium.Demovod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class presstweetbtn extends Pagebase {

	public presstweetbtn(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(css = "div[data-testid='tweetButtonInline']")
	WebElement Tweetbtn;
	
	boolean q;
	
	public void tweetbtnval(boolean s) {
		
		q=Tweetbtn.isSelected();		
		
		if (s == true) {
			Tweetbtn.click();
}
		else {
			//driver.switchTo().alert();
			Assert.assertEquals(q, s);;
		}
		
		
	}
	
	
}
