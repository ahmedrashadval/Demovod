package Selenium.Demovod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class tweet_neg extends Pagebase {

	public tweet_neg(WebDriver driver) {
		super(driver);
		
	}
	
	//@FindBy(css = "br[data-text='true']")
	//WebElement tweeting;
	
	@FindBy(xpath = "//div[contains(text(),'Something went wrong, but don’t fret — let’s give it another shot.')]")
	WebElement valmsg;
	
	public void tweetingval() {
		//	none.click();
		//	tweeting.sendKeys(t);
			boolean q = valmsg.isDisplayed();
			Assert.assertEquals(q, true);
				
		}
		

}
